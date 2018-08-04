package week1day2homework;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numBerlist= {22,32,42,-22,-9};
int num=numBerlist[0];
for( int obj:numBerlist)
{
	if(obj>num)
	{
		num=obj;
	}
}
System.out.println(num+"is a large number");

	}

}
