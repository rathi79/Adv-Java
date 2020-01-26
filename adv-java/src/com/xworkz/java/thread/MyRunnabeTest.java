package com.xworkz.java.thread;

public class MyRunnabeTest {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		MyRunnabe1 mr1=new MyRunnabe1();
		
		Thread t=new Thread(mr);
		Thread t1=new Thread(mr1);
		
		t.start();
		t1.start();
		
		for(int i=0; i<5; i++)
			System.out.println("Main Thread "+i);
	}

}
