package com.fokkenrood.testcases.WetAanpassingArbeidsduur;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.fokkenrood.drools.Werknemer;
import com.fokkenrood.drools.Werkgever;
import com.fokkenrood.drools.Arbeidsovereenkomst;

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
		Werknemer werknemer = new Werknemer();
		werknemer.setWerknemerID(11);
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

		Werkgever werkgever = new Werkgever();
		werkgever.setWerkgeverID(22);
		werkgever.setNaam("Philips");
		werkgever.setAdres("Jan ten havestraat");
		werkgever.setHuisnummer("12");
		werkgever.setPostcode("1095 TK");
		werkgever.setAantalWerknemers(12);
		werkgever.setPeildatum(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2017"));
		werkgever.setMilitairenInDienst(false);
		ksession.insert(werkgever);

		Arbeidsovereenkomst arbeidsovereenkomst = new Arbeidsovereenkomst();
		arbeidsovereenkomst.setWerknemerID(11);
		arbeidsovereenkomst.setWerkgeverID(22);
		arbeidsovereenkomst.setDatumIndiensttreding(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2000"));
		arbeidsovereenkomst.setOvereenkomstGetekendOp(new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2000"));
		arbeidsovereenkomst.setArbeidsduurperiode("een maand");
		ksession.insert(arbeidsovereenkomst);

		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Geen enkele regel heeft gevuurd", count > 0);
	}	 // end testcase_001

	@Test
	public void testcase_002() throws ParseException {
		Werknemer werknemer = new Werknemer();
		werknemer.setWerknemerID(9997);
		ksession.insert(werknemer);

		Werkgever werkgever = new Werkgever();
		werkgever.setWerkgeverID(9998);
		ksession.insert(werkgever);

		Arbeidsovereenkomst arbeidsovereenkomst = new Arbeidsovereenkomst();
		arbeidsovereenkomst.setWerknemerID(9997);
		arbeidsovereenkomst.setWerkgeverID(9998);
		ksession.insert(arbeidsovereenkomst);

		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Een regel heeft gevuurd", count == 0);
	}	 // end testcase_002

}	// end class