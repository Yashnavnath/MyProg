package tdd_Assignment;

public class Calculator {
	
	public static int addofTwono(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static int subtraction(int a,int b )
	{
		int sub=a-b;
		return sub;
	}
	public static int multiOfTwoNo(int a,int b)
	{
		int mul = a*b;
		return mul;
		
	}
	public static int division(int a,int b)
	{
		int div=a/b;
		return div;
	}
	public static int modules(int a,int b)
	{
		int div=a/b;
		int mod=a-(div*b);
		return mod;
		
	}
	public static int power(int n,int p)
	{
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow*=n;
		}
		return pow;
	}
	public static int square(int a)
	{
		if(a<0)
		{
			throw new IllegalArgumentException();
		}
		int squr=a*a;
		return squr;
		
	}
	public static int cube(int a)
	{
		if(a<0)
		{
			throw new IllegalArgumentException();
		}
		int cube1=a*a*a;
		return cube1;
		
	}

}
