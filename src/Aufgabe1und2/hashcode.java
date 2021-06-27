package Aufgabe1und2;

/**
 * @author andreaslehmann
 *
 */
public class hashcode {

	/**
	 * generiert einen Hashcode auf Basis eines übergebenen Spieler Objektes. Der
	 * zurueckgegebene Hashcode ergibt sich aus der Quersumme der Variable name
	 * addiert zu dem Wert der mit der Mittquadratmethode aus der Variable points
	 * berechnet wurde
	 */
	public int hashCode(String name, int points) {
		int a = name.length() * 1111;
		int b = points;
		int hash, hashA, hashB = 0;

		// combine
		hashA = crossSum(a);
		// middle square method
		b = b * b;
		String temp = String.valueOf(b);
		hashB = Integer.parseInt(temp.substring(1, temp.length() - 2));
		// addition
		hash = hashA + hashB;

		return hash;
	}

	/**
	 * benutzt die Hashfunktion von Aufgabe 1 um einen Hashwert zu generieren Der
	 * Schlüssel k wird erzeugt in dem die Variable name in char Zeichen zerlegt
	 * wird und die Quersumme bei der Zuweisung zur Integer Variable k gebildet
	 * wird. Danach wird die Variable points zu k addiert.
	 * 
	 * @return hash
	 */
	public int myHashCode(String name, int points) {
		int hash = 0;
		int k = 0;

		if(name == "" || points == 0) {
			throw new IllegalArgumentException();
		}

		// Berechnung Schlüssel k
		for (int i = 0; i < name.length(); i++) {
			k = k + name.charAt(i);
		}
		k = k + points;

		// Hashfunktion
		hash = 181 * k % 512;

		// Betragsfunktion
		if (hash < 0)
			hash = hash * -1;

		return hash;
	}

	private static int crossSum(int number) {
		if (number <= 9)
			return number;

		return number % 10 + crossSum(number / 10);
	}

}
