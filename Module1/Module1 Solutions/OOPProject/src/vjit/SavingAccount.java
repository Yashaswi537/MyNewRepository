package vjit;

public class SavingAccount extends Account {
	public SavingAccount(long accNum, double balance, PersonAcc p) {
		super(accNum, balance, p);
		// TODO Auto-generated constructor stub
	}
	final double min_bal =500;
	void withdraw(double d)
	{
		if(getBalance()>=min_bal)
		{
			balance = getBalance()-d;
			System.out.println("After withdrawal balance"+balance);
		}
		else
		{
			System.out.println("Amount cannot be withdrawn");
		}
		
	}
	public static void main(String arg[])
	{
		PersonAcc p2 = new PersonAcc("kathy");
		SavingAccount s = new SavingAccount(Account.x,200,p2);
		s.withdraw(500);
	}
}
