package com;

import java.util.Scanner;
class ATM_Card_Dispancer
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount=scan.nextInt();

		int [] rupees={2000, 500, 200, 100, 50, 20, 10};
		int [] count={0,0,0,0,0,0,0};

		if(amount<=0)
		{
			System.out.println("Error: Invalid Amount");
		}
		if(amount % 10!=0)
		{
			System.out.println("Error: The Amount Entered Needs to Be In Multiple Of 10");
		}
		else
		{
			for(int i=0; i<rupees.length; i++)
			{
				if(rupees[i]<amount || rupees[i]==amount)
				{
					count[i]=amount/rupees[i];
					amount=amount%rupees[i];
				}
			}

			for(int i=0; i<count.length; i++)
			{
				if(count[i]!=0)
				{
					System.out.print(count[i]+"*"+rupees[i]+" ");
				}
			}
		}
	}
}
