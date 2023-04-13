/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
package week3day2assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String name="changeme";
		String s="";
		
		char[] ch = name.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(i%2!=0) {
				s=s+Character.toUpperCase(ch[i]);
				//System.out.println(revName);
			}else {
				s=s+Character.toLowerCase(ch[i]);
				//System.out.println(revName);
			}
			
			System.out.println(s.toString());
	
	}

}
}
