/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Option 3 contents of the application and lets the user to view all computer objects of a specific Brand available in the computer store inventory.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Option3 {
	
	// Option 3
	public static void Option3(Computer[] inv) {
		Scanner option3 = new Scanner(System.in);
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
			
			//Asking the user to enter his/her desired computer Brand
			String brand = derivedClasses.Functions.addString("Enter a brand name to display all the available computers of the brand (You can exit to Main Menu if you type 0): ");
			if (brand.equals("0")) {
				//Re-directing user to the Main Menu if the input is 0
				derivedClasses.Menu.Menu(inv);
			}
			int notEmpty = 0;
			for (int i = 0; i < occupied; i++) {
				Computer co = inv[i];
				//Checking if the computers of the inventory have the same Brand name as user's input and showing its information
				if (co.getBrand().toLowerCase().equals(brand.toLowerCase())) {
					System.out.println("\n" + co);
					notEmpty++;
					continue;
				}
			}
			
			//The message shown in case of no match computer
			if (notEmpty == 0) {
				System.out.println("You do not have any computer available with the brand of \"" + brand + "\"");
			}
			Option3(inv);
		} else {
			//The message shown if there is no computer already saved in inventory
			System.out.println();
			System.out.println("You need to enter a new computer first!");
			System.out.println("Because you don't have any computer in your inventory, You CANNOT display all computers by a specific brand!");
			try {
	            Thread.sleep(6000);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
		}
		option3.close();
	}
}
