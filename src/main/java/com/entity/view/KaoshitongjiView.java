package com.entity.view;

import com.entity.KaoshitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("kaoshitongji")
public class KaoshitongjiView  extends KaoshitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshitongjiView(){
	}
 
 	public KaoshitongjiView(KaoshitongjiEntity kaoshitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
