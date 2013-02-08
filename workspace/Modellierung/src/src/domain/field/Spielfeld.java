package src.domain.field;

import src.domain.figure.Wissensstreiter;


public class Spielfeld {

	/**
	 * @associates src.domain.figure.Wissensstandsanzeiger
	 * @directed directed
	 * @supplierCardinality 8..16
	 */
	java.util.List lnkWissensstandsanzeiger = null;
	/**
	 * @associates src.domain.figure.Wissensstreiter
	 * @directed directed
	 * @supplierCardinality 6..12
	 */
	java.util.List lnkWissensstreiter = null;
	public Spielfeld(int modus) {
		
	}
	public void add(Wissensstreiter ws) {
		return;
	}
}
