package logicalPrograms;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		System.out.println("Factors of Numbers.....");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}