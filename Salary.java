package Assignment3;

import java.util.Arrays;
import java.util.Random;

public class Salary {
	int no_professor=0;
	int years=0;
	public Salary(int no_professor, int years) {
		super();
		this.no_professor = no_professor;
		this.years = years;
	}
	Random random=new Random();
	
	void display(double[][] arr) {
		System.out.println("Elements of the array are: ");   		 
		for(int yr=0;yr<years;yr++) {
			System.out.print("Year->\t");
			for(int prof=0;prof<no_professor;prof++) {
				arr[yr][prof]=random.nextInt(1000);
                System.out.print("Salary::"+arr[yr][prof] + "\t");
            }
            System.out.println("\n");
        }
	}
	void leastsal(double[][] arr) {
		double minValue=arr[0][0];
		for(int yr=0;yr<years;yr++) {
			System.out.print("Year->\t");
			for(int prof=0;prof<no_professor;prof++) {
	                System.out.println(arr[yr][prof]);
	            }
	    }
		int k=-1;
		System.out.println(no_professor);
		for(int prof=0;prof<no_professor;prof++) {
			for(int yr=0;yr<years;yr++) {
	                if (arr[prof][yr] < minValue ) {
	                    minValue = arr[prof][yr];
	                    k=prof;
	                    System.out.println(k);
	                }
	            }
	    }
		System.out.println(k);
	}

}
