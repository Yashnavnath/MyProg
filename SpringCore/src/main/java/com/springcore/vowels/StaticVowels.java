package com.springcore.vowels;

public class StaticVowels {
public static Vowels getobj()
{
	return new CheckVowels();
}
}
