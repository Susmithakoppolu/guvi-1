
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1;
		int t=n;
		int sum=0;
		while(n>0)
		{
			n1=n%10;
			sum=sum+(n1*n1*n1);
			n=n/10;
		}
		if(t==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
