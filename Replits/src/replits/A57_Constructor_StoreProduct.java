package replits;

public class A57_Constructor_StoreProduct {
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
	
	public String label;
	public int price;
	public String category;
	public boolean hasExpiration;
	public int stock;
	
	//Constructor 1:
	public A57_Constructor_StoreProduct(String label, int price, 
			String category, boolean hasExpiration, int stock) {
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=stock;
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
		//bread 3 bakery true 100
	}
	
	//Constructor 2:
	public A57_Constructor_StoreProduct(String label, int price, int stock) {
		this.label=label;
		this.price=price;
		String category = "misc";
		boolean hasExpiration = false;
		this.stock=stock;
		System.out.println(label+" "+price+" "+stock);
		//bread 3 100
	}
	
	//Constructor 3:
	public A57_Constructor_StoreProduct(String label, int price) {
		this.label=label;
		this.price=price;
		String category = "misc";
		boolean hasExpiration = false;
		stock=0;
		System.out.println(label+" "+price);
		//bread 3
	}
	
	//Constructor 4:
	public A57_Constructor_StoreProduct(String label, int price, 
			String category, boolean hasExpiration) {
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		stock=0;
		System.out.println(label+" "+price+" "+category+" "+hasExpiration);
		//bread 3 bakery true
	}
 }