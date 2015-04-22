package com.lanyuan.mapper;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.Advertisement;

public interface AdvertisementMapper extends BaseMapper<Advertisement>{
	public int count(Advertisement advertisement);
	
	public Advertisement isExist(int Id); 
}
