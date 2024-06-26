package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyeliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyeliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyeliebiaoView;


/**
 * 专业列表
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface ZhuanyeliebiaoService extends IService<ZhuanyeliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyeliebiaoVO> selectListVO(Wrapper<ZhuanyeliebiaoEntity> wrapper);
   	
   	ZhuanyeliebiaoVO selectVO(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
   	
   	List<ZhuanyeliebiaoView> selectListView(Wrapper<ZhuanyeliebiaoEntity> wrapper);
   	
   	ZhuanyeliebiaoView selectView(@Param("ew") Wrapper<ZhuanyeliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyeliebiaoEntity> wrapper);
   	
}

