package com.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcast.ssm.mapper.BaseDictMapper;
import com.itcast.ssm.pojo.BaseDict;
import com.itcast.ssm.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> getBaseDictByTypeCode(String typeCode) throws Exception {
		return baseDictMapper.getBaseDictByTypeCode(typeCode);
	}

}
