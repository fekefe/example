package com.gof.command;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class ActionCommand implements Command {
	
	@Override
	public void play() {
		System.out.println("Play");
	}
	
	@Override
	public void rewind() {
		System.out.println("Rewind");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop");
	}
}
