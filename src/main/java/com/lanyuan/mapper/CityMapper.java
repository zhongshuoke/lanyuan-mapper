package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.City;
import com.lanyuan.entity.WxAccType;

public interface CityMapper extends BaseMapper<City>{
	
	public City isExist(int cityId);
    
	public City countCity(City city);
	
	public List<City> queryCityList(Map<String, Object> map);
}
