package com.mowitnow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

	@Test

	public void testTurnLeft() {
		// Test de la rotation vers la gauche

		// Création d'une position initiale orientée vers le nord (N)
		Position position = new Position(0, 0, Orientation.N);
		// Rotation de la position vers la gauche
		position.turnLeft();
		// Vérification que l'orientation après la rotation est vers l'ouest (W)
		assertEquals(Orientation.W, position.getOrientation());
	}

	@Test
	public void testTurnRight() {
		// Test de la rotation vers la droite

		// Création d'une position initiale orientée vers le nord (N)
		Position position = new Position(0, 0, Orientation.N);
		// Rotation de la position vers la droite
		position.turnRight();
		// Vérification que l'orientation après la rotation est vers l'est (E)
		assertEquals(Orientation.E, position.getOrientation());
	}

	@Test
	public void testMoveForward() {
		// Test du déplacement vers l'avant

		// Création d'une position initiale orientée vers le nord (N)
		Position position = new Position(0, 0, Orientation.N);
		// Déplacement de la position vers l'avant
		Position newPosition = position.moveForward();
		// Vérification que les coordonnées de la nouvelle position sont correctes
		assertEquals(0, newPosition.getX());
		assertEquals(1, newPosition.getY());
		// Vérification que l'orientation de la nouvelle position est toujours vers le
		// nord (N)
		assertEquals(Orientation.N, newPosition.getOrientation());
	}
}