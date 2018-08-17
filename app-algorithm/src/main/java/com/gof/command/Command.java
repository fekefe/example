package com.gof.command;

/**
 * 抽象命令角色
 * @author gaoquan on 2018/8/16
 */
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void Execute();
	
}
