package com.bridgelabz_day6_problems;
import java.util.Scanner;
public class StopWatch {
	public long startTime=0;
	public long stopTime=0;
	public long elapsed;

	
	public void start()
	{
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
	}

	
	public void stop()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTime);
	}

	public long getElapsedTime()
	{
		elapsed=stopTime-startTime;
		return elapsed;
	}
	public static void main(String[] args)
	{
		StopWatch watch=new StopWatch();
		long n;  
		Scanner sc=new Scanner(System.in);         
		System.out.println("Press '0' to Start Time: ");
		n=sc.nextLong();  
		watch.start();

		System.out.println();
		System.out.println("Press '9' to Stop Time: ");
		n=sc.nextLong();  
		watch.stop();

		long time = watch.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+time);
		System.out.println();
		System.out.println("time elapsed in seconds is: "+(time/1000));
	}
}

