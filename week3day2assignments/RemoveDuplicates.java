/*
	 * Pseudo code 

	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

package week3day2assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
	    String[] split =text.split(" ");
	    String rep="";
	    String dup="";
	for (int i=0;i<=split.length-1;i++)
	{
	for(int j=i+1;j<=split.length-1;j++)
			{
		if(split[i].equalsIgnoreCase(split[j]))
				{
			count++;
			dup=split[j];
				}
		
			}
	}

	if(count>0)
	{
		rep=text.replaceAll(dup,"");
	}
	else
	{
	rep=text;
	}

	System.out.println(rep);
	}

	}
	
