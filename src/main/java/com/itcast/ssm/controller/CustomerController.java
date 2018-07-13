package com.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itcast.ssm.pojo.BaseDict;
import com.itcast.ssm.pojo.Customer;
import com.itcast.ssm.pojo.QueryVo;
import com.itcast.ssm.service.BaseDictService;
import com.itcast.ssm.service.CustomerService;
import com.itcast.ssm.utils.Constants;
import com.itcast.ssm.utils.Page;

@Controller
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customer/list",method=RequestMethod.GET)
	public String listCustomer(Model model,QueryVo vo) throws Exception{
		
		List<BaseDict> listIndustry = baseDictService.getBaseDictByTypeCode(Constants.CON_CUST_INDUSTRY);//客户所属行业
		List<BaseDict> listLevel = baseDictService.getBaseDictByTypeCode(Constants.CON_CUST_LEVEL);//客户级别
		List<BaseDict> listSource = baseDictService.getBaseDictByTypeCode(Constants.CON_CUST_SOURCE);//客户信息来源
		
		//查询封装了用户信息的Page
		Page<Customer> page = customerService.getPageCustomer(vo);
		model.addAttribute("page", page);
		
		/**************查询条件回显******************/
		if(vo.getCustName()!=null){
			model.addAttribute("custName", vo.getCustName());
		}
		if(vo.getCustIndustry()!=null){ 
			model.addAttribute("custIndustry", vo.getCustIndustry());
		}
		if(vo.getCustSource()!=null){
			model.addAttribute("custSource", vo.getCustSource());		
		}
		if(vo.getCustLevel()!=null){
			model.addAttribute("custLevel", vo.getCustLevel());
		}
		/**************查询条件回显******************/
		
		model.addAttribute("listIndustry", listIndustry);
		model.addAttribute("listLevel", listLevel);
		model.addAttribute("listSource", listSource);
		
		return "customer";
	}
}
