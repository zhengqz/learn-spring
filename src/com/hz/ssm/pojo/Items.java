package com.hz.ssm.pojo;

import java.util.Date;

public class Items {
	private String name;
	private Float price;
	private String detail;
	private Date createTime = new Date();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + ", detail=" + detail + ", createTime=" + createTime + "]";
	}
    


}
