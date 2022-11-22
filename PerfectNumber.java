package com.bridgelabz_day6_problems;

import java.util.Scanner;

public class PerfectNumber {
void numberFactor() {
		
		int count = 0;
		
		Scanner numbers = new Scanner(System.in);
		System.out.println("enter any integer:");
		
	    int	number = numbers.nextInt();
	     
	     int factor;
			   for(factor=1;factor<=number/2;factor++) {
				   
				 if(number % factor == 0) {
					 
					System.out.println(factor+ " is a factor to the "+number);
					System.out.println();
					count = count+factor;
				 }
			
			   }if (number == count) {
				   
				   System.out.println(number+" is a perfect number");
				   System.out.println();
				   
			   }else {
				   System.out.println(number+" is not a perfect number");
			   }
			  
	}
public static void main(String[] args) {
	new PerfectNumber().numberFactor();
}
}
