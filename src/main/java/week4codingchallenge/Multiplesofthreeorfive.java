package week4codingchallenge;

public class Multiplesofthreeorfive {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		System.out.println("The multiples within 100 are");
		for(int i = 1;i<100;i++)
		{
			if(i%3==0||i%5==0)
			{
		sum+=i;

			}

		}
		System.out.println("Total is "+sum);

	}

}
