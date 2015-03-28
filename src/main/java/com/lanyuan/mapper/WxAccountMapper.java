package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxAccount;

public interface WxAccountMapper extends BaseMapper<WxAccount>{
	public WxAccount querySingleAccount(String wxAccountName);
	public WxAccount isExist(String wxAccountName);
	/**
	 * 验证用户登陆
	 * @author lanyuan
	 * Email：mmm333zzz520@163.com
	 * date：2014-2-25
	 * @param Account account
	 * @return
	 */
	public WxAccount countAccount(WxAccount account);
	
	public void addwxinfo(WxAccount wxAccount);
	
	public List<WxAccount> queryNoMatch(Map<String, Object> map);
}
