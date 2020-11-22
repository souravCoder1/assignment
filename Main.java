package Assignment3;

import java.util.Scanner;

public class Main {
	static int no_professor;
	static int Years;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Professor");
		no_professor=sc.nextInt();
		System.out.println("Enter Number of Years");
		Years=sc.nextInt();
		Salary sal=new Salary(no_professor, Years);
		double arr[][]=new double[no_professor][Years];
		sal.display(arr);
		sal.leastsal(arr);
	}   
}
