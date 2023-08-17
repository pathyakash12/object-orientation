import java.util.Scanner;

public class Trainerapp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Trainer t1 = new Trainer();
		//t1.givendata("arun",123,"java",100.00);
		//t1.givendata();
		System.out.println("name="+t1.name+",Id="+t1.Id+",skills="+t1.skills+",salary="+t1.salary);
		t1.teach();
		t1.assesst();
		System.out.println("**********************************");
		System.out.println();
		Trainer t2 = new Trainer();
		//t3.givendata("akash",456,"javascript",200.00);
		//t2.givendata();
		System.out.println("name="+t2.name+",Id="+t2.Id+",skills="+t2.skills+",salary="+t2.salary);
		t2.teach();
		t2.assesst();
		System.out.println("**********************************");
		System.out.println();

		Trainer t3 =new Trainer();
		//t3.givendata();
		System.out.println("name="+t3.name+",Id="+t3.Id+",skills="+t3.skills+",salary="+t3.salary);
		t3.teach();
		t3.assesst();
        scan.close();
	}

}
