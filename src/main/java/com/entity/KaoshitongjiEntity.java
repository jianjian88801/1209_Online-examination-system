package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考试统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@TableName("kaoshitongji")
public class KaoshitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshitongjiEntity() {
		
	}
	
	public KaoshitongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 科目
	 */
					
	private String kemu;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：科目
	 */
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
	}
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
