package com.offer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author ggh on 2018/1/8
 */
public class Class4 {
	
	public static void main(String[] args) {
		String str = "We Are Happy";
		
		System.out.println(replace(str.toCharArray()));
	}
	
	
	private static String replace(char[] words) {
		int spaceCount = 0;
		int oldCount = words.length;
		for (int i = 0; i < oldCount; i++) {
			if (words[i] == ' ') {
				spaceCount++;
			}
		}
		int newCount = oldCount + spaceCount * 2;
		
		char[] newWords = new char[newCount];
		
		int newLength = newCount - 1;
		int i = oldCount - 1;
		while (i >= 0) {
			char word = words[i];
			if (word == ' ') {
				newWords[newLength] = '0';
				newWords[newLength - 1] = '2';
				newWords[newLength - 2] = '%';
				newLength = newLength - 3;
			} else {
				newWords[newLength] = word;
				newLength--;
			}
			i--;
			
		}
		
		return new String(newWords);
	}
}
