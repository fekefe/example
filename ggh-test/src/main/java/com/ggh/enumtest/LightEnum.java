package com.ggh.enumtest;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/4/13
 */
public enum LightEnum {
	/** 红灯 */
	RED,
	/** 绿灯 */
	GREEN,
	/** 黄灯 */
	YELLOW;
	
	LightEnum() {
		mask = (1 << ordinal());
	}
	
	public final int mask;
	
	public final int getMask() {
		return mask;
	}
	
}
