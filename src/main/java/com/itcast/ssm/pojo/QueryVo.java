package com.itcast.ssm.pojo;

/*
 * 用于封装查询条件的pojo
 */
public class QueryVo {
	
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	
	
	/******在定义limit m,n分页展示信息*******/
	private Integer page;//当前页码
	private Integer start;//开始分页的页码
	private Integer rows;//每页显示数量
	
	/******在定义limit m,n分页展示信息*******/
	
	
	
	public String getCustName() {
		return custName;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	
	
	
	
	
}
