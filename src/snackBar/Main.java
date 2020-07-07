package snackBar;

public class Main 
{
	public static void workWithData()
	{
		// System.out.println("Is this working");
		 // custmers 
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14) ;

		// vending machines 

		VendingMachine  v1 = new VendingMachine("Food");
		VendingMachine  v2 = new VendingMachine("Drink");
		VendingMachine  v3 = new VendingMachine("Office");

		// snacks - machine 1 (food)
		 Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
		 Snack s2 = new Snack("Chocolate Bars", 36, 1.00, v1.getId());
		 Snack s3 = new Snack("Pretzels", 30, 2.00, v1.getId());

		 //machine 2 (fdrink)
		 Snack s4 = new Snack("Sodas", 24, 2.50, v2.getId());
		 Snack s5 = new Snack("Waters", 20, 2.75, v2.getId());


		 // working with number and stuff!! 

		 	

		 System.out.println("*** data!!!");

		 //Customer 1 (Jane) buys 3 of snack 4 (Soda).
 			// Print Customer 1 (Jane) Cash on hand.v bxd
 			// Print quantity of snack 4 (Soda).

		 c1.takeMoney(s4.getCost() * 3 );
		 s4.removeSnacks(3);
		 System.out.println(c1.getName() + " has " +'$' + c1.getCash() + " left." + " There are " + s4.getQuantity() + "" + s4.getName() + " left.");


		 // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		 // Print Customer 1 (Jane) Cash on hand.
		// Print quantity of snack 3 (Pretzel).

		 c1.takeMoney(s3.getCost() * 1 );
		 s3.removeSnacks(1);
		 System.out.println(c1.getName() + " has " +"$" + c1.getCash() +  "left. " + " There are " + s3.getQuantity() + "" + s3.getName() + " left.");

		// 	 Customer 2 (Bob) buys 2 of snack 4 (Soda).
 		// Print Customer 2 (Bob) Cash on Hand.
 		// Print quantity of snack 4 (Soda).

		 c2.takeMoney(s4.getCost() * 2 );
		 s4.removeSnacks(2);
		 System.out.println(c2.getName() + " has " +"$"+ c2.getCash() + " left. " + " There are " + s4.getQuantity() + "" + s4.getName() + " left.");


		// 	 Customer 1 (Jane) finds $10.
 		// Print Customer 1 (Jane) Cash on Hand.

		 c1.addMoney(10);
		 System.out.println(c1.getName() + " Found $10 and now has " + "$" + c1.getCash() + " left.");

		// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
 		// 	Print Customer 1 (Jane) Cash on Hand.
 		// 	Print quantity of snack 2 (Chocolate Bar).

		 c1.takeMoney(s2.getCost() * 1);
		 s2.removeSnacks(1);
		 System.out.println(c1.getName() + " has " + "$" + c1.getCash() + " left ." + " There are " + s2.getQuantity() + "" + s2.getName() + " left.");


		// Add 12 more items to snack 3 (Pretzel).
		//  Print quantity of snack 3 (Pretzel).

		 s3.addSnacks(12);
		 System.out.println(s3.getName() + " has " + s3.getQuantity());

		  // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		 // Print Customer 2 (Bob) Cash on hand.
		 // Print quantity of snack 3 (Pretzel).


 		 c2.takeMoney(s3.getCost() * 3);
		 s3.removeSnacks(3);
		 System.out.println(c2.getName() + " has " + "$" + c2.getCash() + "left." + "There are " + s3.getQuantity() + " " + s3.getName() + " left.");



	}

	public static void main(String[] args)
    {
        workWithData();
    }
}