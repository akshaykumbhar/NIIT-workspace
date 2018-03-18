package org.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void login(String rollno,String fname,String dep)
	{
		Student st = new Student();
		st.setRollno(rollno);
		st.setFname(fname);
		st.setDep(dep);
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();
		
	}

	public static String view()
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		String data="<table class='table' ><tr><th>Rollno</th><th>Name</th><th>Department</th></tr> ";
		List st =  session.createQuery("FROM Student").list();
		for( Iterator iterator = st.iterator(); iterator.hasNext();)
		{
			Student s = (Student) iterator.next();
			data = data+"<tr><td>"+s.getRollno()+"</td><td>"+s.getFname()+"</td><td>"+s.getDep()+"</td></tr>";	
		}
	    data = data+"</table>"; 
		session.close();
		return data;
	}
	public static void del(String rollno)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, rollno);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
	}
	public static void update(String rollno,String name,String dep)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, rollno);
		s.setFname(name);
		s.setDep(dep);
		session.getTransaction().commit();
		session.close();
	}
}
