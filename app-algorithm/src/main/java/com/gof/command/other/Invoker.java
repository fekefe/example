package com.gof.command.other;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class Invoker {
	public Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ExecuteCommand() {
		command.Execute();
	}
	
}
