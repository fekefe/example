package com.ggh.word;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/28.
 */
public class WordTest {

	private Configuration configuration = null;


	public WordTest() {
		configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
	}

	public void createWord() {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		try {
			dataMap.put("title", "中交兴路");
			dataMap.put("money", "100");
			dataMap.put("yearStart","2015");
			dataMap.put("monthStart","7");
			dataMap.put("dayStart","21");
			dataMap.put("yearEnd","2016");
			dataMap.put("monthEnd","8");
			dataMap.put("dayEnd","1");

			configuration.setClassForTemplateLoading(this.getClass(), "/template"); // FTL文件所存在的位置
			Template template = configuration.getTemplate("book.ftl");

			File outFile = new File("e:/doc/book1.doc");
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "UTF-8"));
			template.process(dataMap, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WordTest test = new WordTest();
		test.createWord();
	}
}
