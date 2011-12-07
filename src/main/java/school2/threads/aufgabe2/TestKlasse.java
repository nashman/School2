/**
 * 
 */
package school2.threads.aufgabe2;

/**
 * @author Daniel Stutz
 * 
 */
public class TestKlasse {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("Thread 1");
		t1.start();
		ThreadTest t2 = new ThreadTest("Thread 2");
		t2.start();
		ThreadTest t3 = new ThreadTest("Thread 3");
		t3.start();
	}
}