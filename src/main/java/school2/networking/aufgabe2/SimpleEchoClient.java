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
import java.net.UnknownHostException;

/**
 * @author Daniel Stutz
 * 
 */
public class SimpleEchoClient {
	public static void main(String[] args) {
		Socket sock = null;

		try {
			InetAddress adr = InetAddress.getByName("localhost");
			sock = new Socket(adr, 7);
			OutputStream out = sock.getOutputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					sock.getInputStream()));
			System.out.println("Start");
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (sock != null) {
			try {
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
