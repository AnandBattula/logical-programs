package logicalPrograms;

public class First100PrimeNumbers {
	
	public static void main(String[] args) {
		int num = 2;
		for(int j = 0; j < 10; ) {
			for(int i1 = 2; i1< num; i1++) {
				if(num%i1==0) {
					break;
				}
			}
			if(i == num) {
				j++;
				System.out.println(num);
			}
			num++;
		}
	}

}
