package com.mycompany.performance;

public class Driver {
	private int count = 500;
	private Container c;

	public Driver() {

	}

	public static void main(String[] args) {
		int count = 5000;
		Container c = new Container();
		while (true) {
			c.method1();
			c.method2();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// Can not think of anything to do here!
			}
		}

	}

}
