package com.hengdu.elink.app.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hengdu.elink.app.bo.AppBidStandard;
import com.hengdu.elink.app.bo.AppPlatformIcon;
import com.hengdu.elink.app.service.AppBidStandardService;
import com.hengdu.elink.common.constants.Constants;
import com.hengdu.elink.common.utils.pageutil.Page;
import com.hengdu.elink.core.web.controller.BaseController;
import com.hengdu.elink.sys.bo.Employee;
import com.hengdu.elink.sys.shiro.SessionUser;

/**
 * Description:  投标标准
 *
 * All Rights Reserved.
 * 
 * @version 1.0 2017年10月11日 by ZYZ 创建
 */
@RestController
@RequestMapping(value = "/appBidStandard")
public class AppBidStandardController extends BaseController {

	@Autowired
	protected AppBidStandardService appBidStandardService;
	
	
	/**
	 * 	添加投标标准
	 * 
	 * @return List<AppBoundaryInfo>
	 */
	@CrossOrigin()
	@RequestMapping(value = "/insertAppBidStandard", method = RequestMethod.POST)
	public int insertAppBidStandard(HttpServletRequest request,AppBidStandard appBidStandard) {
		//TODO
		Employee employee = new Employee();
		employee.setId(6L);
		int i  = appBidStandardService.insertAppBidStandard(request,appBidStandard,employee);
		return i;
	}
	
	@CrossOrigin()
	//按分页查询投标标准（分页）
	@RequestMapping(value = "/findAppBidStandardListByPage", method = RequestMethod.GET)
	public AppBidStandard findAppAppBidStandardListByPage(AppBidStandard appBidStandard,Integer curPage) {
		Page<AppBidStandard> b = appBidStandard.getPage();
		b.setCurPage(curPage);
		appBidStandard.setPage(b);
		List<AppBidStandard> appBidStandardList = appBidStandardService.findAppBidStandardListByPage(appBidStandard);
		appBidStandard.setList(appBidStandardList);
		return appBidStandard;
	}
	
	@CrossOrigin()
	//修改投标标准
	@RequestMapping(value = "/updateAppBidStandard", method = RequestMethod.POST)
	public int updateAppBidStandard(HttpServletRequest request,AppBidStandard appBidStandard) {
	//TODO
		Employee employee = new Employee();
		employee.setId(6L);
		int i  = appBidStandardService.updateAppBidStandard(request,appBidStandard,employee);
		return i;
	}
	
	//根据ID查找投标标准
	@CrossOrigin()
	@RequestMapping(value = "/findAppBidStandardById", method = RequestMethod.GET)
	public AppBidStandard findAppBidStandardById(Long id){
		AppBidStandard appBidStandard = appBidStandardService.findAppBidStandardById(id);
		 return appBidStandard;
	};
}
