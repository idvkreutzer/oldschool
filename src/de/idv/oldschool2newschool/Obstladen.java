package de.idv.oldschool2newschool;

import java.util.ArrayList;
import java.util.List;

import de.idv.oldschool2newschool.farbe.Farbe;
import de.idv.oldschool2newschool.helper.ObstUtil;
import de.idv.oldschool2newschool.obst.Apfel;
import de.idv.oldschool2newschool.obst.Birne;
import de.idv.oldschool2newschool.obst.Kernobst;
import de.idv.oldschool2newschool.obst.Obst;
import de.idv.oldschool2newschool.obst.Pflaume;

public class Obstladen {

	
	public static void main(String[] args) {
		String willkommen = 
				"################################################\n" +
				"# Willkommen im Obstladen.                     #\n"
							+ "# Wir haben Kernobst uvm.                      #\n" 
							+ "# Schau dich einfach um und such Dir was aus.  #\n"
							+ "################################################\n";
		
		System.out.println(willkommen);
		List<Obst> obstkorb = new ArrayList<>();
		obstkorb.add(new Birne(4, Farbe.GELB));
		obstkorb.add(new Apfel(8, Farbe.ROT));
		Pflaume pflaume = new Pflaume(1, Farbe.GRUEN);
		obstkorb.add(pflaume);
		obstkorb.add(null);
		
		System.out.println("Eine " + pflaume.getClass().getSimpleName() + " ist ein Steinobst.");
		
		for (Obst obst : obstkorb) {
			if (obst instanceof Kernobst) {
				Kernobst kernobst = (Kernobst) obst;
				System.out.println(obst.getClass().getSimpleName() + " besitzt " + kernobst.getAnzahlKerne() + " Kerne.");
			}
			
			if (obst != null) {
				String welcherReifeGrad = "Diese " + obst.getClass().getSimpleName() + " ist " + ObstUtil.ermittleReifegrad(obst.getFarbe());
				System.out.println(welcherReifeGrad);
				obst.printFarbe();
			} else {
				// Neue NPE! 
				String anzahlKerne = "Diese Frucht besitzt ";
				String kerne = "Kerne";
				System.out.println(anzahlKerne + obst.getFarbe() + kerne);
			}
		}
	}
}
