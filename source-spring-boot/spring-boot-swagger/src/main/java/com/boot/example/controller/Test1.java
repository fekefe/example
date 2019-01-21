package com.boot.example.controller;

import com.boot.example.bean.CommonRequestBean;
import com.boot.example.swagger.ResponseMap;
import com.boot.example.swagger.SwagMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger.common.SwaggerPluginSupport;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/19
 */
@RestController
@Api(tags = "1.3测试1", description = "测试1")
// @Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1)
public class Test1 extends BaseController {
	
	@RequestMapping(value = {"/ptl_ipvp_cmn_3"}, produces = CHAR_SET, method = RequestMethod.POST)
	@ApiOperation(response = ResponseMap.class, value = SwagMessage.VALUE_MSG_2, notes = SwagMessage.NOTE_MSG_2)
	public String ptl_ipvp_cmn_cmn007(
			CommonRequestBean commonRequestBean,
			@ApiParam(value = "私有参数") long id
	
	) {
		return "";
	}
}
