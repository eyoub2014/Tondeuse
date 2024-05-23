package com.mowitnow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Classe principale du programme qui exécute la simulation de tondeuses à
 * gazon.
 */

public class App {

	/**
	 * Méthode principale du programme.
	 * 
	 * @param args Arguments de ligne de commande (non utilisés dans cette
	 *             application).
	 */
	public static void main(String[] args) {
		String inputFilePath = "src/main/resources/input.txt"; // Chemin du fichier d'entrée

		try {
			List<String> lines = Files.readAllLines(Paths.get(inputFilePath));
			Lawn lawn = CommandParser.parseLawn(lines.get(0));
			for (int i = 1; i < lines.size(); i += 2) {
				Position position = CommandParser.parsePosition(lines.get(i));
				String commands = lines.get(i + 1);
				Mower mower = new Mower(position, lawn);
				mower.executeCommands(commands);
				System.out.println(mower.getPosition());
			}
		} catch (IOException e) {
			System.out.println(" Erreur de lecture du fichier d'entrée" + e.getMessage());
		}
	}
}