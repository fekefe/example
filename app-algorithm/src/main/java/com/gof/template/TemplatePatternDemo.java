package com.gof.template;

import com.gof.template.impl.Cricket;
import com.gof.template.impl.Football;

/**
 * 模板模式
 * 接口-》抽象-》实现
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class TemplatePatternDemo {
	
	public static void main(String[] args) {
		AbstractGame game = new Cricket();
		game.play();
		
		System.out.println();
		
		game = new Football();
		game.play();
	}
	
}
