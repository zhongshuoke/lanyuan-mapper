package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxArticleApply;

public interface WxArticleApplyMapper extends BaseMapper<WxArticleApply>{
	public List<WxArticleApply> queryWxArticleApplyList(Map<String, Object> map);
}
