package com.mowitnow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MowerTest {

	@Test
	public void testMowerMovement() {
		// Test du mouvement de la tondeuse

		// Création d'une pelouse de 5x5
		Lawn lawn = new Lawn(5, 5);

		// Création d'une position initiale de la tondeuse (1, 2) orientée vers le nord
		// (N)
		Position position = new Position(1, 2, Orientation.N);
		// Initialisation de la tondeuse avec la position initiale et la pelouse
		Mower mower = new Mower(position, lawn);

		// Exécution de la séquence de commandes sur la tondeuse
		mower.executeCommands("GAGAGAGAA");
		// Vérification que la position finale de la tondeuse est correcte
		assertEquals("1 3 N", mower.getPosition().toString());

		// Création d'une nouvelle position initiale de la tondeuse (3, 3) orientée vers
		// l'est (E)
		position = new Position(3, 3, Orientation.E);
		// Initialisation de la tondeuse avec la nouvelle position initiale et la même
		// pelouse
		mower = new Mower(position, lawn);
		// Exécution d'une autre séquence de commandes sur la tondeuse
		mower.executeCommands("AADAADADDA");
		// Vérification que la position finale de la tondeuse est correcte
		assertEquals("5 1 E", mower.getPosition().toString());
	}
}