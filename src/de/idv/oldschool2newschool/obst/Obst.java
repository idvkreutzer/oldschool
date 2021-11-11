package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public interface Obst {
	public Farbe getFarbe();
	
	public default void printFarbe() {
		String ausgabe = "Die Farbe ist " + this.getFarbe().name();
		System.out.println(ausgabe);
	}
}
