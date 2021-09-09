package com.ritik.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ritik.models.Car;

public class App4 {

	public static void main(String[] args) {
		
		Configuration con =  new Configuration().configure().addAnnotatedClass(Car.class);
		SessionFactory sf =   con.buildSessionFactory();	
		Session session =  sf.openSession();
	 Transaction tx = 	session.beginTransaction();
	 
//	 Query query = session.createQuery("select id, color from Car");
//	 query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//	 
//	 System.out.println(query.list().get(0));
	
	Query query =  session.getNamedQuery("Car");
//	SQLQuery query = session.createSQLQuery("select name,person_name from Car c inner join Person p on p.person_id=c.id");
//	query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//	List<HashMap> rows = (List<HashMap>) query.list();
//
//	
//	for(HashMap row : rows) {
//		row.forEach((key,val)-> {
//			System.out.println(key+" "+val);
//		});
//		System.out.println("****");
//	}
	System.out.println(query.list().get(0));
	
//	Object[] c = (Object[]) query.uniqueResult();
//	System.out.println(c[0]+" "+c[1]+" "+c[2]);
	 
//	 Query query = session.createQuery("from Car where color=red");
//	 
//	 List<Car>cars =  (List<Car>)query.list();
//	 for(Car car: cars) {
//		 System.out.println(car);
//	 }
	 
	   
	 

		tx.commit();	
	session.close();
	
	
		return;
	}

}
