package com.boot.example.service;

import com.boot.example.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/5
 */
public class OapServiceTest extends BaseTest {
	
	@Autowired
	private OssAccountProductService ossAccountProductService;
	
	@Test
	public void insertSelectiveBatch() {
		
		try (InputStream inputStream = new FileInputStream("E:\\asucai\\export.txt");
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
		) {
			String line = "";
			
			List<Map> params = new ArrayList<>();
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] split = line.split(",");
				
				String accountId = split[0];
				String userId = split[1];
				
				Map<String, Object> map1 = new HashMap<>();
				map1.put("accountId", accountId);
				map1.put("userId", userId);
				map1.put("productId", 42L);
				map1.put("boProductId", "cc-prod_101_80ba4f53-0376-427b-b278-27401ef2bade");
				params.add(map1);
				
				Map<String, Object> map2 = new HashMap<>();
				map2.put("accountId", accountId);
				map2.put("userId", userId);
				map2.put("productId", 43L);
				map2.put("boProductId", "cc-prod_101_2934c1d6-0d3b-4dd4-ad1d-1f256e070e8b");
				params.add(map2);
				
				// if (params.size() >= 10000) {
				// 	ossAccountProductService.insertSelectiveBatch(params);
				// 	params.clear();
				// }
			}
			ossAccountProductService.insertSelectiveBatch(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertSelective() {
		Map<String, Object> map = new HashMap<>();
		ossAccountProductService.insertSelective(map);
	}
	
	@Test
	public void selectByPrimaryKey() {
		Long id = 94L;
		ossAccountProductService.selectByPrimaryKey(id);
	}
	
	@Test
	public void selectByNewId() {
		String newId = "cc-uspr_101_9d7d2e9f-7e71-4d8a-8181-555d40253b95";
		ossAccountProductService.selectByNewId(newId);
	}
}
