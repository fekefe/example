package com.boot.example.swagger;


import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class ResponseMap {
	
	@ApiModelProperty(required = true, example = "4.1.8")
	private String versionName;
	
	@ApiModelProperty(required = true, example = "1")
	private String versionCode;
	
	@ApiModelProperty(required = true, example = "0")
	private String status;
	
	@ApiModelProperty(example = "xxxx")
	private String errorMessage;
	
	@ApiModelProperty(example = "xxxx")
	private String exception;
	
	@ApiModelProperty(name = "data")
	private Map<String, Object> data;
	
	public String getVersionName() {
		return versionName;
	}
	
	public String getVersionCode() {
		return versionCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getException() {
		return exception;
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	
}
