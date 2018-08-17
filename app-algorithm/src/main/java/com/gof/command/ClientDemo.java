package com.gof.command;

import com.gof.command.impl.ActionPlayCommandImpl;
import com.gof.command.impl.ActionRewindCommandImpl;
import com.gof.command.impl.ActionStopCommandImpl;

/**
 * 命令模式
 * 客户端
 * <br>
 * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系
 * 但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 * @author gaoquan on 2018/8/16
 */
public class ClientDemo {
	
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
