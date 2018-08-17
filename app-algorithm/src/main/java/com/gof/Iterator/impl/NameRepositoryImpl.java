package com.gof.Iterator.impl;

import com.gof.Iterator.IContainer;
import com.gof.Iterator.Iterator;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class NameRepositoryImpl implements IContainer {
	
	public String names[] = {"Robert", "John", "Julie", "Lora"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		
		int index;
		
		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
	
}
