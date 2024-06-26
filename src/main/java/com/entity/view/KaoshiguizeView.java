package com.entity.view;

import com.entity.KaoshiguizeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试规则
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("kaoshiguize")
public class KaoshiguizeView  extends KaoshiguizeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshiguizeView(){
	}
 
 	public KaoshiguizeView(KaoshiguizeEntity kaoshiguizeEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshiguizeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
