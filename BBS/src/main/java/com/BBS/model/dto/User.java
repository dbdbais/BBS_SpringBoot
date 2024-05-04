package com.BBS.model.dto;

public class User {
	private String user_id;
	private String password;
	private String user_name;
	private String join_date;
	private String birth;
	private boolean isAdmin;
	private boolean isStaff;
	
	public User() {
		super();
	}

	public User(String user_id, String password, String user_name, String join_date, String birth, boolean isAdmin,
			boolean isStaff) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.user_name = user_name;
		this.join_date = join_date;
		this.birth = birth;
		this.isAdmin = isAdmin;
		this.isStaff = isStaff;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isStaff() {
		return isStaff;
	}

	public void setStaff(boolean isStaff) {
		this.isStaff = isStaff;
	}
	

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", password=" + password + ", user_name=" + user_name + ", isAdmin="
				+ isAdmin + ", isStaff=" + isStaff + "]";
	}
	
	
}
