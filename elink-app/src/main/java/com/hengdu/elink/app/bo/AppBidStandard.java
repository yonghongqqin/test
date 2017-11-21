package com.hengdu.elink.app.bo;

import java.util.Date;

import com.hengdu.elink.core.bo.BaseBO;

/**
 * 投标标准
 * 
 * @author ZYZ
 * @version 1.0, Created on 2017年09月28日
 */
public class AppBidStandard extends BaseBO<AppBidStandard>{
	
	private static final long serialVersionUID = 216523102156L;
	
	private Date modifyTime;//修改时间
	
	private Long modifyUserId;//修改人ID
	
	private String standardName;//合作方式名称
	
	private String url;//图片路径
	
	private String type;//状态 1-启用 2-停用
	
	private String eName;//员工姓名

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getStandardName() {
		return standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

}
