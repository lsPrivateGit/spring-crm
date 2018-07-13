package com.itcast.ssm.mapper;

import java.util.List;

import com.itcast.ssm.pojo.BaseDict;

public interface BaseDictMapper {
	
	/*
	 *根据类别代码查询客户信息 
	 */
	public List<BaseDict> getBaseDictByTypeCode(String typeCode) throws Exception;
	
	
	
}
