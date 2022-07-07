package tdd_Assignment;

public class HCF {
	static int hcf;
	public static int calHCF(int a,int b)
	{
		  for(int i = 1; i <= a || i <= b; i++) {
		         if( a%i == 0 && b%i == 0 )
		         hcf = i;
		      }
		  return hcf;
	}

}
