/**
 * 
 */
package school2.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TastaturRead {
	// Methode zur Eingabe eines Textes (String)
	public static String readString() {
		// Deklaration der Referenzvariablen din f�r die Eingabe eines
		// Input-Streams
		BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.flush(); // L�schen des Stream-Buffers
		// Daten einlesen und m�gliche Fehler auffangen
		try {
			return din.readLine(); // eingegebenen Text zur�ckgeben
		} catch (Exception e) {
			System.out.println("Fehler bei der Eingabe!");
			System.out.println(e); // m�glichen Fehler anzeigen
		}
		System.out
				.println("\nHier ist ein undefinierbarer Fehler aufgetreten!");
		return new String(""); // Leeren String zur�ckgeben bei Fehler
	}

	// Methode zur Eingabe eines Zeichens (Character)
	public static char readChar() {
		// Deklaration der Referenzvariablen din f�r die Eingabe eines
		// Input-Streams
		BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in));
		String string = ""; // String string initialisieren
		System.out.flush(); // L�schen des Stream-Buffers
		// Daten einlesen und m�gliche Fehler auffangen
		try {
			string = din.readLine(); // Text einlesen
			// nur das 1. Zeichen des Strings ber�cksichtigen!
			if (string.length() > 0)
				return string.charAt(0);
		} catch (Exception e) {
			System.out.println("Fehler bei der Eingabe!");
			System.out.println(e); // m�glichen Fehler anzeigen
		}
		return ' '; // Leerschlag zur�ckgeben bei Fehler
	}

	// Methode zur Eingabe einer Ganzzahl vom Typ long
	public static long readLong() {
		// Deklaration der Referenzvariablen din f�r die Eingabe eines
		// Input-Streams
		BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in));
		String string = ""; // String string initialisieren
		System.out.flush(); // L�schen des Stream-Buffers
		try {
			string = din.readLine(); // Text einlesen
		} catch (Exception e) {
			System.out.println("Fehler bei der Eingabe!");
			System.out.println(e); // m�glichen Fehler anzeigen
		}
		try {
			// Umwandlung des Strings in einen Long-Wert
			return (new Long(string)).longValue();
		} catch (Exception e) {
			System.out.println("Fehler bei der Umwandlung!");
			System.out.println(e); // m�glichen Fehler anzeigen
			return 0; // 0 zur�ckgeben bei Fehler
		}
	}

	// Methode zur Eingabe einer Gleitkommazahl vom Typ double
	public static double readDouble() {
		// Deklaration der Referenzvariablen din f�r die Eingabe eines
		// Input-Streams
		BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in));
		String string = ""; // String string initialisieren
		System.out.flush(); // L�schen des Stream-Buffers
		try {
			string = din.readLine(); // Text einlesen
		} catch (Exception e) {
			System.out.println("Fehler bei der Eingabe!");
			System.out.println(e); // m�glichen Fehler anzeigen
		}
		try {
			// Umwandlung des Strings in einen Double-Wert
			return (new Double(string)).doubleValue();
		} catch (Exception e) {
			System.out.println("Fehler bei der Umwandlung!");
			System.out.println(e); // m�glichen Fehler anzeigen
			return 0; // 0.0 zur�ckgeben bei Fehler
		}
	}
}