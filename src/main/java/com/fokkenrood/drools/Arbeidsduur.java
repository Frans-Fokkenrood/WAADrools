package com.fokkenrood.drools;

import java.util.Date;

public class Arbeidsduur {
	Arbeidsovereenkomst	arbeidsovereenkomst				= null;
	Date				datumIndienenVerzoek			= null;
	Date				datumVorigVerzoek				= null;
	Date				datumOverlegPlegen				= null;
	Date				datumInwilligenVerzoek			= null;
	Date				datumAfwijzenVerzoek			= null;
	Date				datumVaststellenSpreiding		= null;
	Date				datumWijzigenSpreiding			= null;
	Date				datumMededelenBeslissing		= null;
	Date				datumMededelenRedenen			= null;
	boolean				werkgeverHeeftBelang			= false;
	Date				ingangsdatumAanpassing			= null;
	double				omvangVanDeAanpassing			= 0.0;
	String				gewensteSpreiding				= null;
	boolean				isSchriftelijkIngediend			= true;
	int					samentellingVolgensWerknemer	= -1;
	int					samentellingVolgensWerkgever	= -1;
	String				redenenVoorAfwijzing			= null;
	boolean				zwaarwegendeBelangen			= false;
	String				feitenBijVermindering			= null;
	String				feitenBijVermeerdering			= null;
	
	public Arbeidsovereenkomst getArbeidsovereenkomst() {
		return arbeidsovereenkomst;
	}
	public void setArbeidsovereenkomst(Arbeidsovereenkomst arbeidsovereenkomst) {
		this.arbeidsovereenkomst = arbeidsovereenkomst;
	}
	
	public Date getDatumIndienenVerzoek() {
		return datumIndienenVerzoek;
	}
	public void setDatumIndienenVerzoek(Date datumIndienenVerzoek) {
		this.datumIndienenVerzoek = datumIndienenVerzoek;
	}
	
	public Date getDatumVorigVerzoek() {
		return datumVorigVerzoek;
	}
	public void setDatumVorigVerzoek(Date datumVorigVerzoek) {
		this.datumVorigVerzoek = datumVorigVerzoek;
	}
	
	public Date getDatumOverlegPlegen() {
		return datumOverlegPlegen;
	}
	public void setDatumOverlegPlegen(Date datumOverlegPlegen) {
		this.datumOverlegPlegen = datumOverlegPlegen;
	}
	
	public Date getDatumInwilligenVerzoek() {
		return datumInwilligenVerzoek;
	}
	public void setDatumInwilligenVerzoek(Date datumInwilligenVerzoek) {
		this.datumInwilligenVerzoek = datumInwilligenVerzoek;
	}
	
	public Date getDatumAfwijzenVerzoek() {
		return datumAfwijzenVerzoek;
	}
	public void setDatumAfwijzenVerzoek(Date datumAfwijzenVerzoek) {
		this.datumAfwijzenVerzoek = datumAfwijzenVerzoek;
	}
	
	public Date getDatumVaststellenSpreiding() {
		return datumVaststellenSpreiding;
	}
	public void setDatumVaststellenSpreiding(Date datumVaststellenSpreiding) {
		this.datumVaststellenSpreiding = datumVaststellenSpreiding;
	}
	
	public Date getDatumWijzigenSpreiding() {
		return datumWijzigenSpreiding;
	}
	public void setDatumWijzigenSpreiding(Date datumWijzigenSpreiding) {
		this.datumWijzigenSpreiding = datumWijzigenSpreiding;
	}
	
	public Date getDatumMededelenBeslissing() {
		return datumMededelenBeslissing;
	}
	public void setDatumMededelenBeslissing(Date datumMededelenBeslissing) {
		this.datumMededelenBeslissing = datumMededelenBeslissing;
	}
	
	public Date getDatumMededelenRedenen() {
		return datumMededelenRedenen;
	}
	public void setDatumMededelenRedenen(Date datumMededelenRedenen) {
		this.datumMededelenRedenen = datumMededelenRedenen;
	}
	
	public boolean isWerkgeverHeeftBelang() {
		return werkgeverHeeftBelang;
	}
	public void setWerkgeverHeeftBelang(boolean werkgeverHeeftBelang) {
		this.werkgeverHeeftBelang = werkgeverHeeftBelang;
	}
	
	public Date getIngangsdatumAanpassing() {
		return ingangsdatumAanpassing;
	}
	public void setIngangsdatumAanpassing(Date ingangsdatumAanpassing) {
		this.ingangsdatumAanpassing = ingangsdatumAanpassing;
	}
	
	public double getOmvangVanDeAanpassing() {
		return omvangVanDeAanpassing;
	}
	public void setOmvangVanDeAanpassing(double omvangVanDeAanpassing) {
		this.omvangVanDeAanpassing = omvangVanDeAanpassing;
	}
	
	public String getGewensteSpreiding() {
		return gewensteSpreiding;
	}
	public void setGewensteSpreiding(String gewensteSpreiding) {
		this.gewensteSpreiding = gewensteSpreiding;
	}
	
	public boolean isSchriftelijkIngediend() {
		return isSchriftelijkIngediend;
	}
	public void setSchriftelijkIngediend(boolean isSchriftelijkIngediend) {
		this.isSchriftelijkIngediend = isSchriftelijkIngediend;
	}
	
	public int getSamentellingVolgensWerknemer() {
		return samentellingVolgensWerknemer;
	}
	public void setSamentellingVolgensWerknemer(int samentellingVolgensWerknemer) {
		this.samentellingVolgensWerknemer = samentellingVolgensWerknemer;
	}
	
	public int getSamentellingVolgensWerkgever() {
		return samentellingVolgensWerkgever;
	}
	public void setSamentellingVolgensWerkgever(int samentellingVolgensWerkgever) {
		this.samentellingVolgensWerkgever = samentellingVolgensWerkgever;
	}
	
	public String getRedenenVoorAfwijzing() {
		return redenenVoorAfwijzing;
	}
	public void setRedenenVoorAfwijzing(String redenenVoorAfwijzing) {
		this.redenenVoorAfwijzing = redenenVoorAfwijzing;
	}
	
	public boolean isZwaarwegendeBelangen() {
		return zwaarwegendeBelangen;
	}
	public void setZwaarwegendeBelangen(boolean zwaarwegendeBelangen) {
		this.zwaarwegendeBelangen = zwaarwegendeBelangen;
	}
	
	public String getFeitenBijVermindering() {
		return feitenBijVermindering;
	}
	public void setFeitenBijVermindering(String feitenBijVermindering) {
		this.feitenBijVermindering = feitenBijVermindering;
	}
	
	public String getFeitenBijVermeerdering() {
		return feitenBijVermeerdering;
	}
	public void setFeitenBijVermeerdering(String feitenBijVermeerdering) {
		this.feitenBijVermeerdering = feitenBijVermeerdering;
	}
	
}	// end class
