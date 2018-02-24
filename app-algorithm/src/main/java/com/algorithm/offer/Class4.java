package com.algorithm.offer;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author ggh on 2018/1/8
 */
public class Class4 {
	
	static String str = "We Are Happy     `     ``` ``` ``` `` ``` ````` ````` ``` ``` ``` ``` ```` `` `` `` ``` ``` ` ` ` ` ` ` ` `   ```     ";
	// static String str = "We Are Happy";
	// static String str = "";
	
	@BeforeClass
	public static void BeforeClass() {
		// for (int i = 0; i < 100000; i++) {
		// 	str += " -";
		// }
	}
	
	@Test
	public void test1() {
		// String str = "We Are Happy     1     ";
		//  str = "We   ";
		
		System.out.println(replace1(str.toCharArray()));
	}
	
	@Test
	public void test2() {
		// String str = "We Are Happy";
		//  str = "We   ";
		
		System.out.println(replace2(str));
	}
	
	
	private String replace1(char[] words) {
		int spaceCount = 0;
		int oldLength = words.length;
		for (int i = 0; i < oldLength; i++) {
			if (words[i] == ' ') {
				spaceCount++;
			}
		}
		int newLength = oldLength + spaceCount * 2;
		
		char[] newWords = new char[newLength];
		
		int indexOfNew = newLength - 1;
		int i = oldLength - 1;
		while (i >= 0) {
			char word = words[i];
			if (word == ' ') {
				newWords[indexOfNew--] = '0';
				newWords[indexOfNew--] = '2';
				newWords[indexOfNew--] = '%';
			} else {
				newWords[indexOfNew--] = word;
			}
			i--;
			
		}
		
		return new String(newWords);
	}
	
	
	private String replace2(String words) {
		words = words + "1";
		String[] split = words.split(" ");
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			temp.append(split[i]);
			temp.append("%20");
		}
		temp.delete(temp.length() - 4, temp.length());
		return temp.toString();
	}
}
