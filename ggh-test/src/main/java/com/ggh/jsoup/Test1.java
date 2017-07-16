package com.ggh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

/**
 * @author gaoquan on 2017/7/16.
 */
public class Test1 {

	@Test
	public void Case1() {
		String html = "<html><head><title>First parse</title></head>"
				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
		Document doc = Jsoup.parse(html);
		System.out.println(1);
	}
}
