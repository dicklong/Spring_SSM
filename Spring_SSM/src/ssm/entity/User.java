package ssm.entity;

public class User {
	
	public User() {
	}
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	
	private int id;
	private String name;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
