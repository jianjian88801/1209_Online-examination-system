package com.dao;

import com.entity.ExamquestionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ExamquestionVO;
import com.entity.view.ExamquestionView;


/**
 * 试题表
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface ExamquestionDao extends BaseMapper<ExamquestionEntity> {
	
	List<ExamquestionVO> selectListVO(@Param("ew") Wrapper<ExamquestionEntity> wrapper);
	
	ExamquestionVO selectVO(@Param("ew") Wrapper<ExamquestionEntity> wrapper);
	
	List<ExamquestionView> selectListView(@Param("ew") Wrapper<ExamquestionEntity> wrapper);

	List<ExamquestionView> selectListView(Pagination page,@Param("ew") Wrapper<ExamquestionEntity> wrapper);
	
	ExamquestionView selectView(@Param("ew") Wrapper<ExamquestionEntity> wrapper);
	
}
