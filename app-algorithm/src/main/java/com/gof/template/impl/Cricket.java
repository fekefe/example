package com.gof.template.impl;

import com.gof.template.AbstractGame;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class Cricket extends AbstractGame {
	
	@Override
	public void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}
	
	@Override
	public void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
	
	@Override
	public void endPlay() {
		System.out.println("Cricket Game Finished!");
	}
	
}
