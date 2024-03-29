package logicalPrograms;

public class ArmStrong1 {
	public static void main(String[] args) {
		int num = 153;
		int length = 0;
		
		// to find the length
		while(num != 0)
		{
			length = length+1;
			num= num/10;  // quotient value
		}
		int rem = 0;
		int arm = 0;
		while(num != 0)
		{
			rem = num%10;  // remainder value
			int multi = 1;
			for(int i=1; i<=length; i++)
			{
				multi = multi*rem;
			}
			num = num/10;
			arm = arm+multi;
		}
		if(num==arm)
		{
			System.out.println("  ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}

}
