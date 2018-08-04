package week1day2homework;

import java.util.Scanner;

public class Operatorexamples
{
	
public void bitwiseOperator()
{
System.out.println("Enter the number 1");
Scanner obj=new Scanner(System.in);
int numBerone = obj.nextInt();
System.out.println("Enter the number 2");
int numBertwo = obj.nextInt();
{
	// TODO Auto-generated method stub
	System.out.println("OR Result="+(numBerone|numBertwo));
	System.out.println("AND Result="+(numBerone&numBertwo));
	System.out.println("Complement OR Result="+(~numBertwo));
	System.out.println("XOR Result="+(numBerone^numBertwo));
	System.out.println("Signed left shift Result="+(numBerone<<numBertwo));
	System.out.println("Signed right shift Result="+(numBerone>>numBertwo));
	System.out.println("UnSigned right shift  Result="+(numBerone>>>numBertwo));
}
}
public void relationalOperator()
{
System.out.println("Enter the number 1");
Scanner obj1=new Scanner(System.in);
int numBerone1 = obj1.nextInt();
System.out.println("Enter the number 2");
int numBertwo1 = obj1.nextInt();
{
	System.out.println("== result"+(numBerone1==numBertwo1));
	System.out.println("!= result"+(numBerone1!=numBertwo1));
	System.out.println(">= result"+(numBerone1>=numBertwo1));
	System.out.println("<= result"+(numBerone1>=numBertwo1));
	System.out.println("< result"+(numBerone1<numBertwo1));
	System.out.println("> result"+(numBerone1>numBertwo1));
}

	}
public void indecrementOperator()
{
System.out.println("Enter the number 1");
Scanner obj1=new Scanner(System.in);
int numBerone1 = obj1.nextInt();
System.out.println("Enter the number 2");
int numBertwo1 = obj1.nextInt();
{
	System.out.println("PostIncrement result"+(numBerone1++));
	System.out.println("PreIncrement result"+(++numBerone1));
	System.out.println("bothincrement result"+((++numBerone1)+(numBertwo1++)));
	System.out.println("PostIncrement result"+(numBerone1--));
	System.out.println("PreIncrement result"+(numBerone1--));
	System.out.println("bothincrement result"+((++numBerone1)-(numBertwo1++)));
}
}
public void ternaryOperator(int numBerone1)
{
	System.out.println("Enter the number 1");
	Scanner obj1=new Scanner(System.in);
	int numBerone2 = obj1.nextInt();
	System.out.println("Enter the number 2");
	int numBertwo2 = obj1.nextInt();
	{
		System.out.println("PostIncrement result"+(numBerone2++));
		System.out.println("PreIncrement result"+(++numBerone2));
		System.out.println("bothincrement result"+((++numBerone2)+(numBertwo2++)));
		System.out.println("PostIncrement result"+(numBerone2--));
		System.out.println("PreIncrement result"+(numBerone2--));
		System.out.println("bothincrement result"+((++numBerone2)-(numBertwo2++)));
}
}
}
