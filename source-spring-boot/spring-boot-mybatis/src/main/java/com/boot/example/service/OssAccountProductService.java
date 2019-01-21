package com.boot.example.service;


import com.alibaba.fastjson.JSON;
import com.boot.example.base.BaseLogMethod;
import com.boot.example.dao.OssAccountProductDao;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/18
 */
@Service
public class OssAccountProductService {
	private static final String TAG = "OssAccountProductService";
	@Resource
	private OssAccountProductDao ossAccountProductDao;
	
	
	public void insertSelective(Map<String, Object> map) {
		
		map.put("discriminator", "AccountProductRef");
		map.put("amount", "-1");
		map.put("disableTime", "2099-01-01 23:59:59");
		map.put("enableTime", "2018-09-05 00:00:00");
		map.put("orderStatus", 1);
		map.put("stbId", "");
		map.put("subscribeTime", "2018-09-05 08:44:45");
		map.put("unit", "1");
		map.put("whoOrder", "0");
		map.put("deleteState", "\0");
		map.put("userProductId", "cc-uspr_101_" + UUID.randomUUID());
		
		map.put("accountId", "2");
		map.put("userId", "mc-user_101_05d3b5e8-cc48-4819-a0ff-3686816af0ae");
		
		map.put("productId", "43");
		map.put("boProductId", "cc-prod_101_2934c1d6-0d3b-4dd4-ad1d-1f256e070e8b");
		
		map.put("subscribeType", "1");
		map.put("subscribeTypeId", "md-data_101_4e707c4d-ff1a-11e7-8504-00059a3c7a00");
		
		ossAccountProductDao.insertSelective(map);
	}
	
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	public void insertSelectiveBatch(List<Map> params) throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false)) {
			OssAccountProductDao batchOssAccountProductDao = sqlSession.getMapper(OssAccountProductDao.class);
			int temp = 0;
			for (Map param : params) {
				param.put("userProductId", "cc-uspr_101_" + UUID.randomUUID());
				param.put("subscribeType", "1");
				param.put("subscribeTypeId", "md-data_101_4e707c4d-ff1a-11e7-8504-00059a3c7a00");
				batchOssAccountProductDao.insertSelective(param);
				temp++;
				if (temp >= 5000) {
					temp = 0;
					sqlSession.commit();
					sqlSession.clearCache();
				}
			}
			if (temp > 0) {
				sqlSession.commit();
				sqlSession.clearCache();
			}
		} catch (Exception e) {
			throw new Exception("执行失败", e);
		}
	}
	
	public void selectByPrimaryKey(Long id) {
		Map map = ossAccountProductDao.selectByPrimaryKey(id);
		BaseLogMethod.logInfo(TAG, JSON.toJSONString(map));
	}
	
	public void selectByNewId(String newId) {
		Map map = ossAccountProductDao.selectByNewId(newId);
		BaseLogMethod.logInfo(TAG, JSON.toJSONString(map));
	}
	
}
