package week2day1;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the numbers to be checked");
int number1,number2;
Scanner obj=new Scanner(System.in);
number1=obj.nextInt();
number2=obj.nextInt();
if(number1%3==0)

	{
	System.out.println( +number1 + " FIZZ");
	}
 if(number2%5==0)
{
	System.out.println( +number2 + " BUZZ");
	
}
if(number1%5==0&&number1%3==0)
	
{
	if(number2%5==0&&number2%3==0)
	{
		System.out.println( +number1 +" "+number2+" FIZZBUZZ");
	}
	else
if(number1%5==0||number1%3==0)
{
	if(number2%5==0||number2%3==0)
	{
		System.out.println( +number1 +" "+number2);
	}
}
}
//if(number1%5==0||number)
	}

}
