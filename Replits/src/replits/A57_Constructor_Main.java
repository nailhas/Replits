package replits;

public class A57_Constructor_Main {
	/*1. Complete the StoreProduct.java class:

	Include the following class variables:
	* label
	* price (as an integer)
	* category
	* hasExpiration (as a boolean)
	* stock (represents the number of available items in the store)
	All class variables should be declared case sensitive

	Write four constructors:
	* The main constructor
	* A secondary constructor that does not have a category or an expiration 
	(category defaults to "misc", hasExpiration defaults to false)
	* A secondary constructor that does not have a category, expiration, 
	or stock (stock defaults to 0)
	* A secondary constructor that just does not have stock

	2. Test your code with the Main.java class:
	Create several StoreProduct objects using all Constructors 
	and print their fields/states to make sure it's correct.  */
	
	public static void main(String[] args) {
//String label, int price, String category, boolean hasExpiration, int stock
		A57_Constructor_StoreProduct constr1 = new A57_Constructor_StoreProduct("bread", 
				3, "bakery", true, 100);
		
		A57_Constructor_StoreProduct constr2 = new A57_Constructor_StoreProduct("bread", 3, 100);
		
		A57_Constructor_StoreProduct constr3 = new A57_Constructor_StoreProduct("bread", 3);
		
		A57_Constructor_StoreProduct constr4 = new A57_Constructor_StoreProduct("bread", 
				3, "bakery", true);		
	}
}
