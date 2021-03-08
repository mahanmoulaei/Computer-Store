/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Option 4 contents of the application and lets the user to view all computer objects less than a specific Price available in the computer store inventory.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Option4 {
	
	// Option 4
	public static void Option4(Computer[] inv) {
		Scanner option4 = new Scanner(System.in);
		int length = inv.length;
		int available = 0;
		for (int i = 0; i < length; i++) {
			if (inv[i] == null) {
				available++;
			}
		}
		
		//Checking if at least 1 computer is already saved in inventory
		if (available != length) {
			int occupied = 0;
			for (int i = 0; i < length; i++) {
				if (inv[i] != null) {
					occupied++;
				}
			}
			System.out.println("\n\n");
			
			//Asking the user to enter his/her desired computer Price
			double price = derivedClasses.Functions.addDouble("Enter a price to display all the available computers under that price (You can exit to Main Menu if you type 0): ");
			if (price == 0.0) {
				//Re-directing user to the Main Menu if the input is 0
				derivedClasses.Menu.Menu(inv);
			}
			int notEmpty = 0;
			for (int i = 0; i < occupied; i++) {
				Computer co = inv[i];
				//Checking if the computers of the inventory have Price less than or equal to user's input and showing its information
				if (co.getPrice() <= price) {
					System.out.println("\n" + co);
					notEmpty++;
					continue;
				}
			}
			
			//The message shown in case of no match computer
			if (notEmpty == 0) {
				System.out.println("You do not have any computer available under the price of \"$" + price + "\"");
			}
			Option4(inv);
		} else {
			//The message shown if there is no computer already saved in inventory
			System.out.println();
			System.out.println("You need to enter a new computer first!");
			System.out.println("Because you don't have any computer in your inventory, You CANNOT display all computers under a certain price!");
			try {
	            Thread.sleep(6000);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
		}
		option4.close();
	}
}
