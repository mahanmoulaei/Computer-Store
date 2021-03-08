/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Inventory Size determinant of the application and lets the user to enter the size of his/her computer store inventory.
 * // This class creates the attribute needed to keep track of the inventory and its computer objects.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class InventorySize {

	//Inventory Size Method
	public static void InventorySize() {
		Scanner inventorySize = new Scanner(System.in);
		System.out.print("Enter the maximum number of computer your store can contain: ");
		if (inventorySize.hasNextInt() == true) {
			int size = inventorySize.nextInt();
			if (size > 0) {
				
				//Creating an inventory with the size of the user's input
				Computer[] inventory = new Computer[size];
				System.out.println("\n\n");
				
				//Re-directing user to Main Menu of the application
				derivedClasses.Menu.Menu(inventory);
			} else {
				System.out.println("You need to enter a positive number!");
				System.out.println();
				InventorySize();
			}
		} else {
			System.out.println("You need to enter a number!");
			System.out.println();
			InventorySize();
		}
		inventorySize.close();
	}
}
