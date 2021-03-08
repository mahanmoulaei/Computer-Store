/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Option 5 contents of the application and lets the user to exit the application or not.
 * // It also has validations so that user can only enter the correct input value which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;

import baseClasses.Computer;

public class Option5 {
	
	// Option 5
	public static void Option5(Computer[] inv) {
		Scanner option5 = new Scanner(System.in);
		
		//Asking the user if he/she wants to close the application
		System.out.println("Do you want to close the application?");
		System.out.print("Write 'yes' to exit and 'no' to keep the application running : ");
		String answer = option5.next();
		if (answer.equals("yes")) {
			
			//Closing the application
			System.out.println("\nThe application is closing...\nwait for 3 seconds");
			try {
	            Thread.sleep(3000);
	        } catch (Exception e) {
	        }
			System.out.println();
			System.out.println("The application successfully closed!");
			System.out.println();
			System.out.println("** SEE YOU LATER **");
			System.exit(0);
			
		} else if (answer.equals("no")) {
			
			//Going back to Main Menu
			System.out.println("\nGoing back to Main Menu...\n");
			try {
	            Thread.sleep(2000);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
			
		} else {
			
			//Going back to Main Menu
			System.out.println("\nYou didn't respond correctly!\nGoing back to Main Menu...\n");
			try {
	            Thread.sleep(3200);
	        } catch (Exception e) {
	        }
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			//Re-directing user to the Main Menu
			derivedClasses.Menu.Menu(inv);
		}
		
		option5.close();
	}
}
