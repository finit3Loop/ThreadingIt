package com.jarret.ThreadingIt;

import java.util.*;

public class NewTask implements Runnable {

	String name;
	int TimeToWait;

	public NewTask(String n) {

		Random r = new Random();
		this.name = n;
		this.TimeToWait = r.nextInt(100);

	}

	public void run() {
		try {

			for (int i = 0; i < 100; i++) {
				System.out.println(this.name + " sleeping for " + TimeToWait);
				Thread.sleep(TimeToWait);
				System.out.println(this.name + "done sleeping");
				System.out.println(i);
			}
		} catch (Exception e) {
		}

	}

}
