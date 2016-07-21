package com.peoplejob.common;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import com.peoplejob.library.Json;

public class AbstractCache{

	protected Log log = LogFactory.getLog(AbstractCache.class);

	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	public void Insert(String key, Object obj){
		redisTemplate.opsForValue().set(key, Json.getJson().JsonSerialize(obj));
	}
}
