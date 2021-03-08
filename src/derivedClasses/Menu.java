/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Main Menu of the application and shows the user the options available to enter.
 * // It also has validations so that user can only enter the correct option which prevents the application from crashing.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Menu {
	
	// Menu Method
	public static void Menu(Computer[] inv) {
		Scanner menu = new Scanner(System.in);
		
		//The correct password for letting the user enter an option
		String password = "password";
		
		//The options available for the user to choose
		System.out.println("What do you want to do?");
		System.out.println("   1.  Enter new computers (password required)");
		System.out.println("   2.  Change information of a computer (password required)");
		System.out.println("   3.  Display all computer by a specific brand");
		System.out.println("   4.  Display all computers under a certain price");
		System.out.println("   5.  Quit");
		System.out.print("Please enter your choice> ");
		
		if (menu.hasNextInt() == true) {
			int choice = menu.nextInt();
			if (choice == 1) {
				System.out.print("Enter your password: ");
				int i = 0;
				int j = 3;
				while (i < 3) {
					String tempPass = menu.next();
					if (tempPass.equals(password)) {
						System.out.println("The password is correct...");
						
						//Re-directing user to Option No.1 if the entered password is correct
						derivedClasses.Option1.Option1(inv);
						break;
					} else {
						System.out.println("Wrong Password!");
						if ((j-1) == 0) {
							j--;
							i++;
						} else {
							System.out.println("Try again \nYou have " + (j-1) + " attempt(s) left");
							j--;
							i++;
						}
					}
				}
				//Letting the user to enter the password 3 times. If the correct password is not entered within 3 attempts, the user will be re-directed to the Main Menu
				if (i == 3) {
					Menu(inv);
				}
				
			} else if (choice == 2) {
				System.out.print("Enter your password: ");
				int i = 0;
				int j = 3;
				while (i < 3) {
					String tempPass = menu.next();
					if (tempPass.equals(password)) {
						System.out.println("The password is correct...");
						
						//Re-directing user to Option No.2 if the entered password is correct
						derivedClasses.Option2.Option2(inv);
						break;
					} else {
						System.out.println("Wrong Password!");
						if ((j-1) == 0) {
							j--;
							i++;
						} else {
							System.out.println("Try again \nYou have " + (j-1) + " attempt(s) left");
							j--;
							i++;
						}
					}
				}
				//Letting the user to enter the password 3 times. If the correct password is not entered within 3 attempts, the user will be re-directed to the Main Menu
				if (i == 3) {
					Menu(inv);
				}
				
			} else if (choice == 3) {
				
				//Re-directing user to Option No.3 if the entered password is correct
				derivedClasses.Option3.Option3(inv);
				
			} else if (choice == 4) {
				
				//Re-directing user to Option No.4 if the entered password is correct
				derivedClasses.Option4.Option4(inv);
				
			} else if (choice == 5) {
				
				//Re-directing user to Option No.5 if the entered password is correct
				derivedClasses.Option5.Option5(inv);
				
			} else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("The input you entered is not a valid choice! \nTry again ");
				System.out.println();
				Menu(inv);
			}
		} else {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("The input you entered is not a valid choice! \nTry again ");
			System.out.println();
			Menu(inv);
		}
		menu.close();
	  }
}
