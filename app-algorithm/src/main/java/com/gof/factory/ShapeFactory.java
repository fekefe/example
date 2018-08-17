package com.gof.factory;

/**
 * @author gaoquan on 2018/2/11
 */
public class ShapeFactory {
	
	public static IShape getClass(Class<? extends IShape> clazz) {
		IShape obj = null;
		
		try {
			obj = (IShape) Class.forName(clazz.getName()).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	// public static <T> T getClass(Class<? extends IShape> clazz) {
	// 	T obj = null;
	//
	// 	try {
	// 		obj = (T) Class.forName(clazz.getName()).newInstance();
	// 	} catch (ClassNotFoundException e) {
	// 		e.printStackTrace();
	// 	} catch (InstantiationException e) {
	// 		e.printStackTrace();
	// 	} catch (IllegalAccessException e) {
	// 		e.printStackTrace();
	// 	}
	//
	// 	return obj;
	// }
	
}