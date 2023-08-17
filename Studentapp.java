import java.util.Scanner;

public class Studentapp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Student s1 = new Student();
	System.out.println("enter ur name=");
	s1.name = scan.next();
	System.out.println("enter ur rollnumber=");
	s1.rollnumber = scan.nextInt();
	System.out.println("enter ur cgpa=");
	s1.cgpa = scan.nextDouble();
System.out.println("name="+s1.name+",\nrollnumber="+s1.rollnumber+",\ncgpa="+s1.cgpa);
s1.study();
s1.markattendance();
System.out.println("**************************************************");
System.out.println();
     Student s2 =new Student();
     System.out.println("Enter ur name=");
     s2.name = scan.next();
     System.out.println("Enter ur rollnumber=");
     s2.rollnumber = scan.nextInt();
     System.out.println("Enter ur cgpa=");
     s2.cgpa = scan.nextDouble();
     System.out.println("name ="+s2.name+",\nrollnumber="+s2.rollnumber+",\ncgpa="+s2.cgpa);
     s2.study();
     s2.markattendance();
     scan.close();
     
    
	}

}
