package com.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcast.ssm.mapper.CustomerMapper;
import com.itcast.ssm.pojo.Customer;
import com.itcast.ssm.pojo.QueryVo;
import com.itcast.ssm.service.CustomerService;
import com.itcast.ssm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> getPageCustomer(QueryVo vo) throws Exception {
		
		
		
		if(vo!=null){
			if(vo.getRows()==null) vo.setRows(10);//设置每页显示数量
			if(vo.getPage()==null) vo.setPage(1);
			
			vo.setStart((vo.getPage()-1)*vo.getRows()); // 设置 分页 显示 条件 limit m,n   ————————》 limit 
		}
		
		
		/****封装Page类的属性*****/
		Page<Customer> pageinfo = new Page<>();
		pageinfo.setPage(vo.getPage());
		pageinfo.setRows(customerMapper.getCustomerByQueryVo(vo));
		pageinfo.setSize(vo.getRows());
		pageinfo.setTotal(customerMapper.getCount(vo));
		
		
		return pageinfo;
	}
	
	
}
