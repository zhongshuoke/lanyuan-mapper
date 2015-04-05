package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxArticle;
import com.lanyuan.entity.WxRecommendToday;

public interface WxRecommendTodayMapper extends BaseMapper<WxRecommendToday>{
	public WxRecommendToday querySingleRecommArticle(int id);
	public WxRecommendToday isExist(int id);
	/**
	 * 验证用户登陆
	 * @author caokun
	 * date：2015-1-25
	 * @param WxRecommendToday wxRecommendToday
	 * @return
	 */
	public WxRecommendToday countRecommArticle(WxRecommendToday wxRecommendToday);
	
	public List<WxRecommendToday> queryNoMatch(Map<String, Object> map);
	
	/**
	 * 查询更多推荐微信文章（无类别参数class_id）。
	 * @param map
	 * @return
	 */
	public List<WxRecommendToday> queryMoreRecommArticleNoClassId(Map<String, Object> map);
	
	/**
	 * 查询更多推荐微信文章（有类别参数class_id）。
	 * @param map
	 * @return
	 */
	public List<WxRecommendToday> queryMoreRecommArticleByClassId(Map<String, Object> map);
}
