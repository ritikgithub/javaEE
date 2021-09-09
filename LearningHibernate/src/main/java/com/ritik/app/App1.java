package com.ritik.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

import com.ritik.models.Name;
import com.ritik.models.User;
import com.ritik.models.Vehicle;

public class App1 {

	public static void main(String[] args) {
		
		User user =  new User();
		Name name =  new Name();
		name.setFirstname("Ritik");
		name.setLastname("Agarwal");
		user.setId(13);
		user.setName(name);
		user.setUsername("hrithik1998");
		Vehicle v1 = new Vehicle();
		v1.setId(1);
		v1.setVehicleName("Maruti");
		v1.getUsers().add(user);
		Vehicle v2 = new Vehicle();
		v2.setId(2);
		v2.setVehicleName("Honda");
		v2.getUsers().add(user);
		user.getVehicles().add(v1);
		user.getVehicles().add(v2);
		
		Configuration con =  new Configuration().configure();
		
//		ServiceRegistry sRegistry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf =   con.buildSessionFactory();
		
		Session session =  sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(v1);
		session.save(user);
		session.save(v2);
		
		tx.commit();
		session.close();
		
		 session = sf.openSession();
		 tx =  session.beginTransaction();
		
		user = (User) session.get(User.class, 13);
		System.out.println(user.getId()+" "+user.getUsername()+" "+user.getName().getFirstname()+" "+user.getName().getLastname());
		for(Vehicle v: user.getVehicles()) {
			System.out.println(v.getId()+" "+v.getVehicleName());
		}
		tx.commit();
		session.close();
		
		
		
		
	}

}
