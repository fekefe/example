package com.ggh.string;

import org.junit.Test;

/**
 * 从两个字符串中找出相同最长字符串
 *
 * @author gaoquan on 2017/8/2.
 */
public class TwoStringFindSameTest {

	@Test
	public void test() {
		String str1 = "1234567890";
		String str2 = "1234_123456789_123456789";
		// this.contrast1(str1, str2);

		this.Get_long_public_str(str1, str2);

	}

	private void contrast1(String str1, String str2) {
		String a = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					String tempStr = this.contrast2(str1.substring(i), str2.substring(j));
					if (tempStr.length() > a.length()) {
						a = tempStr;
					}
				}
			}
		}
		System.out.println(a);
	}


	private String contrast2(String stra, String strb) {
		String result = "";
		int a = stra.length();
		int b = strb.length();
		int t = (a < b) ? a : b;
		for (int i = 0; i < t; i++) {
			if (stra.charAt(i) == strb.charAt(i)) {
				result += stra.charAt(i);
			} else {
				break;
			}
		}
		return result;
	}


	///////////////////////////////////
	public String Get_long_public_str(String str1, String str2) {
		String resultStr = "";
		String tmpStr = "";
		for (int i = 0; i < str1.length(); i++) {
			if (resultStr.length() == 0) {
				tmpStr = this.Get_Str2_Index(str1, str2, i, 1);
			} else {
				if (i + resultStr.length() + 1 > str1.length()) {
					tmpStr = "";
				} else {
					tmpStr = this.Get_Str2_Index(str1, str2, i, resultStr.length() + 1);
				}
			}

			if (tmpStr.length() > resultStr.length()) {
				resultStr = tmpStr;
			}
		}
		System.out.println(resultStr);
		return resultStr;

	}

	public String Get_Str2_Index(String str1, String str2, int i, int charCount) {
		String tmpChar = str1.substring(i, charCount);

		if (str2.indexOf(tmpChar) > 0) {
			charCount = charCount + 1;

			if (i + charCount > str1.length()) {
				return str1.substring(i, charCount - 1);
			} else {
				return Get_Str2_Index(str1, str2, i, charCount);
			}
		} else {
			return str1.substring(i, charCount - 1);
		}
	}
}




