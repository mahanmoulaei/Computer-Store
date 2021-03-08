/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains the Functions to validate the Brand, the Model, the Serial Number, and the Price.
 * // With validations, user can only enter the correct input value which prevents the application from crashing.
 * // This class also contains the Function to add computers in the inventory.
 * // -----------------------------------------------------
 */
package derivedClasses;

import java.util.Scanner;
import baseClasses.Computer;

public class Functions {
	
	// Function To Validate Brand & Model
	public static String addString(String str) { 
		Scanner scanner = new Scanner(System.in);
		String string = "";
		int run = 1;
		int exit;
			
		while (run != 0) {
			System.out.print(str);
			
			if (scanner.hasNextInt() == true) {
				exit = scanner.nextInt();
				if (exit == 0) {
					string = Integer.toString(exit);
					run = 0;
					break;
				}
				System.out.println("\nYou need to enter a name(string)!");
				scanner.nextLine();
			} else if (scanner.hasNext() == true) {
				System.out.println();
				string = scanner.next();
				run = 0;
				break;
			} else {
				System.out.println("\nYou need to enter a name(string)!");
				scanner.nextLine();
			}
		} 
		return string;
	} 	
	
	// Function To Validate SerialNumber
	public static Long addLong(int n, String str, String cancel) { 
		Scanner scanner = new Scanner(System.in);
		long SN = 0;
		int run = 1;
			
		while (run != 0) {
			System.out.print(str);
				
			if (scanner.hasNextLong() == true) {
				System.out.println();
				SN = scanner.nextLong();
				if (cancel.equals("NoCancel")) { 
					if (Long.toString(SN).length() == n) {
						run = 0;
						break;
					} else {
						System.out.println("\nYou need to enter a 12 digit number!");
					}
				} else if (cancel.equals("Cancel")) {
					if (SN == 0) {
						run = 0;
						break;
					} else if (Long.toString(SN).length() == n) {
						run = 0;
						break;
					} else {
						System.out.println("\nYou need to enter a 12 digit number!");
					}
				}
				
			} else {
				System.out.println("\nYou need to enter a 12 digit number!");
				scanner.nextLine();
			}
		} 
	    return SN; 
	} 
	
	// Function To Validate Price
	public static Double addDouble(String str) { 
		Scanner scanner = new Scanner(System.in);
		Double price = 0.0;
		int run = 1;
			
		while (run != 0) {
			System.out.print(str);	
			
			if (scanner.hasNextInt() == true) {
				System.out.println();
				int tempPrice = scanner.nextInt();
				if (tempPrice < 0) {
					System.out.println("\nYou need to enter a positive price!");
				} else {
					price = (double) tempPrice;
					run = 0;
					break;
				}
				
			} else if (scanner.hasNextDouble() == true) {
				price = scanner.nextDouble();
				if (price < 0) {
					System.out.println("\nYou need to enter a positive price!");
				} else {
					run = 0;
					break;
				}
				
			} else {
				System.out.println("\nYou need to enter a valid price!");
				scanner.nextLine();
			}
		} 
	    return price; 
	} 
	
	// Function To Add Computer Objects to Inventory Array
	public static Computer[] addElement(int n, Computer[] arr, Computer c) { 
		int i; 
		Computer[] newarr = new Computer[n]; 
	        
		for (i = 0; i < n; i++) { 
	            newarr[i] = arr[i]; 
		}
	        
		int element = 0;
		for (i = 0; i < n; i++) {
			if (arr[i] == null) {
				element = i;
				break;
			}
		}
	       
		newarr[element] = c; 
		return newarr; 
	} 
}
