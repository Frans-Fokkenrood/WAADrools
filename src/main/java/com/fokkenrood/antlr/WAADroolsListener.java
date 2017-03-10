package com.fokkenrood.antlr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;

import com.fokkenrood.antlr.RegelSpraakParser.InvoerContext;
import com.fokkenrood.antlr.RegelSpraakParser.RegelContext;
import com.fokkenrood.antlr.RegelSpraakParser.StatementsContext;
import com.fokkenrood.antlr.RegelSpraakParser.TestcaseContext;
import com.fokkenrood.antlr.RegelSpraakParser.TestgevalContext;
import com.fokkenrood.antlr.RegelSpraakParser.ToekennenContext;
import com.fokkenrood.drools.VertaalTabelLezer;


public class WAADroolsListener extends RegelSpraakBaseListener {
	private boolean							VERBOSE			= true;
	private Calendar						TODAY			= Calendar.getInstance();
	private VertaalTabelLezer				vertaler		= new VertaalTabelLezer();
//	private Stack<String>					stackAndOr		= new Stack<String>();
	private HashMap<String, ArrayList<String>> testcases 	= new HashMap<String, ArrayList<String>>();
	private StringBuilder					drlWhen			= new StringBuilder();
	private StringBuilder					drlThen			= new StringBuilder();
	private StringBuilder					javaCase		= new StringBuilder();
	private BufferedWriter 					writer			= null;

	//	CONSTRUCTOR:
	public WAADroolsListener() {
		TODAY.set(2017, 1, 16);				// Datum voor digitaal Tijdreizen: YYYY, (MM=0-11), (DD=1-31)
	}	// end constructor

	
	@Override
	public void enterStatements(StatementsContext ctx) {
		System.out.println("Start vertaling ProfielSpraak naar Drools DRL:");
		System.out.println("------------------------------------------------");	
		System.out.println("- Datum voor digitaal Tijdreizen is '"
					+ new SimpleDateFormat("dd-MM-yyyy").format(TODAY.getTime()) + "'\n");
		vertaler.openWerkboek("data\\VertaalTabel.xls", TODAY, VERBOSE);
	}	// end enterStatements

	
	@Override
	public void exitStatements(StatementsContext ctx) {
		schrijfTestSuites();
		vertaler.sluitWerkboek();
		System.out.println("------------------------------------------------");
		System.out.println("Einde vertaling!");
	}	// end exitStatements

	
	@Override
	public void enterRegel(RegelContext ctx) {
		verbosePrint("- transformeren regel '" + ctx.rg.getText() + "' uit regelset '" + ctx.rs.getText() + "'");
		drlWhen.setLength(0);
		drlWhen.append("package com.fokkenrood.");
		drlWhen.append(ctx.rs.getText());
		drlWhen.append("\n\n");
		drlWhen.append("import com.fokkenrood.drools.Werknemer;\n");
		drlWhen.append("import com.fokkenrood.drools.Werkgever;\n");
		drlWhen.append("import com.fokkenrood.drools.Arbeidsovereenkomst;\n");
		drlWhen.append("\n");
		drlWhen.append("rule \"");
		drlWhen.append(ctx.rg.getText());
		drlWhen.append("\"\n");
		drlWhen.append("  when\n");
		drlThen.setLength(0);
		drlThen.append("  then\n");
	}	// end enterRegel


