package com.calculatorJava;//on nomme le package auquel appartient la class tester !

import static org.junit.jupiter.api.Assertions.assertEquals;//on importe les methode assertEquals pour les test
import static org.junit.jupiter.api.Assertions.assertThrows;// on importe les methode assertThrows pour la division par 0 l"exeption "

import org.junit.jupiter.api.Test;

class OperationsTest {

	@Test
	void testSommeNombres() {
		Operations operations = new Operations();
		assertEquals(15, operations.sommeNombres(10, 5), "10 + 5 doit être egal a 15");

	}

	@Test
	void testSoustractionNombres() {
		Operations operations = new Operations();
		assertEquals(3, operations.soustractionNombres(8, 5), "8 - 5 doit être egal a 3");

	}

	@Test
	void testDivisionNombres() {
		Operations operations = new Operations();
		assertEquals(2, operations.divisionNombres(10, 5), "10 / 5 doit être égal a 2");
		assertThrows(ArithmeticException.class, () -> operations.divisionNombres(10, 0),
				"La division par zéro doit lancer une ArithmeticException");

	}

	@Test
	void testMultiplieNombres() {
		Operations operations = new Operations();
		assertEquals(30, operations.multiplieNombres(15, 2), " 15 * 2 doit être égal a 30");

	}
}

// pour chaque test on creer une instance  de la classe a tester Operation et pour chaque methode de cette classe on creer un test

// la division quand a elle passe 2 test pour pouvoir tester la division par 0 et renvoyé une erreur !