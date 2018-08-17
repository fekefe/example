package com.gof.command;

import com.gof.command.impl.ActionPlayCommand;
import com.gof.command.impl.ActionRewindCommand;
import com.gof.command.impl.ActionStopCommand;

/**
 * 命令模式
 * 客户端
 * @author gaoquan on 2018/8/16
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
