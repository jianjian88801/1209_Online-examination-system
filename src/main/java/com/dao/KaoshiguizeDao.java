package com.dao;

import com.entity.KaoshiguizeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshiguizeVO;
import com.entity.view.KaoshiguizeView;


/**
 * 考试规则
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshiguizeDao extends BaseMapper<KaoshiguizeEntity> {
	
	List<KaoshiguizeVO> selectListVO(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
	
	KaoshiguizeVO selectVO(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
	
	List<KaoshiguizeView> selectListView(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);

	List<KaoshiguizeView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
	
	KaoshiguizeView selectView(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
	
}
