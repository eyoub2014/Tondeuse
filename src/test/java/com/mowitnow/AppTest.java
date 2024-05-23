package com.mowitnow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

	@Test
	public void testApp() {
		// Capturer la sortie standard pour pouvoir la vérifier
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		// Appeler la méthode main de l'application
		App.main(new String[] {});

		// Définir la sortie attendue
		String expectedOutput = "1 3 N" + System.lineSeparator() + "5 1 E" + System.lineSeparator();

		// Vérifier si la sortie correspond à la sortie attendue
		assertEquals(expectedOutput, outContent.toString());
	}
}