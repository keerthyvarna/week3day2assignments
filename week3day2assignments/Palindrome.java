/*
	 * Pseudo Code
		 * a) Declare A String value as"madam"
	 	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
package week3day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		String revName="";
		char[] ch = name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			revName=revName+ch[i];
		}
		if(name.equals(revName)) {
			System.out.println("the given string "+name+" is a palindrome");
		}else {
			System.out.println("the given string "+name+" is not a palindrome");
		}

	}

}
