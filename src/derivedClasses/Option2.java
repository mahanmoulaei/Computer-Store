/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Option 2 contents of the application and lets the user to change the information of the computer objects of his/her computer store inventory.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Option2 {
	
	// Option 2
	public static void Option2(Computer[] inv) {
		Scanner option2 = new Scanner(System.in);
		int length = inv.length; 
		int available = 0;
		for (int i = 0; i < inv.length; i++) {
			if (inv[i] == null) {
				available++;
			}
		}
		
		//Checking if at least 1 computer is already saved in inventory
		if (available != length) {
			int occupied = 0;
			for (int i = 0; i < inv.length; i++) {
				if (inv[i] != null) {
					occupied++;
				}
			}
			
			//Showing available computers in the inventory with their informations
			for (int i = 0; i < occupied; i++) {
				Computer co = inv[i];	
				System.out.println();
				System.out.println("Computer #" + (i+1));
				System.out.println("Brand: " + co.getBrand());
				System.out.println("Model: " + co.getModel());
				System.out.println("SN: " + co.getSerialNumber());
				System.out.println("Price: $" + co.getPrice());
				System.out.println();
			}
			System.out.println();
			
			//Asking the user to enter the number of the computer he/she wants to change its information
			System.out.println("Which computer you want to change its information? (You can exit to Main Menu if you type 0)");
			if (option2.hasNextInt() == true) {
				int input = option2.nextInt();
				if (input >= 0 && input < inv.length) {
					if (input == 0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						//Re-directing user to the Main Menu if the input is 0
						derivedClasses.Menu.Menu(inv);
					} else if (inv[input-1] == null) {
						System.out.println();
						System.out.println(input + " is not a valid computer in your inventory!");
						try {
				            Thread.sleep(3000);
				        } catch (Exception e) {
				        }
						System.out.println();
						Option2(inv);
					} else if (inv[input-1] != null) {
						//Showing informations of the computer that user wants to change
						Computer co = inv[input-1];
						System.out.println("Computer #" + (input));
						System.out.println("Brand: " + co.getBrand());
						System.out.println("Model: " + co.getModel());
						System.out.println("SN: " + co.getSerialNumber());
						System.out.println("Price: $" + co.getPrice());
						int change = 0;
						while (change != 1 || change != 2 || change != 3 || change != 4 || change != 5 ) {
							System.out.println();
							//Asking the user to enter the computer information he/she wants to change
							System.out.println("What information would you like to change?");
							System.out.println("   1.  Brand");
							System.out.println("   2.  Model");
							System.out.println("   3.  SN");
							System.out.println("   4.  Price");
							System.out.println("   5.  Quit");
							System.out.print("Please enter your choice> ");
							if (option2.hasNextInt() == true) {
								change = option2.nextInt();
								if (change == 1) {
									System.out.println();
									//Asking the user to enter the new BRAND of the computer
									/** old code
									System.out.print("Enter the new Brand: ");
									String brand = option2.next();
									**/
									//Validating user's input by calling addString function
									String brand = derivedClasses.Functions.addString("Enter the new Brand: ");
									System.out.println();
									System.out.println("Are you sure you want to change the Brand of computer #" + input + " from '" + co.getBrand() + "' to '" + brand + "' ?");
									System.out.print("Write 'yes' to change and 'no' to keep the current Brand : ");
									String answer = option2.next();
									if (answer.equals("yes")) {
										//Saving new BRAND
										co.setBrand(brand);
										System.out.println("\nBrand of Computer #" + input + " Changed!!!");
										change = 0;
									} else if (answer.equals("no")) {
										System.out.println("\nBrand Not Changed!!!");
										change = 0;
									} else {
										System.out.println("\nYou didn't respond correctly!\nBrand Not Changed!!!\n");
										change = 0;
									}
								} else if (change == 2) {
									System.out.println();
									//Asking the user to enter the new MODEL of the computer
									/** old code
									System.out.print("Enter the new Model: ");
									String model = option2.next();
									**/
									//Validating user's input by calling addString function
									String model = derivedClasses.Functions.addString("Enter the new Model: ");
									System.out.println();
									System.out.println("Are you sure you want to change the Model of computer #" + input + " from '" + co.getModel() + "' to '" + model + "' ?");
									System.out.print("Write 'yes' to change and 'no' to keep the current model : ");
									String answer = option2.next();
									if (answer.equals("yes")) {
										//Saving new MODEL
										co.setModel(model);
										System.out.println("\nModel of Computer #" + input + " Changed!!!");
										change = 0;
									} else if (answer.equals("no")) {
										System.out.println("\nModel Not Changed!!!");
										change = 0;
									} else {
										System.out.println("\nYou didn't respond correctly!\nModel Not Changed!!!\n");
										change = 0;
									}
									
								} else if (change == 3) {
									System.out.println();
									//Asking the user to enter the new SERIAL NUMBER of the computer
									/** old code
									System.out.print("Enter the new SN: ");
									long SN = option2.nextLong();
									**/
									//Validating user's input by calling addLong function
									long SN = derivedClasses.Functions.addLong(12, "Enter the new SN (12-digit): ", "NoCancel");
									System.out.println();
									System.out.println("Are you sure you want to change SN of computer #" + input + " from '" + co.getSerialNumber() + "' to '" + SN + "' ?");
									System.out.print("Write 'yes' to change and 'no' to keep the current SN : ");
									String answer = option2.next();
									if (answer.equals("yes")) {
										//Saving new SERIAL NUMBER
										co.setSerialNumber(SN);
										System.out.println("\nSN of Computer #" + input + " Changed!!!");
										change = 0;
									} else if (answer.equals("no")) {
										System.out.println("\nSN Not Changed!!!");
										change = 0;
									} else {
										System.out.println("\nYou didn't respond correctly!\nSN Not Changed!!!\n");
										change = 0;
									}
									
								} else if (change == 4) {
									System.out.println();
									//Asking the user to enter the new PRICE of the computer
									/** old code
									System.out.print("Enter the new Price: ");
									double price = option2.nextDouble();
									**/
									//Validating user's input by calling addDouble function
									double price = derivedClasses.Functions.addDouble("Enter the new Price: ");
									System.out.println();
									System.out.println("Are you sure you want to change Price of computer #" + input + " from '" + co.getPrice() + "' to '" + price + "' ?");
									System.out.print("Write 'yes' to change and 'no' to keep the current Price : ");
									String answer = option2.next();
									if (answer.equals("yes")) {
										//Saving new PRICE
										co.setPrice(price);
										System.out.println("\nPrice of Computer #" + input + " Changed!!!");
										change = 0;
									} else if (answer.equals("no")) {
										System.out.println("\nPrice Not Changed!!!");
										change = 0;
									} else {
										System.out.println("\nYou didn't repond correctly!\nPrice Not Changed!!!\n");
										change = 0;
									}
									
								} else if (change == 5) {
									//Canceling the edit mode of selected computer
									Option2(inv);
								} else {
									System.out.println("\n" + change + " is not a valid choice!\n");
									change = 0;
								}
							} else {
								System.out.println("\n" + option2.next() + " is not a valid choice!\n");
								change = 0;
							}
						}
					}
				} else {
					System.out.println();
					System.out.println(input + " is not a valid computer in your inventory!");
					try {
			            Thread.sleep(3000);
			        } catch (Exception e) {
			        }
					System.out.println();
					Option2(inv);
				}
				
			} else {
				System.out.println("You need to enter a valid number!");
				try {
		            Thread.sleep(3000);
		        } catch (Exception e) {
		        }
				System.out.println();
				Option2(inv);
			}
		} else {
			//The message shown if there is no computer already saved in inventory
			System.out.println();
			System.out.println("You need to enter a new computer first before changing its information!");
			System.out.println("Because you don't have any computer in your inventory, You CANNOT change any computer information!");
			try {
	            Thread.sleep(6000);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
		}

		option2.close();
	}
}
