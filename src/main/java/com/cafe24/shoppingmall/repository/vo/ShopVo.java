package com.cafe24.shoppingmall.repository.vo;

import java.util.List;

public class ShopVo {
	private int shop_no;
	private String src;
	private List<String> display_location;
	private String script_no;
	private String client_id;
	private String exclude_path;
	private String skin_no;
	private String created_date;
	private String updated_date;
	
	


	

	public ShopVo(int shop_no, String src, List<String> display_location) {
		this.shop_no = shop_no;
		this.src = src;
		this.display_location = display_location;
	}




	public int getShop_no() {
		return shop_no;
	}




	public void setShop_no(int shop_no) {
		this.shop_no = shop_no;
	}




	public String getSrc() {
		return src;
	}




	public void setSrc(String src) {
		this.src = src;
	}




	public List<String> getDisplay_location() {
		return display_location;
	}




	public void setDisplay_location(List<String> display_location) {
		this.display_location = display_location;
	}




	public String getScript_no() {
		return script_no;
	}




	public void setScript_no(String script_no) {
		this.script_no = script_no;
	}




	public String getClient_id() {
		return client_id;
	}




	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}




	public String getExclude_path() {
		return exclude_path;
	}




	public void setExclude_path(String exclude_path) {
		this.exclude_path = exclude_path;
	}




	public String getSkin_no() {
		return skin_no;
	}




	public void setSkin_no(String skin_no) {
		this.skin_no = skin_no;
	}




	public String getCreated_date() {
		return created_date;
	}




	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}




	public String getUpdated_date() {
		return updated_date;
	}




	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}




	@Override
	public String toString() {
		return "ShopVo [shop_no=" + shop_no + ", src=" + src + ", display_location=" + display_location + "]";
	}
	
	
}
