package com.gof.singleton;

/**
 * 双例模式，如果是三例模式就吧len参数改成3调用方法Doubleton doubleton = Doubleton.getDoubleton();
 * doubleton.getValue("我有两个实例！");
 * Created by Administrator on 2016/12/5.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Doubleton {
	private static List<Doubleton> list = new ArrayList<>();
	private static int len = 2;
	
	static {
		for (int i = 0; i < len; i++) {
			list.add(new Doubleton());
		}
	}
	
	private Doubleton() {
	}
	
	public static Doubleton getDoubleton() {
		Random random = new Random();
		int current = random.nextInt(len);
		return (Doubleton) list.get(current);
	}
	
	public String getValue(String name) {
		return name;
	}
}