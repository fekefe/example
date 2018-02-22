package com.algorithm.best;

import org.junit.Test;

import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 * 栈从顶到底按从大到小的顺序排序
 * @author gaoquan on 2018/1/24
 */
public class Test1_Stack5 {
	
	private Stack<Integer> init() {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(4);
		return stack;
	}
	
	private void method(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<>();
		while (!stack.isEmpty()) {
			Integer pop = stack.pop();
			while (!temp.isEmpty() && temp.peek() > pop) {
				stack.push(temp.pop());
			}
			temp.push(pop);
		}
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
	}
	
	@Test
	public void app() {
		Stack<Integer> init = this.init();
		this.method(init);
		System.out.println(1);
	}
}
