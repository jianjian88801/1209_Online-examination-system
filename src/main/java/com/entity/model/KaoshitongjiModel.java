package com.entity.model;

import com.entity.KaoshitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 考试统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public class KaoshitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 试卷
	 */
	
	private String shijuan;
		
	/**
	 * 题目
	 */
	
	private String timu;
		
	/**
	 * 考试通过率
	 */
	
	private String kaoshitongguolv;
		
	/**
	 * 考试科目次数
	 */
	
	private String kaoshikemucishu;
				
	
	/**
	 * 设置：试卷
	 */
	 
	public void setShijuan(String shijuan) {
		this.shijuan = shijuan;
	}
	
	/**
	 * 获取：试卷
	 */
	public String getShijuan() {
		return shijuan;
	}
				
	
	/**
	 * 设置：题目
	 */
	 
	public void setTimu(String timu) {
		this.timu = timu;
	}
	
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
				
	
	/**
	 * 设置：考试通过率
	 */
	 
	public void setKaoshitongguolv(String kaoshitongguolv) {
		this.kaoshitongguolv = kaoshitongguolv;
	}
	
	/**
	 * 获取：考试通过率
	 */
	public String getKaoshitongguolv() {
		return kaoshitongguolv;
	}
				
	
	/**
	 * 设置：考试科目次数
	 */
	 
	public void setKaoshikemucishu(String kaoshikemucishu) {
		this.kaoshikemucishu = kaoshikemucishu;
	}
	
	/**
	 * 获取：考试科目次数
	 */
	public String getKaoshikemucishu() {
		return kaoshikemucishu;
	}
			
}
