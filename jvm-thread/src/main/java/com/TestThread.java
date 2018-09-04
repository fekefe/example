package com;

import org.junit.Test;

/**
 * @author gaoquan on 2017/12/17
 */
public class TestThread {

	class Yes1 implements Runnable {
		@Override
		public void run() {
			System.out.println(1);
		}
	}


	@Test
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
