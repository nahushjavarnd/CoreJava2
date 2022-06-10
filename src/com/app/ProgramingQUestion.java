package com.app;

public class ProgramingQUestion {
	
	private static String reverse(String in) {
		
		if(in == null) throw new IllegalArgumentException("Null is not valid");
		
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		
		for(int i = chars.length - 1 ; i>=0; i--) {
			out.append(chars[i]);
			
			
			
			
		}
		return out.toString();
}
	
	public static void main(String[] args) {

		String str = "123";
		System.out.println(reverse(str));
	
	
	
	// Set it to the number of elements you want in the Fibonacci Series
			 int maxNumber = 20; 
			 int previousNumber = 0;
			 int nextNumber = 1;
			 
		        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
	 
		        for (int i = 1; i <= maxNumber; ++i)
		        {
		            System.out.print(previousNumber+" ");
		            /* On each iteration, we are assigning second number
		             * to the first number and assigning the sum of last two
		             * numbers to the second number
		             */
	 
		      
		            int sum = previousNumber + nextNumber;
		            previousNumber = nextNumber;
		            nextNumber = sum;
		        }
System.out.println("\n ======================================================================================================================");	 		        
		        int a[]={1,2,3,4,5,6,7,8,9,3,2};  
		        
		        	System.out.println("Odd Numbers:");  
		        		for(int i=0;i<a.length;i++){  
		        				if(a[i]%2!=0){  
		        						System.out.println(a[i]);  
		        				}  
		        		}  
System.out.println("======================================================================================================================");	 		        		
		        System.out.println("Even Numbers:");  
		        		for(int i=0;i<a.length;i++){  
		        			if(a[i]%2==0){  
		        				System.out.println(a[i]);  
		        			}  
		        		}  
	System.out.println("/n======================================================================================================================");	 
// Java Program to print Even numbers from 1 to n or 1 to 100
		        		
		        		int n = 100;
		        		System.out.print("Even Numbers from 1 to "+n+" are: ");
		        		
		        		for (int i = 1; i <= n; i++) {
		        			   //if number%2 == 0 it means its an even number
		        			   if (i % 2 == 0) {
		        				System.out.println(i + " ");
		        			   }
		        		}
System.out.println("======================================================================================================================");	 
		        		System.out.print("odd Numbers from 1 to "+n+" are: ");
		        		for (int j = 1; j <= n; j++) {
		        			   //if number%2 == 0 it means its an even number
		        			   if (j % 2 != 0) {
		        				System.out.print(j + " ");
		        			   }
		        			}
System.out.println("/n======================================================================================================================");	 
		        		
		        		// Palindrom
		        		
		        		String str1="NahaN";
		        		String rev = "";
		        		
		        		int length = str1.length();
		        		for ( int i1 = length - 1; i1 >= 0; i1-- )
		        	         rev = rev + str1.charAt(i1);
		        	 
		        	      if (str1.equals(rev))
		        	         System.out.println(str1+" is a palindrome");
		        	      else
		        	         System.out.println(str1+" is not a palindrome");
System.out.println("/n======================================================================================================================");	        	      
		        	      String string = "    String    with    space    ";
		        	        System.out.println("Before replaceAll : \"" + string+"\"");
	


}
}