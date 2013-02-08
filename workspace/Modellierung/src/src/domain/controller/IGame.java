package src.domain.controller;

import java.awt.Color;

import src.domain.question.Kategorie;

public interface IGame {

	public abstract void initialize();

	public abstract void bestimmeKategorie(Kategorie kategorie1,
			Kategorie kategorie2, Kategorie kategorie3, Kategorie kategorie4);

	public abstract void bestimmeNameUndFarbe(String name, Color farbe);

	public abstract void starteSpiel(int modus, int spieleranzahl);

}