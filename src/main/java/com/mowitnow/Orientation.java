package com.mowitnow;

/**
 * Cette énumération représente les orientations possibles d'une tondeuse.
 */

public enum Orientation {
	N, // Nord
	E, // Est
	S, // Sud
	W; // Ouest

	/**
	 * Retourne l'orientation à gauche de l'orientation actuelle.
	 *
	 * @return l'orientation à gauche
	 */
	public Orientation left() {
		switch (this) {
		case N:
			return W;
		case W:
			return S;
		case S:
			return E;
		case E:
			return N;
		default:
			throw new IllegalStateException("Unexpected value: " + this);
		}
	}

	/**
	 * Retourne l'orientation à droite de l'orientation actuelle.
	 *
	 * @return l'orientation à droite
	 */
	public Orientation right() {
		switch (this) {
		case N:
			return E;
		case E:
			return S;
		case S:
			return W;
		case W:
			return N;
		default:
			throw new IllegalStateException("Unexpected value: " + this);
		}
	}
}