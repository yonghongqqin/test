package com.hengdu.elink.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hengdu.elink.app.bo.AppBidStandard;
import com.hengdu.elink.core.dao.BaseDao;

/**
 *  投标标准
 * @author Zyz
 * @version 1.0 created on 2017年10月11日
 */
@Repository
public interface AppBidStandardDao extends BaseDao<AppBidStandard> {

	//查询平台保障图标（分页）
	List<AppBidStandard> findAppBidStandardListByPage(AppBidStandard appBidStandard);
	
	//修改平台保障图标
	int updateAppBidStandard(AppBidStandard appBidStandard);
	
	//查找最新修改时间和修改人信息
	AppBidStandard findAppBidStandardByLatestTime();
	
	//修改状态
	void updateType();
	
	//根据ID查找投标标准
	AppBidStandard findAppBidStandardById(Long id);
}
