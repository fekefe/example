package com.suma.web;

import com.suma.bean.DemoObj;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/4
 */
@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping(value = "/")
	public String hello() {
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(new File("e:/upload/" + file.getOriginalFilename()), file.getBytes());
			return "ok";
		} catch (IOException e) {
			e.printStackTrace();
			return "wrong";
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/convert", produces = {"application/x-wisely"})
	public DemoObj convert(@RequestBody DemoObj demoObj) {
		return demoObj;
	}
	
	@ResponseBody
	@RequestMapping(value = "/push", produces = "text/event-stream")
	public String push() {
		Random r = new Random();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
	}
}
