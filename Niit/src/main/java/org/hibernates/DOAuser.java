package org.hibernates;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public  class DOAuser {

	
	public static int duser(String username,String password,String email,String fname,String lname,String phone,String address)
	{
		try{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Users u = new Users();
		Userroles ur = new Userroles();
		u.setAddress(address);
		u.setEmail(email);
		u.setFname(fname);
		u.setLname(lname);
		u.setPhone(phone);
		u.setUsername(username);
		u.setEnabled(1);
		u.setPassword(password);
		ur.setRole("ROLE_USER");
		ur.setUsername(username);
		session.save(u);
		session.save(ur);
		session.getTransaction().commit();
		session.close();
		return 1;
		}
		catch (Exception e)
		{
			return 0 ;
		}
	}
		public static void update(String username,String email,String fname,String lname,String phone,String address)
		{
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			Users u = session.get(Users.class, username);
			u.setAddress(address);
			u.setEmail(email);
			u.setFname(fname);
			u.setLname(lname);
			u.setPhone(phone);
			u.setUsername(username);
			u.setEnabled(1);
			
			session.getTransaction().commit();
			session.close();
		}
		
		
	
	public static Users getuser(String uname)

	{
		try
		{
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			Users user = (Users) session.get(Users.class,uname);
			session.close();
			return user;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public static void del (String user)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Users usero = (Users) session.get(Users.class,user);
		Userroles userro = (Userroles) session.get(Userroles.class, user);
		session.delete(userro);
		session.delete(usero);
		session.getTransaction().commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Users> getup()
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		List<Users> pro =  new ArrayList<Users>();
		pro =  session.createQuery("From Users").list();
		session.close();
		return pro;
	}
}
