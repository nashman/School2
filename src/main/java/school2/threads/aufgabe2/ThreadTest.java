/**
 * 
 */
package school2.threads.aufgabe2;

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
		int time = (int) (Math.random() * 1000);
		// TODO Auto-generated method stub
		for (int j = 0; j < 5; j++) {
			System.out.println(time + " Durchgang " + j + " von Thread "
					+ this.getName());
			try {
				this.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + this.getName() + " ist fertig!");
	}
}
