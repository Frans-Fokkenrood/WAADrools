package com.fokkenrood.drools;

import java.util.Date;

public class Werknemer {
	int		werknemerID						= -1;
	String	burgerservicenummer				= null;
	String	voornamen						= null;
	String	roepnaam						= null;
	String	achternaam						= null;
	Date	geboortedatum					= null;
	String	geboorteplaats					= null;
	String	adres							= null;
	String	huisnummer						= null;
	String	postcode						= null;
	String	woonplaats						= null;
	String	paspoortnummer					= null;
	String	idKaartNummer					= null;
	String	burgerlijkeStaat				= null;
	String	nationaliteit					= null;
	Date	nationaliteitSinds				= null;
	boolean	militairAmbtenaar				= false;
	
	public int getWerknemerID() {
		return werknemerID;
	}
	public void setWerknemerID(int werknemerID) {
		this.werknemerID = werknemerID;
	}
	
	public String getBurgerservicenummer() {
		return burgerservicenummer;
	}
	public void setBurgerservicenummer(String burgerservicenummer) {
		this.burgerservicenummer = burgerservicenummer;
	}
	
	public String getVoornamen() {
		return voornamen;
	}
	public void setVoornamen(String voornamen) {
		this.voornamen = voornamen;
	}
	
	public String getRoepnaam() {
		return roepnaam;
	}
	public void setRoepnaam(String roepnaam) {
		this.roepnaam = roepnaam;
	}
	
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	public Date getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
	public String getGeboorteplaats() {
		return geboorteplaats;
	}
	public void setGeboorteplaats(String geboorteplaats) {
		this.geboorteplaats = geboorteplaats;
	}
	
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	
	public String getPaspoortnummer() {
		return paspoortnummer;
	}
	public void setPaspoortnummer(String paspoortnummer) {
		this.paspoortnummer = paspoortnummer;
	}
	
	public String getIdKaartNummer() {
		return idKaartNummer;
	}
	public void setIdKaartNummer(String idKaartNummer) {
		this.idKaartNummer = idKaartNummer;
	}
	
	public String getBurgerlijkeStaat() {
		return burgerlijkeStaat;
	}
	public void setBurgerlijkeStaat(String burgerlijkeStaat) {
		this.burgerlijkeStaat = burgerlijkeStaat;
	}
	
	public String getNationaliteit() {
		return nationaliteit;
	}
	public void setNationaliteit(String nationaliteit) {
		this.nationaliteit = nationaliteit;
	}
	
	public Date getNationaliteitSinds() {
		return nationaliteitSinds;
	}
	public void setNationaliteitSinds(Date nationaliteitSinds) {
		this.nationaliteitSinds = nationaliteitSinds;
	}
	
	public boolean isMilitairAmbtenaar() {
		return militairAmbtenaar;
	}
	public void setMilitairAmbtenaar(boolean militairAmbtenaar) {
		this.militairAmbtenaar = militairAmbtenaar;
	}
	
}	// end class
