package com.dao;

import com.entity.ZhuanyeliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyeliebiaoVO;
import com.entity.view.ZhuanyeliebiaoView;


/**
 * 专业列表
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface ZhuanyeliebiaoDao extends BaseMapper<ZhuanyeliebiaoEntity> {
	
	List<ZhuanyeliebiaoVO> selectListVO(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
	
	ZhuanyeliebiaoVO selectVO(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
	
	List<ZhuanyeliebiaoView> selectListView(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);

	List<ZhuanyeliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
	
	ZhuanyeliebiaoView selectView(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
	
}
