package com.boot.example.controller;

import com.boot.example.bean.CommonRequestBean;
import com.boot.example.swagger.ResponseMap;
import com.boot.example.swagger.SwagMessage;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/22
 */
@RestController
@Api(tags = "1.4基础公共接口", description = "基础公共接口")
// @Order(value= Ordered.HIGHEST_PRECEDENCE)
public class CommonController extends BaseController {
	
	
	@RequestMapping(value = {"/ptl_ipvp_cmn_cmn005"}, produces = CHAR_SET, method = RequestMethod.POST)
	@ApiOperation(response = ResponseMap.class, value = "1." + SwagMessage.VALUE_MSG_1, notes = SwagMessage.NOTE_MSG_1)
	public String ptl_ipvp_cmn_cmn001(
			CommonRequestBean commonRequestBean,
			@ApiParam(value = "私有参数") long id
	) {
		return "";
	}
	
	@RequestMapping(value = {"/ptl_ipvp_cmn_cmn001"}, produces = CHAR_SET, method = RequestMethod.POST)
	@ApiOperation(response = ResponseMap.class, value = "2." +SwagMessage.VALUE_MSG_2, notes = SwagMessage.NOTE_MSG_2)
	public String ptl_ipvp_cmn_cmn002(
			CommonRequestBean commonRequestBean,
			@ApiParam(value = "私有参数") long id
	
	) {
		return "";
	}
	
	
	@RequestMapping(value = {"/ptl_ipvp_cmn_cmn006"}, produces = CHAR_SET, method = RequestMethod.POST)
	@ApiOperation(response = ResponseMap.class, value = "3." +SwagMessage.VALUE_MSG_1, notes = SwagMessage.NOTE_MSG_1)
	public String ptl_ipvp_cmn_cmn006(
			CommonRequestBean commonRequestBean,
			@ApiParam(value = "私有参数") long id
	) {
		
		
		// Lists.newArrayList(
		// User.builder().id(1).name("test-name1").birth(new Date()).build(),
		// User.builder().id(2).name("test-name2").birth(new Date()).build()
		// );
		
		return "";
	}
	
	
	@RequestMapping(path = "/test/get", method = RequestMethod.POST)
	@ApiOperation(response = String.class, value = SwagMessage.VALUE_MSG_1, notes = SwagMessage.NOTE_MSG_1, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
			//这个是入参，因为入参是request，所以要在这里定义，如果是其它的比如spring或javabean入参，可以在参数上使用@ApiParam注解
			@ApiImplicitParam(name = "Service", value = "服务", required = true, defaultValue = "monitor", dataType = "String"),
			@ApiImplicitParam(name = "Region", value = "机房", required = true, dataType = "String"),
			@ApiImplicitParam(name = "Version", value = "版本", required = true, dataType = "String"),
			@ApiImplicitParam(name = "name", value = "名称", example = "kaddefault", required = true, dataType = "String"),
			@ApiImplicitParam(name = "producttype", value = "产品类型", example = "12", required = true, dataType = "int"),
			@ApiImplicitParam(name = "tags", dataType = "String", example = "{\"port\":8080}")
	})
	public String get(HttpServletRequest request) {
		return "";
	}
}
