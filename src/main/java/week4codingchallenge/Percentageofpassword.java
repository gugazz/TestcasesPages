package week4codingchallenge;

import java.util.Scanner;

public class Percentageofpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password to be calculated");
		Scanner obj=new Scanner(System.in);
		String password=obj.nextLine();
		int total=password.length();
		float ucase=0,lcase=0,digits=0,splchar=0;
		for(int i=0;i<password.length();i++)
		{
			if(Character.isUpperCase(password.charAt(i)))
			
			ucase++;
			
			 if(Character.isLowerCase(password.charAt(i)))
			
			lcase++;
			
			if(Character.isDigit(password.charAt(i)))
			
			digits++;
			
			if(!(Character.isLetterOrDigit(password.charAt(i))))
			
			splchar++;
		}
			System.out.println("Total length of password"+total);
			System.out.println("Number of uppercase letters"+ucase+"So the percentage is"+((ucase/total)*100));
			System.out.println("Number of lowercase letters"+lcase+"So the percentage is"+((lcase/total)*100));
			System.out.println("Number of digits"+digits+"So the percentage is"+((digits/total)*100));
			System.out.println("Number of specialchar"+splchar+"So the percentage is"+((splchar/total)*100));
			
}
	}

	

