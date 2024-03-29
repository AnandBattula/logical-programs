package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		
		int revNum = 0;
		
		while(num != 0) {
			revNum = revNum * 10 + num%10;
			num = num / 10;
		}
		System.out.println(revNum);
	}

}