	@Override
	public void exitRegel(RegelContext ctx) {
		drlThen.append("end\n");
		try {
			writer = new BufferedWriter(new FileWriter(new File(
				"src\\main\\resources\\regels" + ctx.rs.getText() + "\\" + ctx.rg.getText() + ".drl")));
			writer.write(drlWhen.toString());
			writer.write(drlThen.toString());
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}	// end exitRegel

	
	@Override
	public void enterTestcase(TestcaseContext ctx) {
		verbosePrint("- transformeren testcase '" + ctx.tc.getText() + "' uit regelset '" + ctx.rs.getText() + "'");
		ArrayList<String> list = testcases.get(ctx.rs.getText());
		if (list == null) { list = new ArrayList<String>(); }
		list.add(ctx.tc.getText());
		testcases.put(ctx.rs.getText(), list);
		
		javaCase.setLength(0);
		//	Imports:
		javaCase.append("package com.fokkenrood.testcases." + ctx.rs.getText() + ";\n\n");
		javaCase.append("import static org.junit.Assert.assertTrue;\n\n");
		javaCase.append("import java.text.ParseException;\n");
		javaCase.append("import java.text.SimpleDateFormat;\n");
		javaCase.append("import java.util.Calendar;\n\n");
		javaCase.append("import org.junit.Test;\n\n");
		javaCase.append("import org.kie.api.KieServices;\n");
		javaCase.append("import org.kie.api.runtime.KieContainer;\n");
		javaCase.append("import org.kie.api.runtime.KieSession;\n\n");
		javaCase.append("<[[Werknemer]]>import com.fokkenrood.drools.Werknemer;\n");
		javaCase.append("<[[Werkgever]]>import com.fokkenrood.drools.Werkgever;\n");
		javaCase.append("<[[Werkgever]]>import com.fokkenrood.drools.Arbeidsovereenkomst;\n");
		javaCase.append("\n");
		//	Testcases class definition:
		javaCase.append("public class ");
		javaCase.append(ctx.tc.getText());
		javaCase.append(" {\n");
		javaCase.append("\tprivate int\t\t\t\t\t\tcount\t\t= -1;\n");
		javaCase.append("\tprivate Calendar\t\t\t\tTODAY\t\t= Calendar.getInstance();\n");
		javaCase.append("\tprivate KieServices\t\t\t\tks\t\t\t= null;\n");
		javaCase.append("\tprivate KieContainer\t\t\tkc\t\t\t= null;\n");
		javaCase.append("\tprivate KieSession\t\t\t\tksession\t= null;\n\n");
		//	Constructor:
		javaCase.append("\tpublic ");
		javaCase.append(ctx.tc.getText());
		javaCase.append("() {\n");
		javaCase.append("\t\tTODAY.set(" + TODAY.get(Calendar.YEAR)
				+ ", " + TODAY.get(Calendar.MONTH) + ", " + TODAY.get(Calendar.DAY_OF_MONTH) + ");\n");
		javaCase.append("\t\tks = KieServices.Factory.get();\n");
		javaCase.append("\t\tkc = ks.getKieClasspathContainer();\n");
		javaCase.append("\t\tksession = kc.newKieSession(\"session");
		javaCase.append(ctx.rs.getText());
		javaCase.append("\");\n");
		javaCase.append("\t}\t// end constructor\n\n");		
	}	// end enterTestcase


	@Override
	public void exitTestcase(TestcaseContext ctx) {
		javaCase.append("}\t// end class");
		int p = javaCase.indexOf("<[[");
		while (p > 0) {
			javaCase.delete(p, (javaCase.indexOf("\n", p) + 1));
			p = javaCase.indexOf("<[[");
		}	// end while
		try {
			writer = new BufferedWriter(new FileWriter(new File(
				"src\\main\\java\\com\\fokkenrood\\testcases\\" + ctx.rs.getText() + "\\" + ctx.tc.getText() + ".java")));
			writer.write(javaCase.toString());
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}	// end exitTestcase


	@Override
	public void enterTestgeval(TestgevalContext ctx) {
		javaCase.append("\t@Test\n");
		javaCase.append("\tpublic void ");
		javaCase.append(ctx.tg.getText());
		javaCase.append("() throws ParseException {\n");
	}	// end enterTestgeval


	@Override
	public void exitTestgeval(TestgevalContext ctx) {
		javaCase.append("\t\tcount = ksession.fireAllRules();\n");
		javaCase.append("\t\tksession.dispose();\n");
		javaCase.append("\t\tassertTrue(\"");
		javaCase.append(ctx.not == null ? "Geen enkele" : "Een");
		javaCase.append(" regel heeft gevuurd\", count ");
		javaCase.append(ctx.not == null ? ">" : "==");
		javaCase.append(" 0);\n");
		javaCase.append("\t}\t // end ");
		javaCase.append(ctx.tg.getText());
		javaCase.append("\n\n");
	}	// end exitTestgeval

	

	@Override
	public void enterInvoer(InvoerContext ctx) {
		String object = ctx.obj.getText().substring(0, 1).toUpperCase() + ctx.obj.getText().substring(1);
		int p = javaCase.indexOf("<[[" + object);
		if (p > 0) { javaCase.delete(p, (p + object.length() + 6)); }
		javaCase.append("\t\t");
		javaCase.append(object);
		javaCase.append(" ");
		javaCase.append(ctx.obj.getText());
		javaCase.append(" = new ");
		javaCase.append(object);
		javaCase.append("();\n");	
	}	// end enterInvoer


	@Override
	public void exitInvoer(InvoerContext ctx) {
		javaCase.append("\t\tksession.insert(");	
		javaCase.append(ctx.obj.getText());	
		javaCase.append(");\n");
		javaCase.append("\n");
	}	// end exitInvoer


	@Override
	public void exitToekennen(ToekennenContext ctx) {
		String waarde = ctx.w.value;
		String feit = vertaler.zoekFeit("FEITEN", ctx.f.signifier);
		javaCase.append("\t\t");
		javaCase.append(ctx.obj);
		javaCase.append(".set");		
		javaCase.append(feit.substring(0, 1).toUpperCase());
		javaCase.append(feit.substring(1));
		javaCase.append("(");
		if (waarde.startsWith("@@")) {
			javaCase.append("new SimpleDateFormat(\"dd-MM-yyyy\").parse(\"");
			javaCase.append(ctx.w.getText());
			javaCase.append("\")");	
		} else {
			javaCase.append(waarde);	
		}	// end if
		javaCase.append(");\n");
}	// end exitToekennen


	//	Private functions:
	//	==================
	private void verbosePrint(String message) {
		if (VERBOSE) { System.out.println(message); }
	}	// end verbosePrint

	private void schrijfTestSuites() {
		for (Entry<String, ArrayList<String>> entry : testcases.entrySet()) {
			try {
				writer = new BufferedWriter(new FileWriter(new File(
					"src\\main\\java\\com\\fokkenrood\\testcases\\" + entry.getKey() + "\\JUnitTestSuite.java")));
				writer.write("package com.fokkenrood.testcases." + entry.getKey() + ";\n\n");
				writer.write("import org.junit.runner.RunWith;\n");
				writer.write("import org.junit.runners.Suite;\n\n");
				writer.write("@RunWith(Suite.class)\n");
				writer.write("@Suite.SuiteClasses({\n");
				boolean first = true;
				for (String name : entry.getValue()) {
					writer.write((first ? "\t" : ",\t") + name + ".class\n");	
					first = false;
				}	// end for
				writer.write("})\n");
				writer.write("public class JUnitTestSuite {\n");
				writer.write("}");
				writer.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	// end for
	}	// end schrijfTestSuites
	
}	// end class
