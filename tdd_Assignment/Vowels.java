package tdd_Assignment;

public class Vowels {
	static int count=0;
	public static int countVowels(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
			{
				count++;
			}
			
		}
		return count;
	}

}
