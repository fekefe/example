package com.gof.singleton;

/**
 * 双检锁
 * Created by gaoquan on 2017/3/24.
 */
public class DoubleCheckedLockingSingleton {
	private volatile static DoubleCheckedLockingSingleton singleton;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return singleton;
	}
}
