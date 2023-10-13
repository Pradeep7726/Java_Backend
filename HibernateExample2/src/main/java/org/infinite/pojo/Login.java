package org.infinite.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class Login {
	private int loginId;
	private String username;
	private String password;
	private Date logintimestamp;

	public Login(int loginId, String username, String password, Date logintimestamp) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.logintimestamp = logintimestamp;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLogintimestamp() {
		return logintimestamp;
	}

	public void setLogintimestamp(Date logintimestamp) {
		this.logintimestamp = logintimestamp;
	}

	public Login() {

	}

	
}
