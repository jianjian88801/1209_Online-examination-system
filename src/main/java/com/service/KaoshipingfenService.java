package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshipingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshipingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshipingfenView;


/**
 * 考试评分
 *
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
public interface KaoshipingfenService extends IService<KaoshipingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshipingfenVO> selectListVO(Wrapper<KaoshipingfenEntity> wrapper);
   	
   	KaoshipingfenVO selectVO(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
   	
   	List<KaoshipingfenView> selectListView(Wrapper<KaoshipingfenEntity> wrapper);
   	
   	KaoshipingfenView selectView(@Param("ew") Wrapper<KaoshipingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshipingfenEntity> wrapper);
   	
}

