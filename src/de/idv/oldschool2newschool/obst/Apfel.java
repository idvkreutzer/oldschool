package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public class Apfel extends Kernobst implements Obst {

	private int kerne;
	private Farbe farbe;
	
	public Apfel(int kerne, Farbe farbe) {
		super();
		this.kerne = kerne;
		this.setFarbe(farbe);
	}

	@Override
	public int getAnzahlKerne() {
		return kerne;
	}

	@Override
	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
}
