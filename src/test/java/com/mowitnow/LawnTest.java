package com.mowitnow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LawnTest {

	@Test
	public void testIsWithinBounds() {
		// Test de la méthode isWithinBounds() de la classe Lawn
		// Création d'une pelouse avec des dimensions de 5x5
		Lawn lawn = new Lawn(5, 5);
		// Création de deux positions : une à l'intérieur des limites de la pelouse et
		// une à l'extérieur
		Position position1 = new Position(3, 3, Orientation.N);
		Position position2 = new Position(6, 3, Orientation.N);

		// Vérification que la position1 est à l'intérieur des limites de la pelouse
		assertTrue(lawn.isWithinBounds(position1));
		// Vérification que la position2 est à l'extérieur des limites de la pelouse
		assertFalse(lawn.isWithinBounds(position2));
	}
}