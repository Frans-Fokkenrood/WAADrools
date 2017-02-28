package com.fokkenrood.testcases.WetAanpassingArbeidsduur;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Werkgever;
import com.fokkenrood.drools.Werknemer;

public class XXXXXX_TC {
	private int						count		= -1;
	private Calendar				TODAY		= Calendar.getInstance();
	private KieServices				ks			= null;
	private KieContainer			kc			= null;
	private KieSession				ksession	= null;

	public XXXXXX_TC() {
		TODAY.set(2017, 1, 16);
		ks = KieServices.Factory.get();
		kc = ks.getKieClasspathContainer();
		ksession = kc.newKieSession("sessionWetAanpassingArbeidsduur");
	}	// end constructor

	@Test
	public void testcase_001() throws ParseException {
		Werkgever werkgever = new Werkgever();
		werkgever.setWerkgeverID(2);
		werkgever.setNaam("Philips");
		werkgever.setAdres("Jan ten havestraat");
		werkgever.setHuisnummer("12");
		werkgever.setPostcode("1095 TK");
		werkgever.setAantalWerknemers(12);
		werkgever.setPeildatum(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2017"));
		werkgever.setMilitairenInDienst(false);
		ksession.insert(werkgever);

		Werknemer werknemer = new Werknemer();
		werknemer.setWerknemerID(1);
		werknemer.setBurgerservicenummer("111111111");
		werknemer.setVoornamen("Jan");
		werknemer.setRoepnaam("Jan");
		werknemer.setAchternaam("Klaassens");
		werknemer.setGeboortedatum(new SimpleDateFormat("dd-MM-yyyy").parse("01-04-1968"));
		werknemer.setGeboorteplaats("Amsterdam");
		werknemer.setAdres("Keizersplantsoen");
		werknemer.setHuisnummer("67");
		werknemer.setPostcode("1095 TK");
		werknemer.setWoonplaats("Amsterdam");
		werknemer.setPaspoortnummer("123456");
		werknemer.setIdKaartNummer("24680");
		werknemer.setBurgerlijkeStaat("gehuwd");
		werknemer.setNationaliteit("NL");
		werknemer.setNationaliteitSinds(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2000"));
		werknemer.setMilitairAmbtenaar(false);
		ksession.insert(werknemer);

		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Geen enkele regel heeft gevuurd", count > 0);
	}	 // end testcase_001

	@Test
	public void testcase_002() throws ParseException {
		Werkgever werkgever = new Werkgever();
		werkgever.setWerkgeverID(9999);
		ksession.insert(werkgever);

		Werknemer werknemer = new Werknemer();
		werknemer.setWerknemerID(9999);
		ksession.insert(werknemer);

		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Een regel heeft gevuurd", count == 0);
	}	 // end testcase_002

}	// end class