package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public class Pflaume implements Obst {
	
	public Pflaume(int kerne, Farbe farbe) {
		super();
		this.kerne = kerne;
		this.farbe = farbe;
	}
	private int kerne;
	private Farbe farbe;
	
	public int getKerne() {
		return kerne;
	}
	public void setKerne(int kerne) {
		this.kerne = kerne;
	}
	public Farbe getFarbe() {
		return farbe;
	}
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
}
