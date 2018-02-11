package com.gof.singleton;

/**
 * 内部类
 * Created by gaoquan on 2017/3/24.
 */
public class LazyInitHolderSingleton {
	private LazyInitHolderSingleton() {
	}
	
	public static LazyInitHolderSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	private static class SingletonHolder {
		private static final LazyInitHolderSingleton INSTANCE = new LazyInitHolderSingleton();
	}
	
	
}
