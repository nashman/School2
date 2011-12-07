/**
 * 
 */
package school2.threads.aufgabe4;

import school2.utils.TastaturRead;

/**
 * @author Daniel Stutz
 * 
 */
public class Testlauf {
	public static void main(String[] args) {
		Stopuhr watch1 = new Stopuhr("Swatch");
		TastaturRead scan = new TastaturRead();

		System.out.println("press return to start watch");
		Character start = scan.readChar();
		watch1.start();
		Character stop = scan.readChar();
		watch1.setStatus(false);
	}
}
