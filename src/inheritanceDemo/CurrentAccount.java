package inheritanceDemo;

public class CurrentAccount extends Type
{
	public CurrentAccount(int accNo,String name,double amt, String tran)
	{
		super(accNo,name,amt,tran);
	}

	public void withdrawal()
	{
		balance = balance-amt;
		System.out.println("Amount Withdrawn : "+amt);
	}

}
