package src.domain.controller;

import java.awt.Color;

import src.domain.question.Kategorie;

public class Game implements IGame{

	src.domain.question.KategorieListe lnkKategorieListe = null;
	src.domain.core.Wuerfel lnkWuerfel = null;
	src.domain.core.Spielerliste lnkSpielerliste = null;
	src.domain.field.Spielfeld lnkSpielfeld = null;
	/* (non-Javadoc)
	 * @see src.domain.controller.ISpielsystem#initialize()
	 */
	@Override
	public void initialize() {
		return;
	}
	/* (non-Javadoc)
	 * @see src.domain.controller.ISpielsystem#bestimmeKategorie(src.domain.question.Kategorie, src.domain.question.Kategorie, src.domain.question.Kategorie, src.domain.question.Kategorie)
	 */
	@Override
	public void bestimmeKategorie(Kategorie kategorie1, Kategorie kategorie2,
			Kategorie kategorie3, Kategorie kategorie4) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see src.domain.controller.ISpielsystem#bestimmeNameUndFarbe(java.lang.String, java.awt.Color)
	 */
	@Override
	public void bestimmeNameUndFarbe(String name, Color farbe) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see src.domain.controller.ISpielsystem#starteSpiel(int, int)
	 */
	@Override
	public void starteSpiel(int modus, int spieleranzahl) {
		// TODO Auto-generated method stub
		
	}
}
