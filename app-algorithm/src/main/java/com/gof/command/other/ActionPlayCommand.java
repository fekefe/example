package com.gof.command.other;

/**
 * 具体命令角色，动作1
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class ActionPlayCommand extends Command {
	public ActionPlayCommand(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void Execute() {
		receiver.play();
	}
}
