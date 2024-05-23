package com.mowitnow;

/**
 * Cette classe représente la position d'une tondeuse sur la pelouse.
 */

public class Position {
	private int x;
	private int y;
	private Orientation orientation;

	/**
	 * Constructeur pour initialiser une position avec des coordonnées et une
	 * orientation données.
	 *
	 * @param x           la coordonnée x
	 * @param y           la coordonnée y
	 * @param orientation l'orientation
	 */
	public Position(int x, int y, Orientation orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	/**
	 * Fait tourner la tondeuse vers la gauche.
	 */
	public void turnLeft() {
		orientation = orientation.left();
	}

	/**
	 * Fait tourner la tondeuse vers la droite.
	 */
	public void turnRight() {
		orientation = orientation.right();
	}

	/**
	 * Déplace la tondeuse d'une case vers l'avant en fonction de son orientation.
	 *
	 * @return la nouvelle position après le déplacement
	 */
	public Position moveForward() {
		switch (orientation) {
		case N:
			return new Position(x, y + 1, orientation);
		case E:
			return new Position(x + 1, y, orientation);
		case S:
			return new Position(x, y - 1, orientation);
		case W:
			return new Position(x - 1, y, orientation);
		default:
			throw new IllegalStateException("Unexpected value: " + orientation);
		}
	}

	/**
	 * Getter pour la coordonnée x.
	 *
	 * @return la coordonnée x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Getter pour la coordonnée y.
	 *
	 * @return la coordonnée y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Getter pour l'orientation.
	 *
	 * @return l'orientation
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * Redéfinition de la méthode toString pour obtenir une représentation textuelle
	 * de la position.
	 *
	 * @return la position sous forme de chaîne de caractères
	 */
	@Override
	public String toString() {
		return x + " " + y + " " + orientation;
	}
}