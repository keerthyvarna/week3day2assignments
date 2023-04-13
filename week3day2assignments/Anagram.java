/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
package week3day2assignments;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int l1=text1.length();
		int l2=text2.length();
		if(l1==l2)
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			Boolean b=Arrays.equals(ch1, ch2);
			if(b==true)
			{
				System.out.println("The given strings " +text1 + " and " +text2 + " are anagrams");
			}
			else {
				System.out.println("The given strings " +text1 + " and " +text2 + " are not anagrams");
			}
			
			}
		    else {
			System.out.println("The given strings "  +text1 + " and " +text2 + " are not anagrams");
		}

	}

}
