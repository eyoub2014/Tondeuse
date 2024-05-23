package com.mowitnow;

/**
 * Cette classe représente une tondeuse qui peut se déplacer sur une pelouse
 * rectangulaire.
 */

public class Mower {
	private Position position; // La position actuelle de la tondeuse
	private Lawn lawn; // La pelouse sur laquelle la tondeuse se déplace

	/**
	 * Constructeur de la classe Mower.
	 *
	 * @param position la position initiale de la tondeuse
	 * @param lawn     la pelouse sur laquelle la tondeuse se déplace
	 */
	public Mower(Position position, Lawn lawn) {
		this.position = position;
		this.lawn = lawn;
	}

	/**
	 * Exécute une série de commandes pour déplacer la tondeuse.
	 *
	 * @param commands les commandes à exécuter (G pour tourner à gauche, D pour
	 *                 tourner à droite, A pour avancer)
	 */
	public void executeCommands(String commands) {
		for (char command : commands.toCharArray()) {
			switch (command) {
			case 'G':
				position.turnLeft();
				break;
			case 'D':
				position.turnRight();
				break;
			case 'A':
				Position newPosition = position.moveForward();
				if (lawn.isWithinBounds(newPosition)) {
					position = newPosition;
				}
				break;
			}
		}
	}

	/**
	 * Obtient la position actuelle de la tondeuse.
	 *
	 * @return la position actuelle de la tondeuse
	 */
	public Position getPosition() {
		return position;
	}
}