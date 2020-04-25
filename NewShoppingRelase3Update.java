/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopping;

/**
 *
 * @author kachingwaba
 */
import java.util.Scanner;

public class Shopping {
	int donate;
	int sell;
	int buy;
	int trade;
	int returns;
        
    public  static class StoreAccountBalance{ //Class that acts as the account balance for user
        static float balance = 3000;
        private static StoreAccountBalance instance = new StoreAccountBalance(balance);
        
        private StoreAccountBalance(float balance){}
        
        public static StoreAccountBalance getInstance(){
            return instance;
        }
        
        public void addBalance(float cost) {
            balance += cost;
        }
        
        public void subtractBalance(float cost) {
            balance -= cost;
        }
        
        public float returnBalance() {
            return balance;
        }
    }
    
    
    public static class TransactionStatement{ //Class that will print transaction statment after use of program
        static float costs = 0;
        static float deposits = 0;
        private static TransactionStatement instance = new TransactionStatement();
        
        private TransactionStatement(){}
        
        public static TransactionStatement getInstance(){
                return instance;
        }
        public void addDeposits(float deposit){
            deposits += deposit;
        }
        
        public void addCosts(float cost){
            costs += cost;
        }
        
        public void displayStatement(){
            System.out.println("   Transaction Statement");
            System.out.println("Purchases:\t\t" +costs);
            System.out.println("Profits:\t\t" +deposits);
        }
        
        
    }
	
	public static void main (String args[]) {
            
                StoreAccountBalance Account = StoreAccountBalance.getInstance(); //Creates instance of Bank Account for user
                TransactionStatement Report = TransactionStatement.getInstance(); // Creates instance of Transaction Statement for user
                
		System.out.println ("*****Welcome to our online clothing store*****" +"\n");
		while (true) {
		
	System.out.println("Please make a selection: " + '\n');
		
		System.out.println ("1) Buy item");
		System.out.println ("2) Sell item");
		System.out.println ("3) Donate item");
		System.out.println ("4) Return item");
		System.out.println ("5) Trade item");
		System.out.println ("6) Check balance");
		System.out.println ("7) Exit"  + "\n");
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
			if (number1 == 1 && Account.returnBalance() >= 8.00) {
				System.out.println("A T-shirt has been added to your bag");
                                 Account.subtractBalance(8);
                                 Report.addCosts(8);
			}
			if (number1 == 2 && Account.returnBalance() >= 85.00) { 
				System.out.println("A Shoe has been added to your bag");
                                 Account.subtractBalance(85);
                                 Report.addCosts(85);
			}
			if (number1 == 3 && Account.returnBalance() >= 5.00) {
				System.out.println("A Hat has been added to your bag");
                                 Account.subtractBalance(5);
                                 Report.addCosts(5);
			}
			if (number1 == 4  && Account.returnBalance() >= 12.00) {
				System.out.println("A Belt has been added to your bag");
                                Account.subtractBalance(12);
                                 Report.addCosts(12);
			}
			if (number1 == 5 && Account.returnBalance() >= 15.00) {
				System.out.println("A pair of Shorts have been added to your bag");
                                Account.subtractBalance(15);
                                 Report.addCosts(15);
			}
			if (number1 == 6 && Account.returnBalance() >= 25.00) {
				System.out.println("A pair of pants have been added to your bag");
                                Account.subtractBalance(25);
                                 Report.addCosts(25);
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
                         Account.addBalance(f2);
                         Report.addDeposits(f2);
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
                                 Account.subtractBalance(8 - f3);
                                 Report.addCosts(8 - f3);
			}
			if (number2 == 2) { 
				System.out.println("Your " + s4 + " has been traded for Shoes");
                                Account.subtractBalance(85 - f3);
                                 Report.addCosts(85 - f3);
			}
			if (number2 == 3) {
				System.out.println("Your " + s4 + " has been traded for Hats");
	
                                 Account.subtractBalance(5 - f3);
                                  Report.addCosts(5 - f3);
			}
			if (number2 == 4) {
				System.out.println("Your " + s4 + " has been traded for Belts");
                                Account.subtractBalance(12 - f3);
                                 Report.addCosts(12 - f3);
			}
			if (number2 == 5 && Account.returnBalance() >= 15.00) {
				System.out.println("Your " + s4 + " has been traded for Shorts");
                                 Account.subtractBalance(15 - f3);
                                  Report.addCosts(15 - f3);
			}
			if (number2 == 6) {
				System.out.println("Your " + s4 + " has been traded Pants");
                                 Account.subtractBalance(25 - f3);
                                  Report.addCosts(25 - f3);
			}
			
			break;
	
		case 6:		//Case to give show how much they had left in their in their wallet
                         System.out.println("Your balance is " + Account.returnBalance());
			break;
		
		case 7: 
                         System.out.println();
                         Report.displayStatement();
                         System.out.println("Current balance:\t" + Account.returnBalance());
			System.out.println("\nThank you for visiting our store!!!");
			System.exit(0);
			
			
		
}	
	}
		}
			}
