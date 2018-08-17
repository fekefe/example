package com.ggh.enumtest;

/**
 * @author gaoquan on 2018/4/13
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
