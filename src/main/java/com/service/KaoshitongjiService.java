package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshitongjiView;


/**
 * 考试统计
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshitongjiService extends IService<KaoshitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshitongjiVO> selectListVO(Wrapper<KaoshitongjiEntity> wrapper);
   	
   	KaoshitongjiVO selectVO(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
   	
   	List<KaoshitongjiView> selectListView(Wrapper<KaoshitongjiEntity> wrapper);
   	
   	KaoshitongjiView selectView(@Param("ew") Wrapper<KaoshitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshitongjiEntity> wrapper);
   	
}

