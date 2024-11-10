package method;

import java.io.Serializable;

public class User implements Serializable {
	private String user;
	private String pwd;
	private String email;
	public User(String user, String pwd, String email, String address) {
		super();
		this.user = user;
		this.pwd = pwd;
		this.email = email;
		this.address = address;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String address;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
