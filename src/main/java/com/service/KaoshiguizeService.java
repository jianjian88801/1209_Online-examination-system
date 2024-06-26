package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshiguizeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshiguizeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshiguizeView;


/**
 * 考试规则
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshiguizeService extends IService<KaoshiguizeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshiguizeVO> selectListVO(Wrapper<KaoshiguizeEntity> wrapper);
   	
   	KaoshiguizeVO selectVO(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
   	
   	List<KaoshiguizeView> selectListView(Wrapper<KaoshiguizeEntity> wrapper);
   	
   	KaoshiguizeView selectView(@Param("ew") Wrapper<KaoshiguizeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshiguizeEntity> wrapper);
   	
}

