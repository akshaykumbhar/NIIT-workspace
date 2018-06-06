package org.hibernate;

import org.hibernate.cfg.Configuration;

public class DOAuser {
	
	
	
	public int duser(String username,String password)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Users u = new Users();
		User_roles ur = new User_roles();
		u.setUsername(username);
		u.setEnabled(1);
		u.setPassword(password);
		ur.setRole("ROLE_USER");
		ur.setUsername(username);
		session.save(u);
		session.save(ur);
		session.getTransaction().commit();
		session.close();
		return 0 ;
	}

}
