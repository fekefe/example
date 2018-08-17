package com.ggh.enumtest;

import org.junit.Test;

import java.util.EnumSet;

/**
 * @author gaoquan on 2018/4/13
 */
public class LightTest {
	
	@Test
	public void test1() {
		System.out.println(LightEnum.RED.getMask() + " " + LightEnum.RED.ordinal());
		System.out.println(LightEnum.GREEN.getMask() + " " + LightEnum.GREEN.ordinal());
		System.out.println(LightEnum.YELLOW.getMask() + " " + LightEnum.YELLOW.ordinal());
		
		System.out.println(LightEnum.RED.getDeclaringClass());
		System.out.println(LightEnum.RED.name());
		System.out.println(LightEnum.RED.hashCode());
		System.out.println(LightEnum.RED.ordinal());
		System.out.println(LightEnum.RED.toString());
		
		LightEnum enumClassName = LightEnum.valueOf("RED");
		System.out.println(enumClassName.name());
		
		
		LightEnum enumClassOrdinal = LightEnum.values()[0];
		System.out.println(enumClassOrdinal.name());
		
		rr();
	}
	
	
	private void rr() {
		EnumSet<LightEnum> currEnumSet = EnumSet.allOf(LightEnum.class);
		for (LightEnum aLightSetElement : currEnumSet) {
			System.out.println(" 当前 EnumSet 中数据为： " + aLightSetElement);
		}
	}
}
