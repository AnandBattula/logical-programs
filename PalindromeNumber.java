package logicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num value:");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while(num!=0)
		{
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("A number is a palindrome");
		}
		else
		{
			System.out.println("A number is not a palindrome");
		}
	}

}
