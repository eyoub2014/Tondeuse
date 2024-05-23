package com.mowitnow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandParserTest {

	@Test
	public void testParseLawn() {
		// Test de la méthode parseLawn() de CommandParser
		// Création d'une pelouse avec les dimensions spécifiées
		Lawn lawn = CommandParser.parseLawn("5 5");
		// Vérification des dimensions de la pelouse
		assertEquals(5, lawn.getWidth());
		assertEquals(5, lawn.getHeight());
	}

	@Test
	public void testParsePosition() {
		// Test de la méthode parsePosition() de CommandParser
		// Création d'une position avec les coordonnées et l'orientation spécifiées
		Position position = CommandParser.parsePosition("1 2 N");
		// Vérification des coordonnées de la position
		assertEquals(1, position.getX());
		assertEquals(2, position.getY());
		// Vérification de l'orientation de la position
		assertEquals(Orientation.N, position.getOrientation());
	}
}