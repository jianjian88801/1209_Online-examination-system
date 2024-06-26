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

import com.entity.KaoshipingfenEntity;
import com.entity.view.KaoshipingfenView;

import com.service.KaoshipingfenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 考试评分
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 21:58:38
 */
@RestController
@RequestMapping("/kaoshipingfen")
public class KaoshipingfenController {
    @Autowired
    private KaoshipingfenService kaoshipingfenService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoshipingfenEntity kaoshipingfen,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kaoshipingfen.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaoshipingfenEntity> ew = new EntityWrapper<KaoshipingfenEntity>();
		PageUtils page = kaoshipingfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshipingfen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoshipingfenEntity kaoshipingfen, 
		HttpServletRequest request){
        EntityWrapper<KaoshipingfenEntity> ew = new EntityWrapper<KaoshipingfenEntity>();
		PageUtils page = kaoshipingfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshipingfen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoshipingfenEntity kaoshipingfen){
       	EntityWrapper<KaoshipingfenEntity> ew = new EntityWrapper<KaoshipingfenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoshipingfen, "kaoshipingfen")); 
        return R.ok().put("data", kaoshipingfenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshipingfenEntity kaoshipingfen){
        EntityWrapper< KaoshipingfenEntity> ew = new EntityWrapper< KaoshipingfenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoshipingfen, "kaoshipingfen")); 
		KaoshipingfenView kaoshipingfenView =  kaoshipingfenService.selectView(ew);
		return R.ok("查询考试评分成功").put("data", kaoshipingfenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoshipingfenEntity kaoshipingfen = kaoshipingfenService.selectById(id);
        return R.ok().put("data", kaoshipingfen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoshipingfenEntity kaoshipingfen = kaoshipingfenService.selectById(id);
        return R.ok().put("data", kaoshipingfen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshipingfenEntity kaoshipingfen, HttpServletRequest request){
    	kaoshipingfen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshipingfen);
        kaoshipingfenService.insert(kaoshipingfen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshipingfenEntity kaoshipingfen, HttpServletRequest request){
    	kaoshipingfen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshipingfen);
        kaoshipingfenService.insert(kaoshipingfen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaoshipingfenEntity kaoshipingfen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoshipingfen);
        kaoshipingfenService.updateById(kaoshipingfen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoshipingfenService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<KaoshipingfenEntity> wrapper = new EntityWrapper<KaoshipingfenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = kaoshipingfenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
