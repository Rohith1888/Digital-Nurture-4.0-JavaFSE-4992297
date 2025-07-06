package com.cognizant.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

import com.cognizant.hibernate.model.Employee;

public class App {

    private static SessionFactory factory;

    public static void main(String[] args) {
        factory = new Configuration().configure().buildSessionFactory();

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Rohith");
        emp.setSalary(65000.0);

        Integer empId = addEmployee(emp);
        System.out.println("Inserted Employee with ID: " + empId);
        factory.close();
    }

    public static Integer addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
