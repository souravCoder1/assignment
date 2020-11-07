import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Pies, Pies and Pis");
			System.out.println("Is there a customer in line? (1 = yes, 2 = no) > ");
			int CustomerNoInput = scanner.nextInt();
			if (CustomerNoInput == 1) {
				System.out.println("Are you a Pie Card member? (1 = yes, 2 = no) > ");
				int PieCardmember = scanner.nextInt();

				Map<String, Integer> hm = new HashMap<String, Integer>();

				hm.put("plainpizza", 0);
				hm.put("pepperonipizza", 0);
				hm.put("CherrypiesFull", 0);
				hm.put("Cherrypiesslice", 0);
				hm.put("picharms", 0);

				if (PieCardmember == 1) {
					System.out.println("Welcome Back, Pie Card holder!\n" + "You will receive: \n"
							+ "	Pepperoni pizza for the price of plain\n"
							+ "	$0.25 off per slice or $2.00 off for a whole pie\n" + "	10% off each Pi charm "
							+ "10% off over and above any other discounts if the overall order (after other discounts) is $100.00 or more");

					
					while (true) {
						System.out.println("Please choose an option:\n" + 
								"	1) Update Pizza Order\n" + 
								"	2) Update Cherry Pie Order\n" + 
								"	3) Update Charm Order\n" + 
								"	4) Check Out");
						
						int option = scanner.nextInt();
						
						switch (option) {
						case 1:
							System.out.println();
							break;

						default:
							
						}
					}
					
					
					
					
					
				} else {
					System.out.println("Plain Pizza: $10.000\n" + "Pepperoni Pizza: $12.00"
							+ "$2.00 per slice or $10.00 for a whole pie [a whole pie has 6 slices]"
							+ "$50.00 each Pi charm [they are 14k gold]");
				}
			} else {
				System.exit(0);
			}

		}
//		scanner.close();
	}

}
