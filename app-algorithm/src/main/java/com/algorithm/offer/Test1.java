package com.algorithm.offer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 3[a] 输出aaa
 * 	3[ab]2[c] 输出abababcc
 * 	3[2[ab]2[c]] 输出ababccababccababcc
 * @author gaoquan on 2018/2/7
 */
public class Test1 {
	
	/*
	3[a]
	3[ab]2[c]
	3[2[ab]2[c]]
	 */
	
	class Node {
		int num;
		Object value;
	}
	
	public String method(Node[] nodes) {
		String result = "";
		for (Node node : nodes) {
			int num = node.num;
			Object value = node.value;
			if (value instanceof String) {
				for (int i = num; i > 0; i--) {
					result += value;
				}
			} else {
				String temp = this.method((Node[]) value);
				for (int i = num; i > 0; i--) {
					result += temp;
				}
			}
		}
		return result;
	}
	
	@Test
	public void test1() {
		List<Node> nodes = new ArrayList<>();
		Node node1 = new Node();
		node1.num = 3;
		node1.value = "a";
		nodes.add(node1);
		System.out.println("1:" + this.method(nodes.toArray(new Node[0])));
		
		nodes = new ArrayList<>();
		Node node21 = new Node();
		node21.num = 3;
		node21.value = "ab";
		Node node22 = new Node();
		node22.num = 2;
		node22.value = "c";
		nodes.add(node21);
		nodes.add(node22);
		System.out.println("2:" + this.method(nodes.toArray(new Node[0])));
		
		nodes = new ArrayList<>();
		Node node3 = new Node();
		Node node31 = new Node();
		node31.num = 2;
		node31.value = "ab";
		Node node32 = new Node();
		node32.num = 2;
		node32.value = "c";
		List<Node> nodes2 = new ArrayList<>();
		nodes2.add(node31);
		nodes2.add(node32);
		node3.num = 3;
		node3.value = nodes2.toArray(new Node[0]);
		nodes.add(node3);
		System.out.println("3:" + this.method(nodes.toArray(new Node[0])));
		
	}
	
	
	@Test
	public void test2() {
		JSONObject jsonObject = this.StringCreateJson();
		
		JSON.toJSONString(jsonObject);
		
	}
	
	public JSONObject StringCreateJson() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "大1");
		
		//粉丝是个数组,其实就是嵌套json
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", "小1");
		jsonObject1.put("age", 7);
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", "小2");
		jsonObject2.put("age", 10);
		
		//从此处可以看出其实list和json也是互相转换的
		List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
		jsonObjects.add(jsonObject1);
		jsonObjects.add(jsonObject2);
		jsonObject.put("fans", jsonObjects);
		
		System.out.println("jsonObject直接创建json:" + jsonObject);
		return jsonObject;
	}
	
}
