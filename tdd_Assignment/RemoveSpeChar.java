package tdd_Assignment;


// 9) Write a Junit test to check given string is removed all digits, white space and special 
//character. For example in your main code you will read following string This @ Red $car-.
//When you run your main code it will return following string This red car.

public class RemoveSpeChar {
	
	public static String removeSpeChar(String str)
	{
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		return str;
	}

}
