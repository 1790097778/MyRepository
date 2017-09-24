package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//The class have the only one instance
public class DatabaseManager {
	private static DatabaseManager manager;
	private Session session;
	private DatabaseManager()
	{
		 
	}
	public static DatabaseManager getDatabaseManager()
	{
		if(manager==null)
		{
			manager = new DatabaseManager();
			return manager;
		}
		else return manager;
	}
	public Session openSession()
	{
		if(session==null)
		{
			//creating configuration object  
	        Configuration cfg=new Configuration(); 
	        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

	        //creating seession factory object  
	        SessionFactory factory=cfg.buildSessionFactory();  

	        //creating session object  
	        session=factory.openSession();  
		}
			return session;
	}
	
	public void closeSession()
	{
		session.close();
	}
}
