package com.gof.template.impl;

import com.gof.template.AbstractGame;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class Football extends AbstractGame {
	
	@Override
	public void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}
	
	@Override
	public void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
	
	@Override
	public void endPlay() {
		System.out.println("Football Game Finished!");
	}
	
}
