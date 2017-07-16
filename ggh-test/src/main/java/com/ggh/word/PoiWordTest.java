package com.ggh.word;


import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/12/28.
 */
public class PoiWordTest {

	public static void main(String[] args) throws Exception {
		PoiWordTest test = new PoiWordTest();
		test.createWord();
	}

	public void createWord() throws Exception {
		Map<String, Object> params = new HashMap<String, Object>();

		params.put("title", "中交兴路");
		params.put("money", "100");
		params.put("yearFrom","2015");
		params.put("monthStart","7");
		params.put("dayStart","21");
		params.put("yearEnd","2016");
		params.put("monthEnd","8");
		params.put("dayEnd","1");

		String filePath = "e:\\doc\\1.docx";
		InputStream is = new FileInputStream(filePath);
		XWPFDocument doc = new XWPFDocument(is);
		//替换段落里面的变量
		this.replaceInPara(doc, params);
		//替换表格里面的变量
		this.replaceInTable(doc, params);
		OutputStream os = new FileOutputStream("e:\\doc\\write1.docx");
		doc.write(os);
		this.close(os);
		this.close(is);
	}

	/**
	 * 替换段落里面的变量
	 * @param doc 要替换的文档
	 * @param params 参数
	 */
	private void replaceInPara(XWPFDocument doc, Map<String, Object> params) {
		Iterator<XWPFParagraph> iterator = doc.getParagraphsIterator();
		XWPFParagraph para;
		while (iterator.hasNext()) {
			para = iterator.next();
			this.replaceInPara(para, params);
		}
	}

	/**
	 * 替换段落里面的变量
	 * @param para 要替换的段落
	 * @param params 参数
	 */
	private void replaceInPara(XWPFParagraph para, Map<String, Object> params) {
		List<XWPFRun> runs;
		Matcher matcher;
		if (this.matcher(para.getParagraphText()).find()) {
			runs = para.getRuns();
			for (int i=0; i<runs.size(); i++) {
				XWPFRun run = runs.get(i);
				String runText = run.toString();
				matcher = this.matcher(runText);
				if (matcher.find()) {
					while ((matcher = this.matcher(runText)).find()) {
						runText = matcher.replaceFirst(String.valueOf(params.get(matcher.group(1))));
					}
					//直接调用XWPFRun的setText()方法设置文本时，在底层会重新创建一个XWPFRun，把文本附加在当前文本后面，
					//所以我们不能直接设值，需要先删除当前run,然后再自己手动插入一个新的run。
					para.removeRun(i);
					XWPFRun xwpfRun = para.insertNewRun(i);
					xwpfRun.setUnderline(UnderlinePatterns.SINGLE);
					xwpfRun.setText(runText);
				}
			}
		}
	}

	/**
	 * 替换表格里面的变量
	 * @param doc 要替换的文档
	 * @param params 参数
	 */
	private void replaceInTable(XWPFDocument doc, Map<String, Object> params) {
		Iterator<XWPFTable> iterator = doc.getTablesIterator();
		XWPFTable table;
		List<XWPFTableRow> rows;
		List<XWPFTableCell> cells;
		List<XWPFParagraph> paras;
		while (iterator.hasNext()) {
			table = iterator.next();
			rows = table.getRows();
			for (XWPFTableRow row : rows) {
				cells = row.getTableCells();
				for (XWPFTableCell cell : cells) {
					paras = cell.getParagraphs();
					for (XWPFParagraph para : paras) {
						this.replaceInPara(para, params);
					}
				}
			}
		}
	}

	/**
	 * 正则匹配字符串
	 * @param str
	 * @return
	 */
	private Matcher matcher(String str) {
		Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		return matcher;
	}

	/**
	 * 关闭输入流
	 * @param is
	 */
	private void close(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭输出流
	 * @param os
	 */
	private void close(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}



}
