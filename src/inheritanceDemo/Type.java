package inheritanceDemo;

public abstract class Type
{
    int accNo;
    String name,actype,tran;
    double amt,amt_wd,amt_dep;
    double balance = 1000000 ; 
	public Type(int accNo,String name,double amt, String tran)
	{
		this.accNo = accNo;
		this.name = name;
		this.amt = amt;
		this.tran = tran;
	}

	public abstract void withdrawal();

	public void deposit()
	{
		balance = balance+amt;
		System.out.println("Amount Deposited : "+amt);
	}

	public void transaction()
	{
		System.out.println("Account details \n");
		System.out.println("Customer ID : "+accNo);
		System.out.println("Customner Name : "+name);

		if( tran.equalsIgnoreCase("withdrawal"))
		{
			withdrawal();
		}

		else
		{
			deposit();
		}

		System.out.println("Balance : "+balance);
	}
}


