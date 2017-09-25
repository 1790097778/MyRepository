package controller;

import org.hibernate.Session;
//Used for managing the database;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//The class have the only one instance
public class DatabaseManager {
	private static DatabaseManager manager;

	private DatabaseManager() {
	}

	public static DatabaseManager getDatabaseManager() {
		if (manager == null) {
			manager = new DatabaseManager();
			return manager;
		} else
			return manager;
	}
	//Don't share the session instance between threads;
	public Session getSession() {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();
		return session;

	}

}
