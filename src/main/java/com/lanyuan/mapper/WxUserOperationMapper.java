package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxUserOperation;

public interface WxUserOperationMapper extends BaseMapper<WxUserOperation>{
	public List<WxUserOperation> queryWxUserOperationList(Map<String, Object> map);
}
