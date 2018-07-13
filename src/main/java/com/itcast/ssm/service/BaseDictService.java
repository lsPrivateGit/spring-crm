package com.itcast.ssm.service;

import java.util.List;

import com.itcast.ssm.pojo.BaseDict;

public interface BaseDictService {

	public List<BaseDict> getBaseDictByTypeCode(String typeCode) throws Exception;

}
