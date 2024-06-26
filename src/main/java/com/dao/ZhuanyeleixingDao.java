package com.dao;

import com.entity.ZhuanyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyeleixingVO;
import com.entity.view.ZhuanyeleixingView;


/**
 * 专业类型
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface ZhuanyeleixingDao extends BaseMapper<ZhuanyeleixingEntity> {
	
	List<ZhuanyeleixingVO> selectListVO(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	
	ZhuanyeleixingVO selectVO(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	
	List<ZhuanyeleixingView> selectListView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);

	List<ZhuanyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	
	ZhuanyeleixingView selectView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
	
}
