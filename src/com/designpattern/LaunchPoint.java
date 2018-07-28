package com.designpattern;

public class LaunchPoint {
	public static void main(String[] args)
	{
		  Student student = new Student.Builder()
				  .setName("Yagnik")
				  .setSurName("Mer")
				  .Build();
	}
}
