package com.entity.view;

import com.entity.KaoshipingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("kaoshipingfen")
public class KaoshipingfenView  extends KaoshipingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshipingfenView(){
	}
 
 	public KaoshipingfenView(KaoshipingfenEntity kaoshipingfenEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshipingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
