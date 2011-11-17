package school2.dynProgramming.reflection;

import java.awt.List;
import java.util.ArrayList;

public class Person {
	private String firstname;
	private String lastname;
	private ArrayList<Address> addressList=new ArrayList<Address>();
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	
}
