package com.hengdu.elink.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengdu.elink.app.bo.AppBoundaryInfo;
import com.hengdu.elink.app.dao.AppBoundaryInfoDao;
import com.hengdu.elink.core.service.BaseService;
import com.hengdu.elink.sys.bo.Employee;

/**
 * 阈值设置
 * Description: 全局设置service
 *
 * All Rights Reserved.
 * 
 * @version 1.0 2017年8月11日 下午2:51:37 by zyz 创建
 */
@Service
public class AppBoundaryInfoService extends BaseService<AppBoundaryInfo> {
	@Autowired
	protected AppBoundaryInfoDao appBoundaryInfoDao;
	

	//查找所有阈值设置
	public List<AppBoundaryInfo> findAllAppBoundaryInfoList() {
		return appBoundaryInfoDao.findAllAppBoundaryInfoList();
	};
	
	//查找最新修改时间和修改人信息
	public	AppBoundaryInfo findAppBoundaryInfoByLatestTime(){
		return appBoundaryInfoDao.findAppBoundaryInfoByLatestTime();
	};

	//修改七日年化
	public int updateAppBoundaryInfo(AppBoundaryInfo appBoundaryInfo,Employee employee){
		appBoundaryInfo.setModifyUserId(employee.getId());
		//appBoundaryInfo.setModifyUserId(6L);
		Date date = new Date();
		appBoundaryInfo.setModifyTime(date);
		int i = appBoundaryInfoDao.updateAppBoundaryInfo(appBoundaryInfo);
		if(i==0){
			return 0;
		}else{
			return 1;
		}
	};
	
	//根据type查找阈值设置
	public	AppBoundaryInfo findAppBoundaryInfoByType(String type){
		return appBoundaryInfoDao.findAppBoundaryInfoByType(type);
	};
		
}
