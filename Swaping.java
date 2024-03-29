package logicalPrograms;

public class Swaping {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Before swapping....");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("After swapping......");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
	}

}
