package com.dao;

import com.entity.KaoshipingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshipingfenVO;
import com.entity.view.KaoshipingfenView;


/**
 * 考试评分
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshipingfenDao extends BaseMapper<KaoshipingfenEntity> {
	
	List<KaoshipingfenVO> selectListVO(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
	
	KaoshipingfenVO selectVO(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
	
	List<KaoshipingfenView> selectListView(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);

	List<KaoshipingfenView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
	
	KaoshipingfenView selectView(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
	
}
