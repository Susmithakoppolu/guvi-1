import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
class maxarrnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int sum=0;
		for(int i=n-1;i>=0;i--)
		{
			sum=sum*10+a[i];
		}
		System.out.println(sum);
	}
}
