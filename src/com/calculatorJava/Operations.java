package com.calculatorJava;

public class Operations { // c'est le plan de fonctionnement de mon futur objet calculatrice ce qu'il peu
							// faire ces différentes parties
//ci dessous les différentes "méthode d'instance" pour les opération de la calculatrice chaque instance de lobjet  
//créer avec la class operation pourra utilisé ces 4 méthode 
	public int sommeNombres(int num1, int num2) {
		return num1 + num2;
	}

	public int soustractionNombres(int num1, int num2) {
		return num1 - num2;
	}

	public int divisionNombres(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Erreur : division par zéro impossible");// on ajoute une exeption pour la
																					// division par 0
		}
		return num1 / num2;
	}

	public int multiplieNombres(int num1, int num2) {
		return num1 * num2;
	}

}