package com.mowitnow;

/**
 * Cette classe est responsable de l'analyse des commandes du fichier d'entrée.
 */

public class CommandParser {
	/**
	 * Analyse la première ligne du fichier d'entrée pour créer une pelouse.
	 *
	 * @param line la première ligne du fichier d'entrée contenant les dimensions de
	 *             la pelouse
	 * @return un objet Lawn représentant la pelouse
	 */
	public static Lawn parseLawn(String line) {
		String[] parts = line.split(" ");
		int width = Integer.parseInt(parts[0]);
		int height = Integer.parseInt(parts[1]);
		return new Lawn(width, height);
	}

	/**
	 * Analyse une ligne du fichier d'entrée pour créer une position initiale d'une
	 * tondeuse.
	 *
	 * @param line la ligne du fichier d'entrée contenant les coordonnées et
	 *             l'orientation de la tondeuse
	 * @return un objet Position représentant la position initiale de la tondeuse
	 */
	public static Position parsePosition(String line) {
		String[] parts = line.split(" ");
		int x = Integer.parseInt(parts[0]);
		int y = Integer.parseInt(parts[1]);
		Orientation orientation = Orientation.valueOf(parts[2]);
		return new Position(x, y, orientation);
	}
}