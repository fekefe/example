package com.gof.singleton;

/**
 * 懒汉式
 * Created by Administrator on 2016/12/5.
 */
public class LazySingleton {
	private static LazySingleton singleton;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (singleton == null)
			singleton = new LazySingleton();
		return singleton;
	}

}
