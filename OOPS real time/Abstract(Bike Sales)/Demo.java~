import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		String color="Red";
		int milage= 70;
		int speed= 120;
		double cost= 75000;
		
		Honda honda= new Honda(color, milage, speed, cost);
		honda.showDetailsOfCar();
		honda.emiCalculate();
		honda.gearSystem();
		System.out.println("======================");
		Tvs tvs= new Tvs(color, milage, speed, cost);
		tvs.showDetailsOfCar();
		tvs.emiCalculate();
		tvs.gearSystem();	
	}	
}

class Honda extends Bike
{
	Honda(String color,int milage, int speed, double cost)
	{
		super.bikeColor=color;
		super.milage=milage;
		super.maxSpeed= speed;
		super.cost= cost;
	}
	void emiCalculate()
	{
		System.out.println("EMI for Honda company Bike: "+super.cost/4);
	}
	void gearSystem()
	{
		System.out.println("Honda bike have 5 Gears System");
	}
}

class Tvs extends Bike
{
	Tvs(String color,int milage, int speed, double cost)
	{
		super.bikeColor=color;
		super.milage=milage;
		super.maxSpeed= speed;
		super.cost= cost;
	}
	void emiCalculate()
	{
		System.out.println("EMI for TVS company Bike: "+super.cost/6);
	}
	void gearSystem()
	{
		System.out.println("Tvs bike have 4 Gears System");
	}
}

abstract class Bike
{	
	String bikeColor;
	int milage;
	int maxSpeed;
	double cost;

	public void showDetailsOfCar()
	{
		System.out.println(bikeColor+" "+milage+" "+maxSpeed+" "+cost);
	}
	
	abstract void gearSystem();
	abstract void emiCalculate();
}


