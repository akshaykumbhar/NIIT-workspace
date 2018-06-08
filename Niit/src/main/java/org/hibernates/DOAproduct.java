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
		int Id = Integer.parseInt(id);
		Product userro = (Product) session.get(Product.class,Id);
		session.delete(userro);
	
		session.getTransaction().commit();
		session.close();
	}
	
	public static Product getpro(String id)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		int Id = Integer.parseInt(id);
		Product userro = (Product) session.get(Product.class,Id);
		session.close();
		return userro;
	}
	
	public static void update(String id,String name,String price,String seller,String brand,String description )
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		int Id = Integer.parseInt(id);
		Product userro = (Product) session.get(Product.class,Id);
		userro.setBrand(brand);
		userro.setDescription(description);
		userro.setName(name);
		userro.setPrice(price);
		userro.setSeller(seller);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void add(String name,String price,String seller,String brand,String description )
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		List<Product> pro =  new ArrayList<Product>();
		pro =  session.createQuery("From Product").list();
		int Id = pro.size();
		Product prod = pro.get(Id-1);
		int Id1=prod.getProductId()+1;
		Product userro = new Product();
		userro.setProductId(Id1);
		userro.setBrand(brand);
		userro.setDescription(description);
		userro.setName(name);
		userro.setPrice(price);
		userro.setSeller(seller);
		session.save(userro);
		session.getTransaction().commit();
		session.close();
		
	}
}
