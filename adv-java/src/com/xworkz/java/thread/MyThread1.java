package com.xworkz.java.thread;

public class MyThread1 extends Thread {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("MyThread1 "+i);
		}
		
	}

}
