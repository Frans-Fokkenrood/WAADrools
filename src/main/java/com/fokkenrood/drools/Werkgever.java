package com.fokkenrood.drools;

import java.util.Date;

public class Werkgever {
	int		werkgeverID						= -1;
	String	naam							= null;
	String	adres							= null;
	String	huisnummer						= null;
	String	postcode						= null;
	int		aantalWerknemers				= -1;
	Date	peildatum						= null;
	boolean	militairenInDienst				= false;
	
	public int getWerkgeverID() {
		return werkgeverID;
	}
	public void setWerkgeverID(int werkgeverID) {
		this.werkgeverID = werkgeverID;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
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
	
	public int getAantalWerknemers() {
		return aantalWerknemers;
	}
	public void setAantalWerknemers(int aantalWerknemers) {
		this.aantalWerknemers = aantalWerknemers;
	}
	
	public Date getPeildatum() {
		return peildatum;
	}
	public void setPeildatum(Date peildatum) {
		this.peildatum = peildatum;
	}
	
	public boolean isMilitairenInDienst() {
		return militairenInDienst;
	}
	public void setMilitairenInDienst(boolean militairenInDienst) {
		this.militairenInDienst = militairenInDienst;
	}
	
}	// end class
