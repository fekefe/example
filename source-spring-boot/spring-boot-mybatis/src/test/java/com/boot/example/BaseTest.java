package com.boot.example;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class BaseTest {
	
	// @Autowired
	// private WebApplicationContext mWebApplicationContext;
	
	// private static MockMvc mMockMvc = null;
	
	// @Before
	// public void setUp() throws Exception {
	// 	if (mMockMvc == null) {
	// 		mMockMvc = MockMvcBuilders.webAppContextSetup(mWebApplicationContext).build();
	//
	// 		// String[] beans = mWebApplicationContext.getBeanDefinitionNames();
	// 		// for (String bean : beans) {
	// 		// 	System.out.println("+++++++++ BEAN : " + bean);
	// 		// }
	// 	}
	// }
	
	// @Test
	// @Ignore
	// public void testControllerVersionConfig() throws Exception {
	// 	ResultActions result = mMockMvc.perform(MockMvcRequestBuilders.get("/version_config.do").accept(MediaType.APPLICATION_JSON));
	// 	String body = result.andExpect(status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn().getResponse().getContentAsString();
	// 	Assert.assertNotNull(body);
	// }
	//
	// private String execPost(Map<String, ?> infoMap, String uri, MockMultipartFile file) throws Exception {
	// 	Map<String, Object> totalMap = new HashMap<>();
	// 	totalMap.put("versionName", "4.1.8.1");
	// 	totalMap.put("versionCode", "1");
	//
	// 	if (infoMap != null) {
	// 		totalMap.put("info", infoMap);
	// 	}
	//
	// 	String bodyText = BaseJsonMethod.toStringWithDate(totalMap);
	//
	// 	String jsonText = URLEncoder.encode(bodyText, "utf-8");
	//
	// 	ResultActions result = mMockMvc.perform(MockMvcRequestBuilders.fileUpload(uri + "?jsonText=" + jsonText).file(file).accept(MediaType.APPLICATION_JSON));
	// 	String bodyResult = result.andExpect(status().isOk())
	// 			.andDo(MockMvcResultHandlers.print())
	// 			.andReturn().getResponse().getContentAsString();
	// 	System.out.println("---------------------------------params---------------------------------");
	// 	System.out.println(JSON.toJSONString(totalMap, true));
	// 	System.out.println("---------------------------------params---------------------------------");
	// 	System.out.println("---------------------------------result---------------------------------");
	// 	System.out.println(JSON.toJSONString(JSON.parseObject(bodyResult), true));
	// 	System.out.println("---------------------------------result---------------------------------");
	// 	return bodyResult;
	// }
	//
	// private String execPostEx(String bodyText, String uri, String accessToken) throws Exception {
	// 	if (accessToken == null) {
	// 		accessToken = "";
	// 	}
	// 	ResultActions result = mMockMvc.perform(MockMvcRequestBuilders.post(uri).content(bodyText).accept(MediaType.APPLICATION_JSON).header("accessToken", accessToken));
	// 	String bodyResult = result.andExpect(status().isOk())
	// 			.andDo(MockMvcResultHandlers.print())
	// 			.andReturn().getResponse().getContentAsString();
	// 	System.out.println("---------------------------------params---------------------------------");
	// 	System.out.println(JSON.toJSONString(JSON.parseObject(bodyText), true));
	// 	System.out.println("---------------------------------params---------------------------------");
	// 	System.out.println("---------------------------------result---------------------------------");
	// 	System.out.println(JSON.toJSONString(JSON.parseObject(bodyResult), true));
	// 	System.out.println("---------------------------------result---------------------------------");
	// 	return bodyResult;
	// }
	//
	// private String execPostEx(Map<String, ?> infoMap, String uri, String accessToken) throws Exception {
	// 	Map<String, Object> totalMap = new HashMap<>();
	// 	totalMap.put("versionName", "4.1.8.1");
	// 	totalMap.put("versionCode", "1");
	// 	if (infoMap != null) {
	// 		totalMap.put("info", infoMap);
	// 	}
	// 	String bodyText = BaseJsonMethod.toStringWithDate(totalMap);
	// 	return execPostEx(bodyText, uri, accessToken);
	// }
	//
	//
	// /**
	//  * 处理文件上传的方法
	//  * @param uri  the uri
	//  * @param map  the map
	//  * @param file the file
	//  * @return string
	//  * @throws Exception the exception
	//  */
	// protected String successPost(String uri, Map<String, Object> map, MockMultipartFile file) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPost(map, uri, file);
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// 	return resultBody.getData();
	// }
	//
	// /**
	//  * 处理非文件上传的方法
	//  * @param uri the uri
	//  * @param map the map
	//  * @return string
	//  * @throws Exception the exception
	//  */
	// protected String successPost(String uri, Map<String, Object> map) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPostEx(map, uri, "");
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// 	return resultBody.getData();
	// }
	//
	// protected String successPost(String uri, String json) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPostEx(json, uri, "");
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// 	return resultBody.getData();
	// }
	//
	// /**
	//  * @param uri the uri
	//  * @param map the map
	//  * @return string
	//  * @throws Exception the exception
	//  */
	// protected String successPostEx(String uri, Map<String, Object> map, String accessToken) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPostEx(map, uri, accessToken);
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// 	return resultBody.getData();
	// }
	//
	// protected void failPost(String uri, Map<String, Object> map, MockMultipartFile epgFile) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPost(map, uri, epgFile);
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertNotEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// }
	//
	// protected void failPost(String uri, Map<String, Object> map) throws Exception {
	// 	String body;
	// 	ResultBody resultBody;
	// 	body = execPostEx(map, uri, "");
	// 	Assert.assertNotNull(body);
	// 	resultBody = JSON.parseObject(body, ResultBody.class);
	// 	Assert.assertNotEquals("0", resultBody.getStatus());
	// 	Assert.assertNotNull(resultBody.getData());
	// }
	
}
