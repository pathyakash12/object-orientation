import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		 long sum = galacticAddition(num1, num2);
		 System.out.println("sum =");
		
	}
	public static long galacticAddition(long num1,long num2) {
		 
		return num1+ num2;
		
	}
}
