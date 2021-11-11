package de.idv.oldschool2newschool.helper;

import de.idv.oldschool2newschool.farbe.Farbe;

public class ObstUtil {

	public static String ermittleReifegrad(Farbe farbe) {
		switch (farbe) {
		case GRUEN: {
			return "unreif";
		}

		case GELB: {
			return "noch nicht ganz reif";
		}

		case ROT: {
			return "reif";
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + farbe);
		}
	}
}
