package myatm;
import java.util.Scanner;
class BankAccount
{
	private double bank_balance;
	BankAccount(double initial_bankbalance)
	{
		this.bank_balance=initial_bankbalance;
	}
	public double get_balance()
	{
		return bank_balance;
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			System.out.println();
			System.out.println("	Transection Successfully!!");
			bank_balance=bank_balance+amount;
			System.out.println("	your Rs. "+amount+" amount is successfully deposite in your account.");
			System.out.println("	Now your Bank Balance is :"+bank_balance);
		}
		else
		{
			System.out.println();
			System.out.println("	You Enter Invaild Amount.");
			System.out.println("	Please Enter Vaild Amount.");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<bank_balance)
		{
			System.out.println();
			System.out.println("	Transection Successfully!!");
			bank_balance=bank_balance-amount;
			System.out.println("	Rs. "+amount+" Amount is Withdraw From Your Account.");
			System.out.println("	Now Your Bank Balance is : Rs. "+bank_balance);
		}
		else if(amount<0)
		{
			System.out.println();
			System.out.println("	Your Enter Invaild Amount");
			System.out.println("	Please Enter Vaild Amount.");
			
		}
		else
		{
			System.out.println();
			System.out.println("	You Have Not Sufficient Amount.");
			System.out.println("	Please Enter Vaild Amount.");
			System.out.println("	Your Bank Balance is : Rs. "+bank_balance+" Please Enter Less Than Your bank Balance.");
		}
	}
	
}

public class Atminterface
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("|                   -:ATM MACHINE:-                      |");
		System.out.println("|                                                        |");
		System.out.println("|                       WELCOME                          |");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		double initial_bank_balance=20000;
		BankAccount ac=new BankAccount(initial_bank_balance);
		double amount;
		do
		{
			System.out.println();
			System.out.println("	      -:MENU:-");
			System.out.println();
			System.out.println("	1...Check Balance.");
			System.out.println("	2...Deposite.");
			System.out.println("	3...Withdraw.");
			System.out.println("	4...Exit.");
			System.out.print("	Please Enter Choice Which You Want to Do  :");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("	Your Current Balance is = Rs. "+ac.get_balance());
						break;
				case 2: System.out.print("	Please Enter Amount That You Want to Deposite: ");
						amount=sc.nextDouble();
						ac.deposite(amount);
						break;
				case 3: System.out.print("	Please Enter Amount That You Want to Withdraw: ");
					    amount=sc.nextDouble();
						ac.withdraw(amount);
						break;
				case 4: System.out.println();
						System.out.println("	Thank You!.....");
					    System.exit(0); 
						break;
				default: System.out.println("	Invalid Choice!");
			}
		
		}while(true);
	}

}
