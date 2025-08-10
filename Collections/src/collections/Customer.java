package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Customer {
	private int id;
	private String name;
	private Long contact;
	private String location;
	
	public Customer(int id, String name, Long contact, String location) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;                       //no need of setters becaiuse we not setting the values taking values by new to object
	}*/
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public Long getContact() {
		return contact;
	}
	/*public void setContact(Long contact) {
		this.contact = contact;
	}*/
	public String getLocation() {
		return location;
	}
	/*public void setLocation(String location) {
		this.location = location;
	}*/
	
	@Override
	public String toString() {
		return "CustomerExample [id=" + id + ", name=" + name + ", contact=" + contact + ", location=" + location + "]";
	}
	
	
}



