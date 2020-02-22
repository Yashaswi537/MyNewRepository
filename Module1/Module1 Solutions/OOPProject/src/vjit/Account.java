package vjit;

import java.util.Scanner;

public class Account {
	static long x=101;
    long accNum ;
	double balance;
	PersonAcc p;
	
	public Account(long accNum, double balance, PersonAcc p) {
		//super();
		this.accNum = accNum;
		this.balance = balance;
		this.p = p;
		x++;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
	    this.accNum = x;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double d)
	{
		balance=(getBalance()+d);
		System.out.println("after deposit balance is"+ balance);
	}
	void withdraw(double d)
	{
		balance=(getBalance()-d);
		System.out.println("after withdrawal balance is"+balance);
	}
	
	@Override
	public String toString() {
		return "Account p=" + p.getName() + ", AccNum=" + getAccNum() + ", Balance=" + getBalance() ;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float age;
	//	System.out.println("Enter acc holder name");
	//	String name = sc.nextLine();
		System.out.println("Enter acc holder age");
		try
		{
	age = sc.nextInt();
			if(age<=15) {
				throw new MyException("Age should be above 15");
			}
		}
		catch(MyException e)
		{
			System.out.println("To create a account person must be above 15 years");
			System.out.println(e);
		}
		PersonAcc p1 = new PersonAcc("Smith");
		Account a1 = new Account(x,2000,p1);
		PersonAcc p2 = new PersonAcc("kathy");
		Account a2 = new Account(x,3000,p2);
		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		sc.close();
	}
}
