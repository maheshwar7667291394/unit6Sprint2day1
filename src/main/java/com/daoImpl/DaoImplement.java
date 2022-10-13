package com.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.getEm.GetEmf;

public class DaoImplement implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		  EntityManager em=GetEmf.getEm();
		  em.getTransaction().begin();
		  em.persist(employee);
		  em.getTransaction().commit();
		 
		  
//		  String jpql="select from Employee where empid=select max(empid) from Employee";
//		  Query q=em.createQuery(jpql);
//		  Object obj=q.getSingleResult();
//		  Employee employee1=(Employee)obj;
//		  Employee empl=em.find(Employee.class,1);
		  em.close();
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		  EntityManager em=GetEmf.getEm();
		  Employee emp1=em.find(Employee.class, empId);
		return emp1;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
