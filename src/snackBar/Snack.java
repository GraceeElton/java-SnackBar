package snackBar;


public class Snack 
{

    // create feilds - make sure the String is cap.

    //thing for random id
	private static int maxId = 0 ;
	private int id;

	private String name;
	private int quantity;
	private double cost;
	private int vendingId;


    // create constuctor 
        // with all of the feilds as it paramaters 

	public Snack(String name, int quantity, double cost, int vendingId)
	{
		maxId++;
    	id = maxId;
    	this.name = name;
    	this.quantity = quantity;
    	this.cost = cost;
    	this.vendingId = vendingId;
	}

	// getters 

    // You do not have to do a setter for the id.

	public int getId()
    {
        return id;
    }

    public String getName()
    {
    	return name;
    }

    public double getCost()
    {
    	return cost;
    }
    public int getVendingId()
    {
    	return vendingId;
    }

 
    // added stuff for quantity 
    
    public int getQuantity(){   
    	return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void addSnacks(int added)
    {
    	this.quantity = this.quantity + added;
    }
    public void removeSnacks(int remove)
    {
    	this.quantity = this.quantity - remove;
    }

    public double totalCost()
    {
    	return quantity * cost;
    }


    //setters 

    public void setName(String name)
    {
        this.name = name;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setVeningID(int vendingId)
    {
    	this.vendingId = vendingId;
    }


}