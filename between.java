import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class between
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<n&&b>n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
