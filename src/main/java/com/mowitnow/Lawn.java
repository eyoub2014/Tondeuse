package com.mowitnow;

/**
 * Cette classe représente une pelouse rectangulaire sur laquelle les tondeuses
 * se déplacent.
 */

public class Lawn {
	private final int width; // Largeur de la pelouse
	private final int height; // Hauteur de la pelouse

	/**
	 * Constructeur de la classe Lawn.
	 *
	 * @param width  la largeur de la pelouse
	 * @param height la hauteur de la pelouse
	 */
	public Lawn(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Obtient la largeur de la pelouse.
	 *
	 * @return la largeur de la pelouse
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Obtient la hauteur de la pelouse.
	 *
	 * @return la hauteur de la pelouse
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Vérifie si une position donnée est à l'intérieur des limites de la pelouse.
	 *
	 * @param position la position à vérifier
	 * @return true si la position est à l'intérieur des limites de la pelouse,
	 *         sinon false
	 */
	public boolean isWithinBounds(Position position) {
		return position.getX() >= 0 && position.getX() <= width && position.getY() >= 0 && position.getY() <= height;
	}
}