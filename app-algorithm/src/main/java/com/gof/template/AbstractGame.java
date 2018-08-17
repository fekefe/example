package com.gof.template;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public abstract class AbstractGame implements IGame {
	
	//模板
	public final void play() {
		
		//初始化游戏
		initialize();
		
		//开始游戏
		startPlay();
		
		//结束游戏
		endPlay();
		
	}
	
}
