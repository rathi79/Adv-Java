package com.xworkz.java.thread;

public class MyRunnabe1 implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<5;i++)
		System.out.println("MyRunnabe1 "+i);
	}

}
