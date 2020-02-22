package com.cg.eis.bean;

import com.cg.eis.service.EmployeeService;

public class Employee implements EmployeeService {
	
	static int i=101;
	private int id;
    private	String fname;
	private String lname;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	
	public Employee(int id, String fname, String lname, double salary, String designation) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.designation = designation;
	//	this.insuranceScheme= insuranceScheme;
		i++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = i;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme =insuranceScheme;

	}
	@Override
	public String toString() {
		return "id=" + id + ", Name=" + fname+" "+lname + ", salary=" + salary + ", designation="
				+ designation ;
	}
	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		//Employee e = new Employee() ;
//		Scanner sc = new Scanner(System.in);
			String designation = getDesignation();
			double salary = getSalary();
	if(designation.equalsIgnoreCase("System Associate") && (salary>5000 && salary<20000))
	{
		setInsuranceScheme("SCHEME C");
	}
	else if(designation.equalsIgnoreCase("Programmer") && (salary>=20000 && salary<40000))
	{
		setInsuranceScheme("SCHEME B");
	}
	else if(designation.equalsIgnoreCase("Manager") && salary>=40000 )
	{
		 setInsuranceScheme("SCHEME A");
	}
	else if(designation.equalsIgnoreCase("Clerk") && salary<5000)
	{
		setInsuranceScheme("NO SCHEME");
		}
	}
		
	}
	

	


