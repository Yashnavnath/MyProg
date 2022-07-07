package tdd_Assignment;

public class Pythagoras {
	
	static boolean templete(int arr[] ,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=j;k<n;k++)
				{
					int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
					if(x==y+z||y==x+z||z==x+y)
						return true;
				}
			}
		}
		return false;
	}

}
