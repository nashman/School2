/**
 * 
 */
package school2.networking.aufgabe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Daniel Stutz
 * 
 */
public class HttpClientTest {

	public static void main(String[] args) {
		Socket sock = null;
		try {
			InetAddress adr = InetAddress.getByName(args[0]);
			sock = new Socket(adr, 80);
			OutputStream out = sock.getOutputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					sock.getInputStream()));
			String s = " GET " + args[1] + " HTTP/1.0" + "\r\n\r\n";
			out.write(s.getBytes());
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.toString());
		} finally {
			if (sock != null) {
				try {
					sock.close();
				} catch (IOException e) {
					// TODO: handle exception
					System.err.println(e.toString());
				}
			}
		}
	}
}
