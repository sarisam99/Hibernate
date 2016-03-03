/**
 * 
 */
package com.sarisam.hinernate.client;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.sarisam.hinernate.entity.Employee;

/**
 * @author lingadal
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Employee employee=new Employee();
		employee.setEmployeeName("sariputra");
		employee.setId(1);
		System.out.println(employee);
	}

}
