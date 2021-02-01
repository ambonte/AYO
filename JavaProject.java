/*======Project:Course project                                =====*/
/*======Author: Bonte Emma BANA & Jean Calvin Kimana          ====*/
/*======Date: 1st November 2021                               ===*/
/*======Source: Java The complete Reference ninth edition.    ==*/
import java.util.Scanner;

class Bank
{
	private String phone;
	private String name;
	private long balance;

	Scanner m=new Scanner(System.in);
	
	//method to open an account
	void openAccount()
	{ 
		System.out.print("Enter Names: ");
		name=m.next();
		System.out.print("Enter Phone number: ");
		phone=m.next();
		
		System.out.print("Enter deposit: ");
		balance=m.nextLong();
		System.out.println("#########################################################");
		System.out.println("Balance :"+balance);
		System.out.println("Account number :"+"400-"+phone);
		
	}

	//method to display account details
	void showAccount()
	{ 
		System.out.println(phone+","+name+","+balance);
	}

	//method to deposit money
	void deposit()
	{
		long n;
		System.out.println("Enter Amount you Want to Deposit : ");
		n=m.nextLong();
		balance=balance+n;
	}

	//method to withdraw money
	void withdrawal()
	{
		long n;
		System.out.println("Enter Amount you Want to withdraw : ");
		n=m.nextLong();
		if(balance>=n)
		{ 
			balance=balance-n;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}

	//method to search an account number
	boolean search(String a)
	{ 
		if(phone.equals(a))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}

class JavaProject
{  
	public static void main(String arg[])
	{
		Scanner m=new Scanner(System.in);
		
		
		//create initial accounts
		System.out.print("Welcome to I&M Bank!, Please enter 1 to continue : ");
		int n=m.nextInt();
		Bank  j[]=new Bank[n];
		for(int i=0;i<j.length;i++)
		{   
			j[i]=new Bank();
			j[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int c;
		do
		{
		System.out.println("Select from the following menu options below:\n");
        System.out.println("========================");
        System.out.println("| [1]  Display all  |");
        System.out.println("| [2]  Search       |");
        System.out.println("| [3]  Withdraws    |");
        System.out.println("| [4]  Deposit      |");
        System.out.println("| [5]  Exit         |");
        System.out.println("========================");
        System.out.print("Please select your option now: ");
			c=m.nextInt();
			switch(c)
			{ 
				case 1:
					for(int i=0;i<j.length;i++)
					{
						j[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account Number you Want to Search: ");
					String b=m.next();
					boolean found=false;
					for(int i=0;i<j.length;i++)
					{  
						found=j[i].search(b);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed.");
					}
					break;

				case 3:
					System.out.print("Enter amount you want to withdraw : ");
					b=m.next();
					found=false;
					for(int i=0;i<j.length;i++)
					{  
						found=j[i].search(b);
						if(found)
						{
							j[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Withdraw Failed.");
					}
					break;

				case 4:
					System.out.print("Enter Amount you want to deposit : ");
					b=m.next();
					found=false;
					for(int i=0;i<j.length;i++)
					{  
						found=j[i].search(b);
						if(found)
						{
							j[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Deposit Failed.");
					}
					break;

				case 5:
					System.out.println("Thank you for using I&M Bank");
					break;
			}
		}
		while(c!=5);
		Bank obj = new Bank();
	obj.deposit();
	obj.withdrawal();
	}
	
}
//===============================================================End========================================================//
