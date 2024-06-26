package com.entity.vo;

import com.entity.ZhuanyeliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专业列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public class ZhuanyeliebiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业详情
	 */
	
	private String zhuanyexiangqing;
		
	/**
	 * 专业类型
	 */
	
	private String zhuanyeleixing;
				
	
	/**
	 * 设置：专业详情
	 */
	 
	public void setZhuanyexiangqing(String zhuanyexiangqing) {
		this.zhuanyexiangqing = zhuanyexiangqing;
	}
	
	/**
	 * 获取：专业详情
	 */
	public String getZhuanyexiangqing() {
		return zhuanyexiangqing;
	}
				
	
	/**
	 * 设置：专业类型
	 */
	 
	public void setZhuanyeleixing(String zhuanyeleixing) {
		this.zhuanyeleixing = zhuanyeleixing;
	}
	
	/**
	 * 获取：专业类型
	 */
	public String getZhuanyeleixing() {
		return zhuanyeleixing;
	}
			
}
