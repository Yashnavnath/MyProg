package tdd_Assignment;

import java.util.Scanner;

public class Q3Validation {
public static boolean matchData()
{
	String email="vijay@gmail.com";
	String pass="Vijay@1010";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Email");
	String str=sc.nextLine();
	System.out.println("Enter Password");
	String str1=sc.nextLine();
	if(email.equals(str)&& pass.equals(str1))
	{
		return true;
	}else
		return false;
	
}
public static void main(String[] args) {
	System.out.println(Q3Validation.matchData());
}
}
