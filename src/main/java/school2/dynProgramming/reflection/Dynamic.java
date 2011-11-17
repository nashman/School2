/**
 * 
 */
package school2.dynProgramming.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author Daniel Stutz
 * 
 */
public class Dynamic {
	private ArrayList<Person> persons = new ArrayList<Person>();

	public void setInformation(String className, String attributName,
			String value) {

		// Class Objekt von der Klasse erhalten
		Class<?> cls = null;
		try {
			cls = Class.forName("school2.dynProgramming.reflection."
					+ className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create Person Object
		Object object = null;
		try {
			object = cls.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Methoden heraussuchen
		Method[] methods = new

		// Person Object in die ArrayList
		persons.add((Person) object);
	}
}
