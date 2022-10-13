package com.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.getEm.GetEmf;

public class Main {
	public static void main(String[] args) {
		EmployeeDao edo=new DaoImplement();
		Employee employee=new Employee();
		EntityManager em=GetEmf.getEm();
//		employee.setEmpid(10);
//		employee.setName("hsi9tal");
//		employee.setAddress("jyg");
//		employee.setSalary(800000);
//		try {
//			Employee empl=edo.registerEmployee(employee);
//			System.out.println(empl);
//		} catch (EmployeeException e) {
//			System.out.println("emp not found");
//			e.printStackTrace();
//		}
//		
//		  String jpql=" from Employee where empid= (max(empid) from Employee)";
//		  Query q=em.createQuery(jpql);
//		  Object obj=q.getSingleResult();
//		  Employee employee1=(Employee)obj;
//		  System.out.println(employee1);
//		
		
		try {
			Employee empl1=edo.getEmployeeById(1);
			System.out.println(empl1);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
