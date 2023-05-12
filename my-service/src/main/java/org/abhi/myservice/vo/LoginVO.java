package org.abhi.myservice.vo;

public class LoginVO {
	private String userName;
	private String password;
	public LoginVO() {
		super();
	}
	public LoginVO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
}
