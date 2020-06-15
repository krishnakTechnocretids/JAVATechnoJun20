package meghaJJune20;

public class Car {
	
	String companyname;
	boolean bautomatic;
	double dcar;
	
	void setcompanyName(String compname)
	{
		companyname = compname;
	}
	void setIsCarAutomatic(boolean automatic)
	{
		bautomatic = automatic;
	}
	void setCarSpeed(int carsp)
	{
		dcar = carsp;
	}
	void displaySpecification()
	{
		System.out.println("Company Name is "+ companyname);
		System.out.println("Is Car Automatic "+ bautomatic);
		System.out.println("Car Speed is " + dcar);
	}
	public static void main(String[] args)
	{
		Car car = new Car();
		car.setcompanyName("Audi");
		car.setIsCarAutomatic(true);
		car.setCarSpeed(180);
		car.displaySpecification();
	}

}
