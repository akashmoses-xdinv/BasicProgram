package inheritanceDemo;

public class FixedDeposit extends Type
{
	public FixedDeposit(int accNo,String name,double amt, String tran)
	{
		super(accNo,name,amt,tran);
	}

	public void withdrawal()
	{
		System.out.println("Invalid for withdrawal");
	}

}
