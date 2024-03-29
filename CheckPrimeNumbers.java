package logicalPrograms;

import java.util.Scanner;

public class CheckPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		checkPrime(num);
		
	}
	public static void checkPrime(int num) {
        int count = 0;
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("h");;
		}
		else {
			System.out.println("k");;
		}
	}

}
