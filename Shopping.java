import java.util.Scanner;

public class Shopping {
	static int wallet = 3000;
	int donate;
	int sell;
	int buy;
	int trade;
	int returns;
	
	public static void main (String args[]) {
		System.out.println ("*****Welcome to our online shopping store*****" +"\n");
		while (true) {
		
	System.out.println("Please make a selection based on the numbers: " + '\n');
		
		System.out.println ("To Buy Items, enter 1");
		System.out.println ("To sell Items, enter 2");
		System.out.println ("To donate Items, enter 3");
		System.out.println ("For returns, press 4");
		System.out.println ("To trade items, enter 5");
		System.out.println ("Check Balance, enter 6");
		System.out.println ("To leave the store, enter 7"  + "\n\n");
		System.out.println("What would you like to do? ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		switch (number) {
		case 1:		//displays menu for the items in the shop and enables user to purchase itms from the store 
			System.out.println("T-shirts  Enter (1) : 			$8.00");
			System.out.println("Shoes, Enter (2)  : 			$85.00");
			System.out.println("Hats, Enter (3)  : 			$5.00");
			System.out.println("Belts, Enter (4)  : 			$12.00");
			System.out.println("Shorts, Enter (5)  : 			$15.00");
			System.out.println("Pants, Enter (6)  : 			$25.00");
			System.out.println("Which of these would you like to buy? ");
			int number1 = input.nextInt();
			if (number1 == 1 && wallet >= 8.00) {
				System.out.println("A T-shirt has been added to your bag");
				wallet = wallet - 8;
			}
			if (number1 == 2 && wallet >= 85.00) { 
				System.out.println("A Shoe has been added to your bag");
				wallet = wallet - 85;
			}
			if (number1 == 3 && wallet >= 5.00) {
				System.out.println("A Hat has been added to your bag");
				wallet = wallet - 5;
			}
			if (number1 == 4  && wallet >= 12.00) {
				System.out.println("A Belt has been added to your bag");
				wallet = wallet - 12;
			}
			if (number1 == 5 && wallet >= 15.00) {
				System.out.println("A pair of Shorts have been added to your bag");
				wallet = wallet - 15;
			}
			if (number1 == 6 && wallet >= 25.00) {
				System.out.println("A pair of pants have been added to your bag");
				wallet = wallet - 25;
			}
			break;
		case 2:	//case to allow user to sell items to the store 
			String s;
			Scanner in = new Scanner (System.in);
			System.out.println ("Please kindly enter what item you would like to sell");
			s = in.nextLine();
			System.out.println ("How much is the item you would like to sell ");
			float f2 = input.nextFloat();
			System.out.println ("You have succesfully sold your " + s + "\n");
			wallet = (int) (wallet + f2);
			break;
			
		case 3:	//case to allow user donate items to the store
			Scanner sc = new Scanner (System.in);
			System.out.println("What would you like  to donate? ");
			String s1 = sc.nextLine();
			System.out.println("You have succesfully donated "+ s1 + "\n\n");
			break;
			
		case 4:	//Case to allow user return any items they might have purchased and offer them a full refund.
			Scanner sca = new Scanner (System.in);
			System.out.println("What Item would you like to return ? ");
			String s3 = sca.nextLine();
			
			System.out.println("You have successfuly returned the "+ s3);
			
			System.out.println ("Here are the Items you bought from us" );
		case 5:		//Case for trading any items
			Scanner tr = new Scanner (System.in);
			System.out.println("What would you like to Trade? ");
			String s4 = tr.nextLine();
			System.out.println("How much is the " + s4 + " you would like to trade");
			float f3 = input.nextFloat();
			System.out.println("T-shirts  Enter (1) : 			$8.00");
			System.out.println("Shoes, Enter (2)  : 			$85.00");
			System.out.println("Hats, Enter (3)  : 			$5.00");
			System.out.println("Belts, Enter (4)  : 			$12.00");
			System.out.println("Shorts, Enter (5)  : 			$15.00");
			System.out.println("Pants, Enter (6)  : 			$25.00");
			System.out.println ("Which of the above items would you like to trade your " + s4 + " for ? ");
			int number2 = input.nextInt();
			if (number2 == 1) {
				System.out.println("Your " + s4 + " has been traded for T-Shirts" );
				wallet = (int) (wallet - (8 - f3));
			}
			if (number2 == 2) { 
				System.out.println("Your " + s4 + " has been traded for Shoes");
				wallet = (int) (wallet - (85 - f3));
			}
			if (number2 == 3) {
				System.out.println("Your " + s4 + " has been traded for Hats");
				wallet = (int) (wallet - (5 - f3));
			}
			if (number2 == 4) {
				System.out.println("Your " + s4 + " has been traded for Belts");
				wallet = (int) (wallet - (12 - f3));
			}
			if (number2 == 5 && wallet >= 15.00) {
				System.out.println("Your " + s4 + " has been traded for Shorts");
				wallet = (int) (wallet - (15 - f3));
			}
			if (number2 == 6) {
				System.out.println("Your " + s4 + " has been traded Pants");
				wallet = (int) (wallet - (25 - f3));
			}
			
			break;
	
		case 6:		//Case to give show how much they had left in their in their wallet
			System.out.println("Your balance is: " + wallet + "\n");
			break;
		
		case 7:
			System.out.println("\nThank you for for visiting our store!!!");
			System.exit(0);
			
			
		
}	
	}
		}
			}
