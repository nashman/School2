/**
 * 
 */
package school2.threads.aufgabe4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Daniel Stutz
 * 
 */
public class Stopuhr extends Thread {
	private boolean status = true;
	SimpleDateFormat timeFormat = new SimpleDateFormat("H:m:s:S");
	StringBuffer sBuffer = new StringBuffer();

	/**
	 * 
	 */
	public Stopuhr(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date sDate = new Date();

		GregorianCalendar sTime = new GregorianCalendar();
		System.out.println("Startzeit: " + timeFormat.format(sDate));
		System.out.println("press return to stop watch");
		while (status) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
		GregorianCalendar eTime = new GregorianCalendar();
		Date eDate = new Date();
		System.out.println("");
		System.out.println("Stoppzeit: " + timeFormat.format(eDate));
		long timeDiff = eTime.getTimeInMillis() - sTime.getTimeInMillis();

		System.out.println("was: " + timeDiff + " ms");
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
}
