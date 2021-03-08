/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Option 1 contents of the application and lets the user to enter computer objects to his/her computer store inventory if there is available space.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Option1 {
	
	// Option 1
	public static void Option1(Computer[] inv) {
		Scanner option1 = new Scanner(System.in);
		int length = inv.length; 
		int available = 0;
		for (int i = 0; i < inv.length; i++) {
			if (inv[i] == null) {
				available++;
			}
		}
		if (available > 0) {
			System.out.println();
			System.out.println("You have " + available + " space available in your store inventory.");
			System.out.print("How many computer(s) you want to enter (You can exit to Main Menu if you type 0)? ");
			if (option1.hasNextInt() == true) {
				int input = option1.nextInt();
				if (input == 0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					
					//Re-directing user to the Main Menu if the input is 0
					derivedClasses.Menu.Menu(inv);
					
				} else if (input <= available) {
					for (int i = 1; i <= input; i++) {
						
						//Asking the user to enter the BRAND of the computer
						/** old code
						System.out.print("\nEnter the Computer Brand (You can cancel current entry if you type 0) : ");	
						if (option1.hasNextInt() == true && option1.nextInt() == 0) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						String brand = option1.next();
						**/
						//Validating user's input by calling addString function
						String brand = derivedClasses.Functions.addString("\nEnter the Computer Brand (You can cancel current entry if you type 0) : ");
						if (brand.equals("0")) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						
						//Asking the user to enter the MODEL of the computer
						/** old code
						System.out.print("\nEnter the Computer Model (e.g=> Mac or N501)(You can cancel current entry if you type 0) : ");
						if (option1.hasNextInt() == true && option1.nextInt() == 0) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						String model = option1.next();
						**/
						//Validating user's input by calling addString function
						String model = derivedClasses.Functions.addString("\nEnter the Computer Model (e.g=> Mac or N501)(You can cancel current entry if you type 0) : ");
						if (model.equals("0")) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						
						//Asking the user to enter the SERIAL NUMBER of the computer
						/** old code
						System.out.print("\nEnter the Computer Serial Number (12-digit number)(You can cancel current entry if you type 0) : ");
						if (option1.hasNextInt() == true && option1.nextInt() == 0) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						long sn = option1.nextLong();
						**/
						//Validating user's input by calling addLong function
						long sn = derivedClasses.Functions.addLong(12, "\nEnter the Computer Serial Number (12-digit number)(You can cancel current entry if you type 0) : ", "Cancel");
						if (sn == 0) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						
						//Asking the user to enter the PRICE of the computer
						/** old code
						System.out.print("\nEnter the Computer Price (You can cancel current entry if you type 0) : ");
						double price = 0.0;
						if (option1.hasNextInt() == true) {
							if (option1.nextInt() == 0) {
								System.out.println("Canceling Current Entry...");
								break;
							} else {
								int tempPrice = option1.nextInt();
								price = tempPrice;
							}
						} else if (option1.hasNextDouble() == true) {
							price = option1.nextDouble();
						}
						//double price = option1.nextDouble();
						 **/
						//Validating user's input by calling addDouble function
						double price = derivedClasses.Functions.addDouble("\nEnter the Computer Price (You can cancel current entry if you type 0) : ");
						if (price == 0.0) {
							System.out.println("Canceling Current Entry...");
							break;
						}
						
						Computer co = new Computer(brand, model, sn, price);
						//Adding the computer object to the inventory
						inv = derivedClasses.Functions.addElement(length, inv, co); 
						System.out.println(co + " **Added to Inventory** :)"); 
						//System.out.println(Arrays.toString(inv));  //FOR DEVELOPER TESTING
						System.out.println();
					}
					Option1(inv);
				} else {
					System.out.println();
					System.out.println("You don't have " + input + " available inventory for your store!");
					Option1(inv);
				}
			} else {
				System.out.println("You need to enter a valid number!");
				System.out.println();
				Option1(inv);
			}
		} else {
			//The message shown if the store inventory is full
			System.out.println();
			System.out.println("Your store inventory is full!");
			System.out.println("You CANNOT enter a new computer!");
			try {
	            Thread.sleep(4000);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
		}
		option1.close();
	}
}
