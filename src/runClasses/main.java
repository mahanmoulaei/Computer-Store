/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This application helps the Employee of a Computer Store to keep track of the computers available in the store inventory.
 * // The user can enter the inventory size of the store.
 * // The user can enter and save computers in the store inventory based on the available spaces in the inventory. (needs password to do this) -- The password is "password" without quotations!
 * // The user can edit and change the informations of the available computers in the inventory.                   (needs password to do this) -- The password is "password" without quotations!
 * // The user can see all computers of a specific brand that are available in the store inventory.
 * // The user can see all computers of less than a specific price that are available in the store inventory.
 * // -----------------------------------------------------
 * // This class is the start screen of the application.
 * // -----------------------------------------------------
 */
package runClasses;

import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		Scanner mainScanner = new Scanner(System.in);
		
		System.out.println("\n");
		
		//The message shown when the application starts
		System.out.println("** WELCOME TO MAHAN'S COMPUTER STORE MANAGEMENT APPLICATION **");
		System.out.println("\n\n");
		
		//Re-directing user to the Computer Store Inventory Size determinant
		derivedClasses.InventorySize.InventorySize();
		
		System.out.println("Error...The Application Went Back To runClasses.main.main(args) !!"); //FOR DEVELOPER TEST
		System.out.println("Please Contact the Support To Fix This Issue");                       //FOR DEVELOPER TEST
		
		mainScanner.close();
	}
}
