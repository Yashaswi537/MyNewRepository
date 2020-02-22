package vjit;

public class CurrentAccount extends Account{
	float overdraft=5000;
	public CurrentAccount(long accNum, double balance, PersonAcc p) {
		super(accNum, balance, p);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double d)
	{
		if(overdraft<=balance)
		{
			balance = balance-d;
			System.out.println("overdraft reached");
		}
		else
		{
			System.out.println("overdraft not reached");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
