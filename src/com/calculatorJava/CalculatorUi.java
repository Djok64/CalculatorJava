package com.calculatorJava;

import java.util.Scanner;

public class CalculatorUi {
	public void startCalculator() {
		Scanner scanner = new Scanner(System.in);// créer un objet scanner qui lira les entrée faite dans la console

		System.out.print("entrez le premier nombre :");// demande a l'utilsateur via la console d'entrer un nombre
		int num1 = scanner.nextInt();// capture un nombre entier saisi par l'utilisateur et le stock dans la variable
		// num1

		System.out.print("entrez le second nombre :");// demande a l'utilsateur via la console d'entrer un second nombre
		int num2 = scanner.nextInt();// capture un nombre entier saisi par l'utilisateur et le stock dans la variable
		// num2

		System.out.print("choissiszez l'opération ( +, -, *, /) :");// demande a l'utilisateur de selectionner un
		// operateur
		char operation = scanner.next().charAt(0);// capture les caractère saisient et le stock le premier dans la
		// variable operation
		scanner.close();// fermeture du scanner pour liberer les ressources du systèmes vu que nous en
		// avons terminer avec lui
		// créer une instance d'operation pour appeler les methode d'opérations

		Operations calculatrice = new Operations();// création de l'instance de la classe Operation declarer plus haut
		// cela creer donc notre objet calculatrice qu'on pourra utilisé

		int resultat = 0;// j'initialise la variable qui contiendra le resultat a 0

		switch (operation) {// utilisation du block switch case pour executer tel ou tel code en fonction de
		// l'opérateur saisi
		case '+':
			resultat = calculatrice.sommeNombres(num1, num2);
			break;
		case '-':
			resultat = calculatrice.soustractionNombres(num1, num2);
			break;
		case '*':
			resultat = calculatrice.multiplieNombres(num1, num2);
			break;
		case '/':
			resultat = calculatrice.divisionNombres(num1, num2);
			break;
		default:

			System.out.println("Opération inconnue. Veuillez réessayer.");
			return;// si l'operateur ne correspond pas on nous le signale
		}

		System.out.println("Le résultat est : " + resultat);// la console renvoi le resultat de l'operation realisé
	}
}