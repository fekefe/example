package com.ggh.word;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
public class XmlParseWord {

	public void createWord() {
		XmlWord test = new XmlWord();
		//1、载入模板
		Document doc = test.LoadXml("e:/doc/book.xml");
		//2、设置标记，tagList中存放的标记要同模板中的标记一致；
		List<String> tagList = new ArrayList<String>();
		tagList.add("${title}");
		tagList.add("${money}");
		tagList.add("${yearStart}");
		tagList.add("${monthStart}");
		tagList.add("${dayStart}");
		tagList.add("${yearEnd}");
		tagList.add("${monthEnd}");
		tagList.add("${dayEnd}");
		//3、设置填充标记的值，dataList中存放数据顺序与tagList存放标记顺序一致；
		List<String> dataList = new ArrayList<String>();
		dataList.add("中交兴路");
		dataList.add("100");
		dataList.add("2015");
		dataList.add("7");
		dataList.add("21");
		dataList.add("2016");
		dataList.add("8");
		dataList.add("1");
		//4、将标记和标记值存入dataMap
		test.setData(tagList, dataList);
		//5、替换值
       /*添加图片*/
		// test.replacePic(doc.getDocumentElement(), "${img}", "8.jpg", imgStr);
		// test.replaceTagContext(doc.getDocumentElement());
		//6、写入文档
		test.doc2XmlFile(doc, "e:/doc/xml2book.doc");
	}

	public static void main(String[] args) {
		XmlParseWord test = new XmlParseWord();
		test.createWord();
	}


}
