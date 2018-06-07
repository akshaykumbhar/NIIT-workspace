package org.hibernates;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DOAproduct {
		
	@SuppressWarnings("unchecked")
	public static List<Product> pdetails()
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		List<Product> pro =  new ArrayList<Product>();
		pro =  session.createQuery("From Product").list();
		session.close();
		return pro;
		
	}
	
	public static void del(String id)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Product userro = (Product) session.get(Product.class,id);
		session.delete(userro);
	
		session.getTransaction().commit();
		session.close();
	}
}
