package com.bridgelabz_day6_problems;

import java.util.Scanner;

public class fibonacci {
    void fibonacciNumber() {
    	
    	Scanner digit = new Scanner(System.in);
    	
    	System.out.println("enter a number to perform fibonacci: ");
    	
    	int integer = digit.nextInt();
    	
    	 int first = 0; 
    	 
    	    int second = 1; 
    	    int add; 
    	    var i = 0; 
    	    for (i = 0; i <integer ; i++)  
    	    { 
    	        add = first + second; 
    	        first = second; 
    	        second = add; 
    	    } 
    	   System.out.println("sum of the fibonacci series till "+integer+" is "+second );  
    }
    public static void main(String[] args) {
    	new fibonacci().fibonacciNumber();
    }
}
