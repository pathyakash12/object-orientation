import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	int sub =subtractNumbers(num1,num2);
	int multi = multiplyNumbers(num1,num2);
	 double div =divideNumbers(num1,num2);
	 int modulos =findRemainder(num1,num2);
	 System.out.println(sub);
	 System.out.println(multi);
	 System.out.println(div);
     System.out.println(modulos);	
	scan.close();
	}

	private static int findRemainder(int num7, int num8) {
	
		return num7%num8;
	}

	private static double divideNumbers(int num5, int num6) {
		
		return num5/num6;
	}

	private static int multiplyNumbers(int num3, int num4) {
		return num3*num4;
	}

	private static int subtractNumbers(int num1, int num2) {
		
		return num1-num2;
	}

}
