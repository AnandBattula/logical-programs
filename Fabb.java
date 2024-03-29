package logicalPrograms;

public class Fabb {
	public static void main(String[] args) {
		int num = 10;
		int firstNum = 0;
		int secondNum = 1;
		int nextNum = 0;
		for(int i = 1; i <= num ; i++)
		{
			System.out.print( firstNum+ " ");
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
		//System.out.println();
	}

}
