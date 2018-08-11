package week6dailychallenge;

import java.util.Scanner;

public class Stringreverseusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to be reversed");
Scanner obj=new Scanner(System.in);
String reversal=obj.next();
System.out.printf("Reverse of string is:"+reversalmethod(reversal));
	}

	public static String reversalmethod (String reversal) {
		// TODO Auto-generated method stub
		if((null==reversal)||(reversal.length()<=1))
		{
			return reversal;


		}
		return reversalmethod (reversal.substring(1))+reversal.charAt(0);

	}

}
