import java.util.Scanner;

public class Pie {

	static int pepperonipizzas = 0;
	static int plainpizzas = 0;
	static int cherry_pie_slices = 0;
	static int Pi_charms = 0;
	static int whole_cherry_pie_slices=0;
	static int partial_cherry_pie_slices=0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("Welcome to Pies, Pies and Pis");
			System.out.println("Is there a customer in line? (1 = yes, 2 = no) > ");
			int CustomerNoInput = scanner.nextInt();
			if (CustomerNoInput == 1) {
				System.out.println("Are you a Pie Card member? (1 = yes, 2 = no) > ");
				int PieCardmember = scanner.nextInt();
				switch (PieCardmember) {
				case 1:
					System.out.println("Welcome Back, Pie Card holder!\n" + "You will receive: \n"
							+ "	Pepperoni pizza for the price of plain\n"
							+ "	$0.25 off per slice or $2.00 off for a whole pie\n" + "	10% off each Pi charm "
							+ "10% off over and above any other discounts if the overall order (after other discounts) is $100.00 or more");

					optionchoose1();
					break;
				case 2:
					System.out.println("Welcome Back, Pie Card holder!\r\n" + "You will receive: \r\n"
							+ "	Pepperoni pizza for the price of plain\r\n" + "	$0.25 off a slice of cherry pie\r\n"
							+ "	$2.00 off a whole cherry pie\r\n" + "	$10.00% off each Pi charm "

							+ "");
					optionchoose2();
					break;

				default:

				}

			} else {
				System.exit(0);
			}

		}
	}

	private static void optionchoose1() {

		while (true) {
			System.out.println("Please choose an option:\n" + "	1) Update Pizza Order\n"
					+ "	2) Update Cherry Pie Order\n" + "	3) Update Charm Order\n" + "	4) Check Out");

			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Here is your current order:\r\n" + "	No pizzas ordered\r\n"
						+ "How many plain pizzas would you like for $10.00 each?" + "");
				plainpizzas = scanner.nextInt();
				System.out.println("How many pepperoni pizzas would you like for $12.00 each?");
				pepperonipizzas = scanner.nextInt();
				if (pepperonipizzas < 0) {
					System.out.println("Negative number taken as 0");
					pepperonipizzas = 0;

				}


				break;
			case 2:
				if(cherry_pie_slices==0) {
					System.out.println("How many cherry pie slices would you like for:\r\n" + "	$1.75 per slice\r\n"
							+ "	$8.00 per pie (6 slices)" + "");
					cherry_pie_slices = scanner.nextInt();
					if (cherry_pie_slices > 6) {
						whole_cherry_pie_slices = cherry_pie_slices / 6;
						partial_cherry_pie_slices = cherry_pie_slices % 6;
					}
				}
				
				else if(cherry_pie_slices!=0){
					if (cherry_pie_slices > 6) {
						System.out.println(whole_cherry_pie_slices+" whole cherry pies\r\n" + 
								partial_cherry_pie_slices+" cherry pie slices"
								+ "");
						System.out.println("How many cherry pie slices would you like for:\r\n" + "	$1.75 per slice\r\n"
								+ "	$8.00 per pie (6 slices)" + "");
						cherry_pie_slices = scanner.nextInt();
						if (cherry_pie_slices > 6) {
							whole_cherry_pie_slices = cherry_pie_slices / 6;
							partial_cherry_pie_slices = cherry_pie_slices % 6;
						}
					}
					else {
						System.out.println("cherry pies "+cherry_pie_slices);
					}	
				}

				break;
			case 3:
				System.out.println("Here is your current order:\r\n" + "No gold Pi charms ordered\r\n"
						+ "How many Pi charms would you like for $50.00 each?" + "");
				Pi_charms = scanner.nextInt();
				break;
			case 4:
				float discount=0;
				float total_price = (float) (10.00 * plainpizzas + 12.00 * pepperonipizzas + 8.00 * whole_cherry_pie_slices + 1.75 * partial_cherry_pie_slices + 45.00 * Pi_charms);
				if(total_price>100) {
					discount = total_price*10/100;
				}
				float New_subtotal=total_price-discount;
				System.out
						.println("Here is your subtotal:\r\n" + 
								"\r\n" + 
								" plain pizzas at $10.00ea.:			$" + 10.00 * plainpizzas + "\r\n" 
								+ whole_cherry_pie_slices + " whole cherry pies at $8.00ea.:		$"+ (8.00 * whole_cherry_pie_slices)+"\r\n" + 
								+ partial_cherry_pie_slices +" cherry pie slices at $1.75ea.:		$" + (1.75 * partial_cherry_pie_slices)+"\r\n" + 
								+ Pi_charms +" 14K gold Pi charms at $45.00ea.:		$"+ (45.00 * Pi_charms)+"\r\n" + 
								"Subtotal:					$"+total_price+"\r\n" + 
								"Bonus discount of 10%:				($"+discount+")\r\n" + 
								"						-------\r\n" + 
								"New subtotal:					$"+New_subtotal+"\r\n" + 
								"Tax:						$"+New_subtotal*7/100+"\r\n" + 
								"						-------\r\n" + 
								"Total:						$"+New_subtotal*107/100+"\r\n" + 
								"\r\n" + 
								"\r\n" + 
								"	Please enter your payment amount:		$"+ Math.ceil(New_subtotal * 107 / 100)+"\r\n" + 
								
								"	Your change:					$"+((Math.ceil(New_subtotal * 107 / 100))- New_subtotal * 107 / 100)+"\r\n" + 
							
								"	Thank you for shopping at PP&P!"
								+ "");
				
				pepperonipizzas = 0;
				plainpizzas = 0;
				cherry_pie_slices = 0;
				Pi_charms = 0;
				whole_cherry_pie_slices = 0;
				partial_cherry_pie_slices = 0;

				break;
			default:
				break;
			}
		}
	}
	private static void optionchoose2() {

		while (true) {
			System.out.println("Pepperoni pizza for the price of plain\r\n" + 
					"	$0.25 off a slice of cherry pie\r\n" + 
					"	$2.00 off a whole cherry pie\r\n" + 
					"	$10.00% off each Pi charm");

			int option = scanner.nextInt();

			
			switch (option) {
			case 1:
				System.out.println("Here is your current order:\r\n" + "	No pizzas ordered\r\n"
						+ "How many plain pizzas would you like for $10.00 each?" + "");
				plainpizzas = scanner.nextInt();
				System.out.println("How many pepperoni pizzas would you like for $12.00 each?");
				pepperonipizzas = scanner.nextInt();
				if (pepperonipizzas < 0) {
					System.out.println("Negative number taken as 0");
					pepperonipizzas = 0;

				}

				break;
			case 2:
				if(whole_cherry_pie_slices==0&&partial_cherry_pie_slices==0) {
					System.out.println("Here is your current order:\r\n" + 
							"No cherry pie slices ordered\r\n" + 
							"How many cherry pie slices would you like for:\r\n" + 
							"	$1.75 per slice\r\n" + 
							"	$8.00 per pie (6 slices)");
				}
				cherry_pie_slices = scanner.nextInt();
				if (cherry_pie_slices > 6) {
					whole_cherry_pie_slices = cherry_pie_slices / 6;
					partial_cherry_pie_slices = cherry_pie_slices % 6;
				}
				System.out.println("Here is your current order:\r\n" + 
						"	"+whole_cherry_pie_slices+" whole cherry pies\r\n" + 
						"	"+partial_cherry_pie_slices+" cherry pie slices"
						+ "");
				break;
			case 3:
				System.out.println("Here is your current order:\r\n" + 
						"No gold Pi charms ordered\r\n" + 
						"How many Pi charms would you like for $45.00 each?");
				Pi_charms = scanner.nextInt();
				break;
			case 4:
				
				float total_price = (float) (10.00 * plainpizzas + 12.00 * pepperonipizzas + 10.00 * whole_cherry_pie_slices + 2.00 * partial_cherry_pie_slices + 50.00 * Pi_charms);
				System.out
						.println("Here is your subtotal:\r\n" + "\r\n" + "	" + plainpizzas
								+ " plain pizzas at $10.00ea.:			$" + 10.00 * plainpizzas + "\r\n" + "	"
								+ pepperonipizzas + " pepperoni pizzas at $12.00ea.:		$"
								+ (12.00 * pepperonipizzas)+ "\r\n" + "	"
								+ whole_cherry_pie_slices + " whole cherry pies at $10.00ea.:		$"
								+ (10.00 * whole_cherry_pie_slices) + "\r\n" + "	" + partial_cherry_pie_slices
								+ " cherry pie slices at $2.00ea.:		$" + (2.00 * partial_cherry_pie_slices) + "\r\n"
								+ "	" + Pi_charms + " 14K gold Pi charms at $50.00ea.:		$" + (50.00 * Pi_charms)
								+ "\r\n" + "							-------\r\n"
								+ "	Subtotal:					$"
								+ (10.00 * plainpizzas +12.00 * pepperonipizzas + 10.00 * whole_cherry_pie_slices
										+ 2.00 * partial_cherry_pie_slices + 50.00 * Pi_charms)
								+ "\r\n" + "	Tax:						$"
								+ (10.00 * plainpizzas + 12.00 * pepperonipizzas + 10.00 * whole_cherry_pie_slices
										+ 2.00 * partial_cherry_pie_slices + 50.00 * Pi_charms) * 7 / 100
								+ "\r\n" + "							-------\r\n"
								+ "	Total:						$"
								+ total_price * 107 / 100
								+ "\r\n" + "\r\n" + "\r\n" + "	Please enter your payment amount:		$"
								+ Math.ceil(total_price * 107 / 100)
								+ "\r\n" + "	Your change:					$"
								+ ((Math.ceil(total_price * 107 / 100))- total_price * 107 / 100)
								+ "\r\n" + "	Thank you for shopping at PP&P!" + "");

				pepperonipizzas = 0;
				plainpizzas = 0;
				cherry_pie_slices = 0;
				Pi_charms = 0;
				whole_cherry_pie_slices = 0;
				partial_cherry_pie_slices = 0;
				break;
			default:
				break;
			}
		}
	}
}