/**
 * 
 */
package school2.threads.aufgabe1;

/**
 * @author Daniel Stutz
 * 
 */
public class ThreadTest extends Thread {

	/**
	 * @param string
	 */
	public ThreadTest(String string) {
		super(string);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 5; j++) {
			System.out.println("Durchgang " + j + " von Thread "
					+ this.getName());
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + this.getName() + " ist fertig!");
	}
}
