/**
 * 
 */
package school2.dynProgramming.reflection;

import java.lang.reflect.InvocationTargetException;
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
		Object p1 = null;
		try {
			p1 = cls.newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Methode erhalten.
		Class[] methoddeclaration = new Class[] { String.class };
		// Method method = cls.getMethod("set" + attributName,
		// methoddeclaration);
		Method method = null;
		try {
			method = cls.getMethod("setFirstname", methoddeclaration);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Methode: " + method.toString());

		// search method
		// Method[] methods = cls.getMethods();
		Object[] args = new Object[] { value };
		Person p2 = null;
		try {
			p2 = (Person) method.invoke(p1, args);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Person Object in die ArrayList
		persons.add(p2);

		showPersons();
	}

	/**
	 * 
	 */
	private void showPersons() {
		// TODO Auto-generated method stub
		System.out.println("wie gross ist das ArrayList: " + persons.size());
		persons.get(0).setFirstname("nicole");
		System.out.println("firstname: " + persons.get(0).getFirstname());
		// for (Person p : persons) {
		// System.out.println("Firstname: " + p.getFirstname());
		// }
	}
}
