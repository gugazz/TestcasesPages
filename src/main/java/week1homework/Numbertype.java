package week1homework;
import java.util.Scanner;
public class Numbertype {
	
	public void oddOreven()
	
	{
		int numBer;
		System.out.println("Enter the number to be checked");

		Scanner obj=  new Scanner(System.in);
		numBer=obj.nextInt();
	
			if(numBer % 2 ==0)
			{
				System.out.println("The number is even");
			}
			else
					{
						System.out.println("The number is odd");
					}
			}
		public void primeornot()
		{
		int number=923;
	boolean flag=true;
		for(int i = 2;i<number/2;++i)
		{
			if(number % i==0)
			{
				flag=true;
				break;
			}
		}	
				if(flag!=true)
				{
					System.out.println("923 is a prime number");
				}
				else
				{
					
				System.out.println("923 is not a prime number");
			}
		}
	}
	

			
	
		
	


