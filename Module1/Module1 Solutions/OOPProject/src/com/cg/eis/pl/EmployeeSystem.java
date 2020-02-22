package com.cg.eis.pl;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class EmployeeSystem {
	static int i=101;
public void	checkSal(double sal)
{
	try
	{
		if(sal<3000)
		{
			throw new EmployeeException("Employee salary below 3000 is not allowed");
		}
	}
	catch(EmployeeException e)
	{
		System.out.println("Employee salary must be Greater than 3000");
		System.out.println(e);
	}
}
    
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		EmployeeSystem es = new EmployeeSystem();
		
		FileWriter writer = new FileWriter("E:/output.txt");
		System.out.println("Enter employee name first name:");
		String fname =sc.next();
		System.out.println("Enter employee name last name:");
		String lname = sc.next();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		es.checkSal(sal);
		System.out.println("Enter employee designation");
		String designation =sc.next();
		Employee e = new Employee(i,fname,lname,sal,designation);
		e.insurance();
		
		System.out.println("Insurance Scheme to "+e.getFname()+" is :"+e.getInsuranceScheme());
		System.out.println(e.toString());
		writer.write(e.toString());
		
		writer.close();
		sc.close();

	}

}
