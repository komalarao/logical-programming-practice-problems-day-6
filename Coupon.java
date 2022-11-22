package com.bridgelabz_day6_problems;

public class Coupon {
	
		public static void main(String[] args) {
			
			char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
			
			int maximum = 834121844;
			int random=(int) (Math.random()*maximum);	
			
			StringBuilder buffer = new StringBuilder();
			
			while (random>0)
			{
				buffer.append(chars[random % chars.length]);
				random = random/ chars.length;
			}

			String couponCode =  buffer.toString();
			System.out.println("Coupon Code: "+couponCode);	
		}
}
