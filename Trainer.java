import java.util.Scanner;

public class Trainer {
	String name;
	int Id;
	String skills;
	double salary;
	void teach()
	{
		System.out.println("teaching for day & night .");
	}
	void assesst()
	{
		System.out.println("assesst an assessnment per a day.");
	}
//	Trainer(String a,int b, String c,double d)
//	{
//		name   = a;
//		Id     = b;
//		skills = c;
//		salary = d;
//	}
	Scanner scan = new Scanner(System.in);

Trainer()
{
System.out.println("Enter your name=");
name = scan.next();
System.out.println("Enter your Id=");
Id   = scan.nextInt();
    System.out.println("Enter your skills=");
	skills =scan.next();
	System.out.println("Enter your salary=");
	salary = scan.nextDouble();

	
			
}
}
