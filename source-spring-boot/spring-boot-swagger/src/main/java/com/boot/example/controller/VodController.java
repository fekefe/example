package com.boot.example.controller;

import com.boot.example.bean.CommonRequestBean;
import com.boot.example.swagger.ResponseMap;
import com.boot.example.swagger.SwagMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/19
 */
@RestController
@Api(tags = "1.1点播相关接口", description = "点播相关接口")
// @Order(value = Ordered.HIGHEST_PRECEDENCE)
// @Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1000)
public class VodController extends BaseController {
	
	
	@RequestMapping(value = {"/ptl_ipvp_cmn_vod001"}, produces = CHAR_SET, method = RequestMethod.POST)
	@ApiOperation(
			response = ResponseMap.class,
			value = SwagMessage.VALUE_MSG_2,
			notes = SwagMessage.NOTE_MSG_2
			, code = 202
	)
	public String ptl_ipvp_cmn_cmn007(
			CommonRequestBean commonRequestBean,
			@ApiParam(value = "私有参数", required = true, type = "query") long id
	
	) {
		
		
		// Lists.newArrayList(
		// User.builder().id(1).name("test-name1").birth(new Date()).build(),
		// User.builder().id(2).name("test-name2").birth(new Date()).build()
		// );
		
		return "";
	}
}
