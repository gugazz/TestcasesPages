package week4codingchallenge;

class Vechile {
	public void carType() {
		
	System.out.println("The vehicle is car");
		// TODO Auto-generated method stub
		}
}

class Car extends Vechile
 {
public void  carName()
{
	System.out.println("The car name is bolero");

}
 }
public class Audi extends Car
{
public void audiCar()
{
	System.out.println("The audi is wooow");
}

public static void main(String args[])
{
	Audi carobj=new Audi();
	carobj.carName();
	carobj.carType();
	carobj.audiCar();
	
}

	

}


