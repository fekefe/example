package com.gof.Iterator;

import com.gof.Iterator.impl.NameRepositoryImpl;

/**
 * 迭代器模式
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * <br>
 * 使用场景：
 * 1、访问一个聚合对象的内容而无须暴露它的内部表示。
 * 2、需要为聚合对象提供多种遍历方式。
 * 3、为遍历不同的聚合结构提供一个统一的接口。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		NameRepositoryImpl namesRepository = new NameRepositoryImpl();
		
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
	
}
