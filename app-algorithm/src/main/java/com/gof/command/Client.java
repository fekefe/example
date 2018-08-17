package com.gof.command;

import com.gof.command.impl.ActionPlayCommandImpl;
import com.gof.command.impl.ActionRewindCommandImpl;
import com.gof.command.impl.ActionStopCommandImpl;

/**
 * 命令模式
 * 客户端
 * @author gaoquan on 2018/8/16
 */
public class Client {
	
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		Command actionPlayCommand = new ActionPlayCommandImpl(receiver);
		Command actionRewindCommand = new ActionRewindCommandImpl(receiver);
		Command actionStopCommand = new ActionStopCommandImpl(receiver);
		
		
		invoker.setCommand(actionPlayCommand);
		invoker.ExecuteCommand();
		
		invoker.setCommand(actionRewindCommand);
		invoker.ExecuteCommand();
		
		invoker.setCommand(actionStopCommand);
		invoker.ExecuteCommand();
	}
	
}
