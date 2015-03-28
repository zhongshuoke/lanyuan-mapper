package com.lanyuan.mapper;

import java.util.List;
import java.util.Map;

import com.lanyuan.base.BaseMapper;
import com.lanyuan.entity.WxTask;

public interface WxTaskMapper extends BaseMapper<WxTask>{
	
	public WxTask querySingleTask(String name);
	
	public WxTask isExist(int crontab_id);
    
	public WxTask countTask(WxTask wxTask);
	
	public List<WxTask> queryNoMatch(Map<String, Object> map);
	
	public void updateTasks();
}
