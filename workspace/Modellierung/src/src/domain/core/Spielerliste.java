package src.domain.core;

public class Spielerliste {

	/**
	 * @link aggregation 
	 * @associates src.domain.core.Spieler
	 * @directed directed
	 * @supplierCardinality 0..*
	 */
	java.util.List lnkSpieler = null;

	public Spielerliste(int spieleranzahl) {
	}

	public void add(Spieler sp) {
		return;
	}

}
