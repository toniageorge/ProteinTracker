package com.melvin.tonia.model;

import java.util.ArrayList;
import java.util.Collection;

public class User {

	private int id;
	private String name;
	ProteinData data = new ProteinData();
	//Set<UserHistory> userHistory = new HashSet<UserHistory>();
	//List<UserHistory> userHistory = new ArrayList<UserHistory>();
	//Map<String, UserHistory> userHistory = new HashMap<String, UserHistory>();
	Collection<UserHistory> userHistory = new ArrayList<UserHistory>();
	
	/*public List<UserHistory> getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(List<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}*/

	/*public Map<String, UserHistory> getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(Map<String, UserHistory> userHistory) {
		this.userHistory = userHistory;
	}*/

	/*public Set<UserHistory> getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(Set<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}
*/
	public ProteinData getData() {
		return data;
	}

	public Collection<UserHistory> getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(Collection<UserHistory> userHistory) {
		this.userHistory = userHistory;
	}

	public void setData(ProteinData data) {
		this.data = data;
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



}
