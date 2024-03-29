package logicalPrograms;

import java.util.Scanner;

public class PrimeNumberBetween_M_and_N {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m value:");
		int m = sc.nextInt();
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		for(int i=m; i<=n; i++)
		{
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");			
			}
		}
	}

}
