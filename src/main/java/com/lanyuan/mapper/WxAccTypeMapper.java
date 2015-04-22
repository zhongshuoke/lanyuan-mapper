package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxAccType;

public interface WxAccTypeMapper extends BaseMapper<WxAccType>{
	
	public WxAccType querySingleType(String wxTypeSN);
	
	public WxAccType isExist(String wxTypeSN);
    
	public WxAccType countType(WxAccType wxAccType);
	
	public List<WxAccType> queryNoMatch(Map<String, Object> map);
	
	public WxAccType getWxAccTypeByArticleId(String id);
}
