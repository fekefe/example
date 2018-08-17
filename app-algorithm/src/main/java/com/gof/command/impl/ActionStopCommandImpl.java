package com.gof.command.impl;

import com.gof.command.Command;
import com.gof.command.Receiver;

/**
 * 具体命令角色，动作3
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class ActionStopCommandImpl extends Command {
	public ActionStopCommandImpl(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void Execute() {
		receiver.stop();
	}
}
