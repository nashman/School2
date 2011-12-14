/**
 * 
 */
package school2.networking.aufgabe2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

/**
 * @author Daniel Stutz
 * 
 */
public class SimpleEchoServer {
	public static void main(String[] args) {
		ServerSocket echod = null;
		Socket socket = null;

		try {
			System.out.println("Warte auf Verbindung auf Port 7...");
			echod = new ServerSocket(7);
			socket = echod.accept();
			System.out.println("Verbindung hergestellt");
			InputStream in = (InputStream) socket.getInputStream();
			OutputStream out = (OutputStream) socket.getOutputStream();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.toString());
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (echod != null) {
				try {
					echod.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
