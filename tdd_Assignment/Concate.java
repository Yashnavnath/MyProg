package tdd_Assignment;

public class Concate {
	
	public static String concateArray()
	{
		String[] str= {"apple","banana","orange","Lemon"};
				
		String joinString=String.join("-", str);
		return joinString;
	}

}
