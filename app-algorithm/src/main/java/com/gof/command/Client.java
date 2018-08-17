package com.gof.command;

/**
 * 命令模式
 * 客户端
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/16
 */
public class Client {
	
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		Command actionPlayCommand = new ActionPlayCommand(receiver);
		Command actionRewindCommand = new ActionRewindCommand(receiver);
		Command actionStopCommand = new ActionStopCommand(receiver);
		
		
		invoker.setCommand(actionPlayCommand);
		invoker.ExecuteCommand();
		
		invoker.setCommand(actionRewindCommand);
		invoker.ExecuteCommand();
		
		invoker.setCommand(actionStopCommand);
		invoker.ExecuteCommand();
		
		
		

		
		
		
		
		
		
	}
	
}
