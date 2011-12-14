/**
 * 
 */
package school2.networking.aufgabe1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Daniel Stutz
 * 
 */
public class GetIP {

	public static void main(String[] args) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.hsz-t.ch");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("IP: " + ip.getHostAddress());
		System.out.println("----");
		for (byte b : ip.getAddress()) {
			short temp = (short) b;
			if (temp < 0) {
				temp = (short) (256 - (temp * -1));
			}
			System.out.print(temp + ".");
		}

	}
}
