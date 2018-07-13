package com.itcast.ssm.mapper;

import java.util.List;

import com.itcast.ssm.pojo.Customer;
import com.itcast.ssm.pojo.QueryVo;

public interface CustomerMapper {
	
	/*
	 * 根据QueryVo来分页查询用户数据
	 */
	public List<Customer> getCustomerByQueryVo(QueryVo queryVo)throws Exception;
	
	
	/*
	 * 查询总记录数
	 */
	public int getCount(QueryVo queryVo) throws Exception; 
}
