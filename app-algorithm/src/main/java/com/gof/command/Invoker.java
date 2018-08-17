package com.gof.command;

/**
 * @author gaoquan on 2018/8/16
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
