package inheritanceDemo;

public class Bank {

	public static void main(String[] args)
	{
		FixedDeposit f = new FixedDeposit(123,"Akash",2000,"Deposit");
		CurrentAccount c = new CurrentAccount(1234,"Moses",2500,"Withdrawal");
		c.transaction();
		f.transaction();
		System.out.println("Details");

	}

}
