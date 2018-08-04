package week1codingchallenges;

import java.util.Scanner;

public class Multiplicationruntimevalues {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
int numBer1,numBer2;
//int i=0;
System.out.println("Enter the number#1");

Scanner obj = new Scanner(System.in);

 numBer1=obj.nextInt();

 System.out.println("Enter the number#2");

 Scanner obje = new Scanner(System.in);

numBer2=obje.nextInt();
 

	for(int i=1;i<=numBer2;i++)
	{
		System.out.println(numBer1+"*"+i+"="+(numBer1*i));
	}
}
	}


