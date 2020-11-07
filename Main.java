import java.util.*;

class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Pies, Pies and Pis");
		while(true) {
			System.out.println("Is there a customer in line?");
			System.out.println("1 = yes, 2 = no");
			Scanner sc=new Scanner(System.in);
			int cusline =sc.nextInt();
			switch(cusline) {
			case 1:
				System.out.println("Are you a Pie Card member? (1 = yes, 2 = no)");
				int piemember=sc.nextInt();
					switch(piemember) {
					case 1:
						System.out.println("Please choose an option:");
						System.out.println("1) Update Pizza Order");
						System.out.println("3) Update Charm Order");
						System.out.println("2) Update Cherry Pie Order	");
						System.out.println("4) Check Out");

					case 2:
						System.out.println(""
								+ "Welcome Back, Pie Card holder!\r\n" + 
								"You will receive: \r\n" + 
								"	Pepperoni pizza for the price of plain\r\n" + 
								"	$0.25 off a slice of cherry pie\r\n" + 
								"	$2.00 off a whole cherry pie\r\n" + 
								"	$10.00% off each Pi charm \r\n" + 
								"Please choose an option:\r\n" + 
								"	1) Update Pizza Order\r\n" + 
								"	2) Update Cherry Pie Order\r\n" + 
								"	3) Update Charm Order\r\n" + 
								"	4) Check Out"
						);
					}
			case 2:
				return;
			}
		}
	}
}