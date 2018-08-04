package week2day1;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingofnumberscorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the numbers to be sorted");
		int Arraylist=obj.nextInt();
		int numberlist[] =new int[ Arraylist];
		for(int i=0;i<numberlist.length;i++)
		{
			//System.out.println("numbers are :");
			numberlist[i]=obj.nextInt();
		}
//int Arraylist[]={5,6,11,7};
///*for (int number:Arraylist)



//System.out.println("Number +="+numberlist);

Arrays.sort(numberlist);
for (int number:numberlist)
{
	System.out.println("Number ="+number);

	}

}
}
