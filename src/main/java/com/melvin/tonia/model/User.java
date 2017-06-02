package com.melvin.tonia.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {

	private int id;
	private String name;
	ProteinData data ;
	List<UserHistory> userHistory = new ArrayList<UserHistory>();

	public User (){
		setData(new ProteinData());
	}
	public ProteinData getData() {
		return data;
	}

	public Collection<UserHistory> getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(List<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}

	public void setData(ProteinData data) {
		this.data = data;
		data.setUser(this);
	}

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

	public void addUserHistory(UserHistory history) {
		history.setUser(this);
		userHistory.add(history);
	}

}
