package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangjimimarenyuandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangjimimarenyuandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangjimimarenyuandengjiView;


/**
 * 忘记密码人员登记
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface WangjimimarenyuandengjiService extends IService<WangjimimarenyuandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangjimimarenyuandengjiVO> selectListVO(Wrapper<WangjimimarenyuandengjiEntity> wrapper);
   	
   	WangjimimarenyuandengjiVO selectVO(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
   	
   	List<WangjimimarenyuandengjiView> selectListView(Wrapper<WangjimimarenyuandengjiEntity> wrapper);
   	
   	WangjimimarenyuandengjiView selectView(@Param("ew") Wrapper<WangjimimarenyuandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangjimimarenyuandengjiEntity> wrapper);
   	
}

