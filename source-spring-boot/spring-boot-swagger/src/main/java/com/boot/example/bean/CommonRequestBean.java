package com.boot.example.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/19
 */
@ApiModel("用户")
public class CommonRequestBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty("用户ID")
	private String ptoken;
	
	@ApiModelProperty("用户ID")
	private String ptype;
	
	@ApiModelProperty("用户ID")
	private String plocation;
	
	@ApiModelProperty("用户ID")
	private String puser;
	
	@ApiModelProperty("用户ID")
	private String pversion;
	
	@ApiModelProperty("用户ID")
	private String pserverAddress;
	
	@ApiModelProperty("用户ID")
	private String pserialNumber;
	
	@ApiModelProperty("用户ID")
	private String pkv;
	
	@ApiModelProperty("用户ID")
	private String ptn;
	
	@ApiModelProperty("用户ID")
	private String tenantId;
	
	public String getPtoken() {
		return ptoken;
	}
	
	public void setPtoken(String ptoken) {
		this.ptoken = ptoken;
	}
	
	public String getPtype() {
		return ptype;
	}
	
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	
	public String getPlocation() {
		return plocation;
	}
	
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	
	public String getPuser() {
		return puser;
	}
	
	public void setPuser(String puser) {
		this.puser = puser;
	}
	
	public String getPversion() {
		return pversion;
	}
	
	public void setPversion(String pversion) {
		this.pversion = pversion;
	}
	
	public String getPserverAddress() {
		return pserverAddress;
	}
	
	public void setPserverAddress(String pserverAddress) {
		this.pserverAddress = pserverAddress;
	}
	
	public String getPserialNumber() {
		return pserialNumber;
	}
	
	public void setPserialNumber(String pserialNumber) {
		this.pserialNumber = pserialNumber;
	}
	
	public String getPkv() {
		return pkv;
	}
	
	public void setPkv(String pkv) {
		this.pkv = pkv;
	}
	
	public String getPtn() {
		return ptn;
	}
	
	public void setPtn(String ptn) {
		this.ptn = ptn;
	}
	
	public String getTenantId() {
		return tenantId;
	}
	
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
