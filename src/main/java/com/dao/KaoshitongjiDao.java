package com.dao;

import com.entity.KaoshitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshitongjiVO;
import com.entity.view.KaoshitongjiView;


/**
 * 考试统计
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshitongjiDao extends BaseMapper<KaoshitongjiEntity> {
	
	List<KaoshitongjiVO> selectListVO(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
	
	KaoshitongjiVO selectVO(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
	
	List<KaoshitongjiView> selectListView(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);

	List<KaoshitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
	
	KaoshitongjiView selectView(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
	
}
