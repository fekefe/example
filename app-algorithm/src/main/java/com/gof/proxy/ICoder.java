package com.gof.proxy;

/**
 * 抽象角色
 *
 * @author gaoquan on 2017/8/9.
 */
public interface ICoder {
	void implDemands(String demandName);

	void doSomething(String what);
}
