package model;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String usename;
	private String pass;
	public Customer(int id, String name, String email, String phone, String usename, String pass) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.usename = usename;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsename() {
		return usename;
	}

	public String getPass() {
		return pass;
	}

}
