package com.fokkenrood.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieSessieVervoer {

	public static void main(String[] args) {
		System.out.println("Start KIE sessie voor Wet Aanpassing Arbeidsduur...");
		
		//	setup a KIE-service and a KIE-session:	
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		KieSession ksession = kc.newKieSession("sessionWetAanpassingArbeidsduur");
		
		//	voeg feiten toe aan de sessie:
//		Artikel artikel = new Artikel();
//		artikel.setGoederenCode("00009303300");
//		artikel.setGoederenBeschrijving("ONE BULLET IN THE POCKET");
//		ksession.insert(artikel);
		
		//	execute rule engine:
		ksession.fireAllRules();
		ksession.dispose();
		
		System.out.println("Ready!");
	}	// end main

}	// end class
