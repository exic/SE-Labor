package src.domain.core;

import java.awt.Color;

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
}