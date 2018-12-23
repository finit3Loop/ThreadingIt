package com.jarret.ThreadingIt;

public class ApplicationMain {

	public static void main(String[] args) {
		System.out.println("New package");

		Thread t1 = new Thread(new NewTask("t1"));
		Thread t2 = new Thread(new NewTask("t2"));
		Thread t3 = new Thread(new NewTask("t3"));
		Thread t4 = new Thread(new NewTask("t4"));
		Thread t5 = new Thread(new NewTask("t5"));
		Thread t6 = new Thread(new NewTask("t6"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
