/*
 * // -----------------------------------------------------
 * // Assignment Number 2
 * // © Your Name : Mahan Moulaei
 * // Written by  : Mahan Moulaei  -  StudentID #1934994
 * // LaSalle College - Winter 2021
 * // -----------------------------------------------------
 * // This class contains Attributes, Constructors, Methods, and Override Methods that needs to create a Computer Object and access its attributes.
 * // -----------------------------------------------------
 */

package baseClasses;

public class Computer {
	
	// ##################
	// ### Attributes ###
	// ##################
	protected String brand;
	protected String model;
	protected long serialNumber;
	protected double price;
	private static int numOfComputers = 0;
	
	
	// ############################
	// ### Default Constructors ###
	// ############################
	public Computer() {
		brand = "BRAND";
		model = "MODEL";
		serialNumber = 000000000000;
		price = 0000.0;
		numOfComputers++;
	}
	
	
	// ##################################
	// ### Parameterized Constructors ###
	// ##################################
	// Creating by "brand" only
	public Computer(String brand) {
		this.brand = brand;
		this.model = "MODEL";
		this.serialNumber = 000000000000;
		this.price = 0000.0;
		numOfComputers++;
	}
	
	// Creating by "brand" and "model" only
	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.serialNumber = 000000000000;
		this.price = 0000.0;
		numOfComputers++;
	}
	
	// Creating by "brand" and "model" and "serial number" only
	public Computer(String brand, String model, long serialNumber) {
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.price = 0000.0;
		numOfComputers++;
	}

	
	// ########################################
	// ### Fully Parameterized Constructors ###
	// ########################################
	public Computer(String brand, String model, long serialNumber, double price) {
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.price = price;
		numOfComputers++;
	}

	
	// ########################
	// ### Copy Constructor ###
	// ########################
	public Computer(Computer co) {
		this.brand = co.brand;
		this.model = co.model;
		this.serialNumber = co.serialNumber;
		this.price = co.price;
		numOfComputers++;
	}

	
	// #########################
	// ### Getters & Setters ###
	// #########################
	// "brand" attribute
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// "model" attribute
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// "serialNumber" attribute
	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// "price" attribute
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	// #####################################################
	// ### Displaying Number of Created Object(s) Method ###
	// #####################################################
	public static void findNumberOfCreatedComputers() {
		System.out.println("Total number of Computer(s) created is : " + numOfComputers);
	}

	// ##########################
	// ### Overriding Methods ###
	// ##########################
	// toString() Method
	@Override
	public String toString() {
		return "Computer with the Brand of \"" + brand + "\", Model of \"" + model + "\", with the Serial Number of \"" + serialNumber + "\", has the Price of \"$" + price + "\"";
	}
	
	// equals() Method
	@Override
	public boolean equals(Object obj) {
		if (obj == null || this == null || this.getClass() != obj.getClass()) {
			return false;
		} else {
			Computer co = (Computer) obj;
			if (this.brand == co.brand && this.model == co.model && this.price == co.price) {
				return (this.brand == co.brand && this.model == co.model && this.price == co.price);
			} else {
				return false;
			}
		}
	}
}
