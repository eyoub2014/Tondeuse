
# Projet MowItNow

Ce projet est une implémentation en Java d'un simulateur de tondeuses à gazon automatiques. L'application permet de simuler le déplacement de tondeuses sur une pelouse rectangulaire en fonction de séries d'instructions.

## Fonctionnalités

- **Lawn (Pelouse) :** Définition de la taille de la pelouse.
- **Mower (Tondeuse) :** Définition de la position initiale de la tondeuse et exécution des instructions pour son déplacement.
- **Orientation :** Gestion des orientations de la tondeuse (Nord, Est, Sud, Ouest).
- **CommandParser (Analyseur de commandes) :** Analyse des instructions pour définir la pelouse et les positions initiales des tondeuses.

## Structure du projet

Le projet est structuré comme suit :

- **com.mowitnow :** Package principal contenant toutes les classes du projet.
  - **App :** Classe principale contenant le point d'entrée de l'application.
  - **CommandParser :** Classe pour analyser les commandes et générer des objets Lawn et Position.
  - **Lawn :** Classe représentant la pelouse rectangulaire.
  - **Mower :** Classe représentant la tondeuse avec ses fonctionnalités de déplacement.
  - **Orientation :** Énumération des orientations possibles.
  - **Position :** Classe représentant la position d'une tondeuse sur la pelouse.

## Tests

Le projet comprend également des tests unitaires pour les différentes fonctionnalités :

- **AppTest :** Tests pour la classe principale de l'application.
- **CommandParserTest :** Tests pour le parseur de commandes.
- **LawnTest :** Tests pour la classe Lawn.
- **MowerTest :** Tests pour la classe Mower.
- **PositionTest :** Tests pour la classe Position.

## Dépendances Maven

Le projet utilise Maven pour la gestion des dépendances. Voici les principales dépendances déclarées dans le fichier POM :

- **JUnit Jupiter** : Framework de test unitaire.
- **Mockito Core** : Framework de mock pour les tests.
- **Apache Commons Lang** : Bibliothèque de fonctions utilitaires pour la manipulation de chaînes, d'arrays, etc.
- **JaCoCo Maven Plugin** : Plugin pour la génération de rapports de couverture de code.

Le compilateur Java utilisé est défini avec une version spécifique dans les propriétés du POM.

## Exemple de cas de test

Voici un exemple de fichier d'entrée pour le simulateur de tondeuses :

5 5           (taille de la pelouse)
1 2 N         (position initiale de la première tondeuse)
GAGAGAGAA     (instructions pour la première tondeuse)
3 3 E         (position initiale de la deuxième tondeuse)
AADAADADDA   (instructions pour la deuxième tondeuse)

Le résultat attendu pour ce cas de test est :

1 3 N         (position finale de la première tondeuse)
5 1 E         (position finale de la deuxième tondeuse)

Notez que le fichier d'entrée doit être placé dans le dossier "ressources" à la racine du projet.
