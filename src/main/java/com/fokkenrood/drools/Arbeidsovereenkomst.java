package com.fokkenrood.drools;

import java.util.Date;

public class Arbeidsovereenkomst {
	int		werkgeverID						= -1;
	int		werknemerID						= -1;
	Date	datumIndiensttreding			= null;
	Date	overeenkomstGetekendOp			= null;
	String	arbeidsduurperiode				= null;
	
	public int getWerkgeverID() {
		return werkgeverID;
	}
	public void setWerkgeverID(int werkgeverID) {
		this.werkgeverID = werkgeverID;
	}
	
	public int getWerknemerID() {
		return werknemerID;
	}
	public void setWerknemerID(int werknemerID) {
		this.werknemerID = werknemerID;
	}
	
	public Date getDatumIndiensttreding() {
		return datumIndiensttreding;
	}
	public void setDatumIndiensttreding(Date datumIndiensttreding) {
		this.datumIndiensttreding = datumIndiensttreding;
	}
	
	public Date getOvereenkomstGetekendOp() {
		return overeenkomstGetekendOp;
	}
	public void setOvereenkomstGetekendOp(Date overeenkomstGetekendOp) {
		this.overeenkomstGetekendOp = overeenkomstGetekendOp;
	}
	
	public String getArbeidsduurperiode() {
		return arbeidsduurperiode;
	}
	public void setArbeidsduurperiode(String arbeidsduurperiode) {
		this.arbeidsduurperiode = arbeidsduurperiode;
	}
	
}	// end class
