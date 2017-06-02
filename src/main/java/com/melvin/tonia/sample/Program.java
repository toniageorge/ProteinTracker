package com.melvin.tonia.sample;

import java.util.Date;
import java.util.Map.Entry;

import org.hibernate.Session;

import com.melvin.tonia.model.User;
import com.melvin.tonia.model.UserHistory;
import com.melvin.tonia.utility.HibernateUtilities;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello");

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		User user = new User();
		user.setName("TON");
		user.addUserHistory(new UserHistory(new Date(),"Set the name to Ton"));
		
		user.getData().setGoal(250);
		user.getData().setTotal(300);
		user.addUserHistory(new UserHistory(new Date(),"last goal is 250"));
		session.save(user);
		session.getTransaction().commit();		
		//FOR GETTING DATA
		session.beginTransaction();
		//User loadedUser = session.load(User.class, 1);
		User loadedUser = session.get(User.class, 1);
		System.out.println(loadedUser.getName());
		for(UserHistory history : loadedUser.getUserHistory()){
			
			System.out.println(history.getEntryTime()+" "+history.getEntry());
		}
		
		//update
		loadedUser.getData().setTotal(500);
		//loadedUser.getUserHistory().add(new UserHistory(new Date(),"set Total to 500"));
		loadedUser.addUserHistory(new UserHistory(new Date(),"set Total to 500"));
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
		
	}

}
