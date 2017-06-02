package com.melvin.tonia.model;

import java.util.Date;

public class UserHistory {

	private int id;
	private User user;
	
	private Date entryTime;
	private String entry;

	public UserHistory() {
		
	}
	public UserHistory(Date entryTime, String entry) {
		super();
		this.entryTime = entryTime;
		this.entry = entry;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
}
