package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
public class InserData {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setName("Atharv");
		employee.setSalary(30000);
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session =factory.openSession();
		
		Transaction tx = session.beginTransaction();

		session.save(employee);

		tx.commit();

		session.close();

		factory.close();
	}

}
