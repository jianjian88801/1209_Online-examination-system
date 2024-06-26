package com.dao;

import com.entity.WangjimimarenyuandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangjimimarenyuandengjiVO;
import com.entity.view.WangjimimarenyuandengjiView;


/**
 * 忘记密码人员登记
 * 
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface WangjimimarenyuandengjiDao extends BaseMapper<WangjimimarenyuandengjiEntity> {
	
	List<WangjimimarenyuandengjiVO> selectListVO(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
	
	WangjimimarenyuandengjiVO selectVO(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
	
	List<WangjimimarenyuandengjiView> selectListView(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);

	List<WangjimimarenyuandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
	
	WangjimimarenyuandengjiView selectView(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
	
}
