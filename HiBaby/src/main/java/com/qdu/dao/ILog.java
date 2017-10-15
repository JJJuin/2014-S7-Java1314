package com.qdu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qdu.pojo.UserLog;

public interface ILog {
	@Select("select * from user_log")
	public List<UserLog> getAll();
	
}