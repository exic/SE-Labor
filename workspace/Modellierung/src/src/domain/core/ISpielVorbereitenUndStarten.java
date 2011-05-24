package src.domain.core;

import java.awt.Color;

import src.domain.question.Kategorie;

public interface ISpielVorbereitenUndStarten {
	public void starteSpiel(int modus, int spieleranzahl);
	public void bestimmeKategorie(Kategorie kategorie1, Kategorie kategorie2, Kategorie kategorie3, Kategorie kategorie4);
	public void bestimmeNameUndFarbe(String name, Color farbe);
}
