package com.xworkz.java.thread;

public class MyThread2 extends Thread {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("MyThread2 "+i);
		}
		
	}

}
