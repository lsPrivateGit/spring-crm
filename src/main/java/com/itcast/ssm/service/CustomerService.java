package com.itcast.ssm.service;

import com.itcast.ssm.pojo.Customer;
import com.itcast.ssm.pojo.QueryVo;
import com.itcast.ssm.utils.Page;

public interface CustomerService {
	
	
	public Page<Customer> getPageCustomer(QueryVo vo) throws Exception;
}
