package week2day1;

import java.util.Scanner;

public class Sumoffactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the factorial number limit to be printed");
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int factorial=1;
for(int i = 1;i<=n;i++)
{
	factorial=factorial*i;

	}
System.out.println("factorial value of " +n +" is " +factorial);
}
	
}

