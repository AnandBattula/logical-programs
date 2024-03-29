package logicalPrograms;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value :");
		int num = sc.nextInt();
		int remainder,length = 0;
		double result = 0;
		
		int temp = num;
		
		// to find length
		while(num!=0) {
			length = length +1;
			num=num/10;
		}
		
		while(num!=0)
		{
			remainder = num%10;
			result = result+Math.pow(remainder, length);
			num = num/10;
			
		}
		if(result==num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
	
}
