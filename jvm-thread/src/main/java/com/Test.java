package com;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2017/12/17
 */
public class Test {

	class Yes1 implements Runnable {
		@Override
		public void run() {
			System.out.println(1);
		}
	}


	@org.junit.Test
	public void main() {
		// Yes1 y = new Yes1();

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		});
		t.start();
	}
}
