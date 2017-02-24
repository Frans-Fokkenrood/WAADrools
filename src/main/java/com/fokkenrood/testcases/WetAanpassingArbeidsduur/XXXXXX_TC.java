package com.fokkenrood.testcases.WetAanpassingArbeidsduur;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Calendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

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
	public void testcase_001() {
		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Geen enkele regel heeft gevuurd", count > 0);
	}	 // end testcase_001

	@Test
	public void testcase_002() {
		count = ksession.fireAllRules();
		ksession.dispose();
		assertTrue("Een regel heeft gevuurd", count == 0);
	}	 // end testcase_002

}	// end class