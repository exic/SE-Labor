package src.domain.core;

import java.awt.Color;

import src.domain.figure.Wissensstreiter;

public class Spieler{

	/**
	 * @associates src.domain.figure.Wissensstreiter
	 * @directed directed
	 * @supplierCardinality 3
	 */
	java.util.List lnkWissensstreiter = null;
	/**
	 * @associates src.domain.figure.Wissensstandsanzeiger
	 * @directed directed
	 * @supplierCardinality 4
	 */
	java.util.List lnkWissensstandsanzeiger = null;
	public Spieler(String name, int farbe) {
	}
	public void add(Wissensstreiter ws) {
		return;
	}
}
