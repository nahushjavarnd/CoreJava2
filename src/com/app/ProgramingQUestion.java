package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramingQUestion {

	private static String reverse(String in) {

		if (in == null)
			throw new IllegalArgumentException("Null is not valid");

		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			out.append(chars[i]);

		}
		
		return out.toString();
	}

//====================================================================================================	
	static boolean isListOdd(List<Integer> arr1) {
		for (int i : arr1) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}

//=========================================================================================
	static void print2Largest(int arr[], int arr_size) {

		int i, first, second;

		if (arr_size < 2) {
			System.out.println(" Invalid input");
			return;
		}
		Arrays.sort(arr);
		for (i = arr_size - 2; i >= 0; i--) {
			if (arr[i] != arr[arr_size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}

		System.out.printf("There is no second " + "largest element\n");
	}

//=============================================================================================	
	public static void main(String[] args) {

		String str = "123";
		System.out.println(reverse(str));

		// Set it to the number of elements you want in the Fibonacci Series
		int maxNumber = 20;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		System.out.println(
				"\n ======================================================================================================================");
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 2 };

		System.out.println("Odd Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println(
				"======================================================================================================================");
		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println(
				"/n======================================================================================================================");
// Java Program to print Even numbers from 1 to n or 1 to 100

		int n = 100;
		System.out.print("Even Numbers from 1 to " + n + " are: ");

		for (int i = 1; i <= n; i++) {
			// if number%2 == 0 it means its an even number
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println(
				"======================================================================================================================");
		System.out.print("odd Numbers from 1 to " + n + " are: ");
		for (int j = 1; j <= n; j++) {
			// if number%2 == 0 it means its an even number
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println(
				"/n======================================================================================================================");

		// Palindrom

		String str1 = "NahaN";
		String rev = "";

		int length = str1.length();
		for (int i1 = length - 1; i1 >= 0; i1--)
			rev = rev + str1.charAt(i1);

		if (str1.equals(rev))
			System.out.println(str1 + " is a palindrome");
		else
			System.out.println(str1 + " is not a palindrome");
		System.out.println(
				"/n======================================================================================================================");
		String string = "    String    with    space    ";
		System.out.println("Before replaceAll : \"" + string + "\"");

		System.out.println(
				"/n======================================================================================================================");

		String Str1 = new String("Hi how are you Welcome to world codeing");
		System.out.print("Return Value :");
		System.out.println(Str1.replaceAll(" ", ""));

//2nd way  
		String str11 = "India     Is My    Country";
		char[] strArray = str11.toCharArray();

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {

				stringBuffer.append(strArray[i]);

			}
		}
		String noSpaceStr2 = stringBuffer.toString();
		System.out.println(noSpaceStr2);

		System.out.println(
				"=============================================================================================");

		String str111 = "  Hello World  ";
		System.out.println(str111);
		System.out.println(str111.trim());

		System.out.println(
				"==============================================================================================");

		int[] array = { 90, 23, 5, 109, 12, 22, 67, 34 };
//invoking sort() method of the Arrays class  
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop  
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

// factorial program

		int ii, fact = 1;

		int number = 5;

		for (ii = 1; ii <= number; ii++) {

			fact = fact * ii;
		}
		System.out.println("Factorial of" + number + "is:" + fact);

// seconde largest number from

		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n3 = arr.length;
		print2Largest(arr, n3);
// Fibonacci Series in Java without using recursion
		
int n1=0,n2=1,n31,i,count=10;

System.out.print(n1+""+n2);
		
		
		
		
	}

}