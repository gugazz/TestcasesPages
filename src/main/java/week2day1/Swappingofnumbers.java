package week2day1;

import java.util.Scanner;

public class Swappingofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
System.out.println("Enter the numbers to be swapped");
Scanner obj=new Scanner(System.in);
number1=obj.nextInt();
number2=obj.nextInt();
System.out.println("The swapped numbers are");
{
	int temp = number1;
	number1=number2;
	number2=temp;
	System.out.println("number1 =" +number1 +" number2 ="+number2);
}

	}

}
