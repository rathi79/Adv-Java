package com.xworkz.java.thread;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		
		mt.start();
		mt1.start();
		mt2.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("MyThreadTest "+i);
		}
		
	}

}
