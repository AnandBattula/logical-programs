package logicalPrograms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num value :");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("Sum of the digits :"+sum);
	}

}
