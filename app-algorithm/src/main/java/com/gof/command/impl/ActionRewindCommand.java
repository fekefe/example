package com.gof.command.impl;

import com.gof.command.Command;
import com.gof.command.Receiver;

/**
 * 具体命令角色，动作2
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class ActionRewindCommand extends Command {
	public ActionRewindCommand(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void Execute() {
		receiver.rewind();
	}
}
