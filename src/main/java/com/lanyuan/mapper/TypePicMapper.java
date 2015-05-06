package com.lanyuan.mapper;


import java.util.List;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.TypePic;

public interface TypePicMapper extends BaseMapper<TypePic>{
	
	public List<TypePic> queryAll(TypePic typePic);
	
	public TypePic queryById(String Id);
	
	public void update(TypePic typePic);
}
