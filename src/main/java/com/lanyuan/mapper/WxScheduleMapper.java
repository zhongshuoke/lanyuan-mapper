package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxSchedule;

public interface WxScheduleMapper extends BaseMapper<WxSchedule>{
	
	public WxSchedule querySingleSchedule(String hour);
	
	public WxSchedule isExist(String hour);
    
	public WxSchedule countSchedule(WxSchedule wxSchedule);
	
	public List<WxSchedule> queryNoMatch(Map<String, Object> map);
}
