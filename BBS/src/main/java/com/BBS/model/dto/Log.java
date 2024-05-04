package com.BBS.model.dto;

public class Log {
	private String user_id;
	private String logIn_time;
	private String logOut_time;
	
	public Log() {
		super();
	}

	public Log(String logIn_time, String logOut_time) {
		super();
		this.logIn_time = logIn_time;
		this.logOut_time = logOut_time;
	}
	
	public String getLogIn_time() {
		return logIn_time;
	}

	public void setLogIn_time(String logIn_time) {
		this.logIn_time = logIn_time;
	}

	public String getLogOut_time() {
		return logOut_time;
	}

	public void setLogOut_time(String logOut_time) {
		this.logOut_time = logOut_time;
	}

	@Override
	public String toString() {
		return "Log [logIn_time=" + logIn_time + ", logOut_time=" + logOut_time + "]";
	}
	
	
}
