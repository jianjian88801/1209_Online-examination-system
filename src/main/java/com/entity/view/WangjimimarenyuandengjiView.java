package com.entity.view;

import com.entity.WangjimimarenyuandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 忘记密码人员登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("wangjimimarenyuandengji")
public class WangjimimarenyuandengjiView  extends WangjimimarenyuandengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WangjimimarenyuandengjiView(){
	}
 
 	public WangjimimarenyuandengjiView(WangjimimarenyuandengjiEntity wangjimimarenyuandengjiEntity){
 	try {
			BeanUtils.copyProperties(this, wangjimimarenyuandengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
