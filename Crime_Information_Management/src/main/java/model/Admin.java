package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

}
