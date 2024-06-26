package com.entity.view;

import com.entity.ZhuanyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专业类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("zhuanyeleixing")
public class ZhuanyeleixingView  extends ZhuanyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanyeleixingView(){
	}
 
 	public ZhuanyeleixingView(ZhuanyeleixingEntity zhuanyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
