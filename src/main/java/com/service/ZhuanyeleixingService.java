package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyeleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyeleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyeleixingView;


/**
 * 专业类型
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface ZhuanyeleixingService extends IService<ZhuanyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyeleixingVO> selectListVO(Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	ZhuanyeleixingVO selectVO(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	List<ZhuanyeleixingView> selectListView(Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	ZhuanyeleixingView selectView(@Param("ew") Wrapper<ZhuanyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyeleixingEntity> wrapper);
   	
}

