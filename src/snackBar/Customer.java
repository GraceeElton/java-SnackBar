package snackBar;


public class Customer
{
	private static int maxId = 0 ;
	private int id;

	private String name;
	private double cash;


	public Customer(String name, double cash)
	{
		maxId++;

    	id = maxId;

    	this.name = name;
    	this.cash = cash;
	}


	//getters 	

	public int getId()
    {
        return id;
    }
    public double getCash()
    {
        return cash;
    
    }


	public String getName()
	{
		return name;
	}
	// adding stuff or charging wallet 

	public void addMoney(double added)
	{
		this.cash = this.cash + added;
	}

	public void takeMoney(double remove)
	{
		this.cash = this.cash - remove;
	}


	//setters 

	public void setName(String name)
	{
		this.name = name;
	}
}