package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of numbers");
		Scanner obj=new Scanner(System.in);
		int numberlist=obj.nextInt();
		int arraylist[]=new int [numberlist];
		for(int i = 0;i<arraylist.length;i++)
		{
			arraylist[i]=obj.nextInt();
		}
		
		Arrays.sort(arraylist);
		List<Integer>list=new ArrayList<Integer>();
		
		for(int i = 0;i<arraylist.length;i++)
		{
			list.add(arraylist[i]);
		}
		int total=list.size();
		for(int each:arraylist)
		{
			System.out.println("the sorted numbers are:"+each);
		}
		System.out.println(""+list.get(total-2));

	}

}
