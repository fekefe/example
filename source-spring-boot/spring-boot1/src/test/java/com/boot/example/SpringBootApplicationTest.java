package com.boot.example;

import com.alibaba.fastjson.JSON;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class SpringBootApplicationTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;
	
	@Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	public void post(String uri, String bodyText) throws Exception {
		MockHttpServletRequestBuilder accept = MockMvcRequestBuilders.post(uri).accept(MediaType.APPLICATION_JSON);
		if (bodyText != null && !bodyText.isEmpty()) {
			accept = accept.content(bodyText);
		}
		mockMvc.perform(accept);
	}
	
	public void postMap(String uri, Map<String, Object> map) throws Exception {
		MockHttpServletRequestBuilder accept = MockMvcRequestBuilders.post(uri).accept(MediaType.APPLICATION_JSON);
		if (map != null && !map.isEmpty()) {
			accept = accept.content(JSON.toJSONString(map));
		}
		mockMvc.perform(accept);
	}
	
	
	@Test
	public void test1() throws Exception {
		MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
				MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
		
		post("/entity", null);
		post("/entity", "");
		
		Map<String, Object> map;
		String addUri = "/entity/add";
		
		map = new HashMap<>();
		map.put("id", 1);
		map.put("value", "a");
		postMap(addUri, map);
		
		map = new HashMap<>();
		map.put("id", 2);
		map.put("value", "b");
		postMap(addUri, map);
		
		map = new HashMap<>();
		map.put("id", 3);
		map.put("value", "c");
		postMap(addUri, map);
		
		map = new HashMap<>();
		map.put("id", 4);
		map.put("value", "d");
		postMap(addUri, map);
		
		ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/entity/all"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType(contentType))
				.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(4)));
		
		String bodyResult = result.andReturn().getResponse().getContentAsString();
		System.out.println(JSON.toJSONString(JSON.parse(bodyResult), true));
		
		//.andExpect((jsonPath("$.data.roles", Matchers.hasSize(size))));
		//.andExpect((jsonPath("$.data.roles", Matchers.containsInAnyOrder("role1", "role2", "role3"))));
	}
}
