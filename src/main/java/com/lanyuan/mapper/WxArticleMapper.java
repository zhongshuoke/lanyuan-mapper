package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxArticle;

public interface WxArticleMapper extends BaseMapper<WxArticle>{
	public WxArticle querySingleArticle(String title);
	public WxArticle isExist(String title);
	/**
	 * 验证用户登陆
	 * @author caokun
	 * date：2015-1-25
	 * @param WxArticle wxArticle
	 * @return
	 */
	public WxArticle countArticle(WxArticle wxArticle);
	
	/**
	 * 推荐文章
	 * @param id
	 */
	public void recomm(String id);
	
	public List<WxArticle> queryNoMatch(Map<String, Object> map);
	
	/**
	 * 查询更多微信文章（无类别参数class_id）。
	 * @param map
	 * @return
	 */
	public List<WxArticle> queryMoreWxArticleNoClassId(Map<String, Object> map);
	
	/**
	 * 查询更多微信文章（有类别参数class_id）。
	 * @param map
	 * @return
	 */
	public List<WxArticle> queryMoreWxArticleByClassId(Map<String, Object> map);
	
	public List<WxArticle> queryRelatedArticleList(Map<String, Object> map);
	
	public List<WxArticle> queryMoreRecommendArticleList(Map<String, Object> map);
}
