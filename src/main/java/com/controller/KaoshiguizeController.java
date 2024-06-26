package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KaoshiguizeEntity;
import com.entity.view.KaoshiguizeView;

import com.service.KaoshiguizeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 考试规则
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@RestController
@RequestMapping("/kaoshiguize")
public class KaoshiguizeController {
    @Autowired
    private KaoshiguizeService kaoshiguizeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoshiguizeEntity kaoshiguize,
		HttpServletRequest request){
        EntityWrapper<KaoshiguizeEntity> ew = new EntityWrapper<KaoshiguizeEntity>();
		PageUtils page = kaoshiguizeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshiguize), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoshiguizeEntity kaoshiguize, 
		HttpServletRequest request){
        EntityWrapper<KaoshiguizeEntity> ew = new EntityWrapper<KaoshiguizeEntity>();
		PageUtils page = kaoshiguizeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshiguize), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoshiguizeEntity kaoshiguize){
       	EntityWrapper<KaoshiguizeEntity> ew = new EntityWrapper<KaoshiguizeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoshiguize, "kaoshiguize")); 
        return R.ok().put("data", kaoshiguizeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshiguizeEntity kaoshiguize){
        EntityWrapper< KaoshiguizeEntity> ew = new EntityWrapper< KaoshiguizeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoshiguize, "kaoshiguize")); 
		KaoshiguizeView kaoshiguizeView =  kaoshiguizeService.selectView(ew);
		return R.ok("查询考试规则成功").put("data", kaoshiguizeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoshiguizeEntity kaoshiguize = kaoshiguizeService.selectById(id);
        return R.ok().put("data", kaoshiguize);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoshiguizeEntity kaoshiguize = kaoshiguizeService.selectById(id);
        return R.ok().put("data", kaoshiguize);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshiguizeEntity kaoshiguize, HttpServletRequest request){
    	kaoshiguize.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshiguize);
        kaoshiguizeService.insert(kaoshiguize);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshiguizeEntity kaoshiguize, HttpServletRequest request){
    	kaoshiguize.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshiguize);
        kaoshiguizeService.insert(kaoshiguize);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaoshiguizeEntity kaoshiguize, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoshiguize);
        kaoshiguizeService.updateById(kaoshiguize);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoshiguizeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KaoshiguizeEntity> wrapper = new EntityWrapper<KaoshiguizeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kaoshiguizeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
