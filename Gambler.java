package Review;

import java.util.Scanner;

public class Gambler 
{
	public static void check(int n)
	{
		int stake=100;
		int bet=0;
		int win=0,lose=0;
		for(int game=1;game<=n;game++)
		{
			bet++;
			if (bet==1)
			{
				win++;
			}
			else
			{
				lose++;
			}
		}

		if(stake>100)
		{
			System.out.println("Won");
		}
		else
		{
			System.out.println("Lose");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Gambler g=new Gambler();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number how many times you want to play:");
		int n=s.nextInt();
		Gambler.check(n);

	}
}
