package com.boot.example.controller;

import com.alibaba.fastjson.JSON;
import com.boot.example.bean.GenericEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/18
 */
@RestController
public class GenericEntityController {
	private List<GenericEntity> entityList = new ArrayList<>();
	
	
	@RequestMapping(value = "/entity", method = RequestMethod.POST)
	public String entity() {
		return "hello";
	}
	
	@RequestMapping("/entity/all")
	public List<GenericEntity> findAll() {
		return entityList;
	}
	
	@RequestMapping(value = "/entity/add", method = RequestMethod.POST)
	public GenericEntity addEntity(@RequestBody String json) {
		GenericEntity entity = JSON.parseObject(json, GenericEntity.class);
		entityList.add(entity);
		return entity;
	}
	
	@RequestMapping("/entity/find/{id}")
	public GenericEntity findById(@PathVariable Long id) {
		return entityList.stream()
				.filter(entity -> entity.getId().equals(id))
				.findFirst()
				.get();
	}
}

