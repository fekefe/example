package com.gof.command;

/**
 * 抽象命令角色
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public interface Command {
	
	void play();
	
	void rewind();
	
	void stop();
	
}
