import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		while (true) {
			System.out.println("Welcome to Pies, Pies and Pis");
			System.out.println("Is there a customer in line? (1 = yes, 2 = no) > ");
			int CustomerNoInput = scanner.nextInt();
			if (CustomerNoInput == 1) {
				System.out.println("Are you a Pie Card member? (1 = yes, 2 = no) > ");
				int PieCardmember = scanner.nextInt();

				Map<String, Integer> hm = new 	HashMap<String, Integer>();

				hm.put("plainpizza", 0);
				hm.put("pepperonipizza", 0);
				hm.put("CherrypiesFull", 0);
				hm.put("Cherrypiesslice", 0);
				hm.put("picharms", 0);
				
				switch(PieCardmember) {
					case 1:
						System.out.println("Welcome Back, Pie Card holder!\r\n" + 
								"You will receive: \r\n" + 
								"	Pepperoni pizza for the price of plain\r\n" + 
								"	$0.25 off a slice of cherry pie\r\n" + 
								"	$2.00 off a whole cherry pie\r\n" + 
								"	$10.00% off each Pi charm "
					
								+ "");
						optionchoose();

					case 2:
						System.out.println("Welcome Back, Pie Card holder!\n" + "You will receive: \n"
								+ "	Pepperoni pizza for the price of plain\n"
								+ "	$0.25 off per slice or $2.00 off for a whole pie\n" + "	10% off each Pi charm "
								+ "10% off over and above any other discounts if the overall order (after other discounts) is $100.00 or more");	
						
						optionchoose();
						break;
	
					default:
						break;
				}

			} else {
				System.exit(0);
			}

		}
//		scanner.close();
	}

	private static void optionchoose() {
		while (true) {
			System.out.println("Please choose an option:\n" + 
					"	1) Update Pizza Order\n" + 
					"	2) Update Cherry Pie Order\n" + 
					"	3) Update Charm Order\n" + 
					"	4) Check Out");
			
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Here is your current order:\r\n" + 
						"	No pizzas ordered\r\n" + 
						"How many plain pizzas would you like for $10.00 each?"
						+ "");
				int plainpizzas=scanner.nextInt();
				System.out.println("How many pepperoni pizzas would you like for $12.00 each?");
				int pepperonipizzas=scanner.nextInt();
				if(pepperonipizzas<0) {
					System.out.println("Negative number taken as 0");
					pepperonipizzas=0;
					
				}
				break;
			case 2:
				System.out.println("How many cherry pie slices would you like for:\r\n" + 
						"	$1.75 per slice\r\n" + 
						"	$8.00 per pie (6 slices)"
						+ "");
				int cherry_pie_slices= scanner.nextInt();
				break;
			case 3:
				System.out.println("Here is your current order:\r\n" + 
						"No gold Pi charms ordered\r\n" + 
						"How many Pi charms would you like for $50.00 each?"
						+ "");
				int Pi_charms=scanner.nextInt();
			default:
				break;
			}	
	}}}
