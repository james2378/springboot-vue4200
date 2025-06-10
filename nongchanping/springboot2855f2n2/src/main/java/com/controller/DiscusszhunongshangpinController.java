package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusszhunongshangpinEntity;
import com.entity.view.DiscusszhunongshangpinView;

import com.service.DiscusszhunongshangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 产品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
@RestController
@RequestMapping("/discusszhunongshangpin")
public class DiscusszhunongshangpinController {
    @Autowired
    private DiscusszhunongshangpinService discusszhunongshangpinService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusszhunongshangpinEntity discusszhunongshangpin,
		HttpServletRequest request){
        EntityWrapper<DiscusszhunongshangpinEntity> ew = new EntityWrapper<DiscusszhunongshangpinEntity>();

		PageUtils page = discusszhunongshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhunongshangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusszhunongshangpinEntity discusszhunongshangpin, 
		HttpServletRequest request){
        EntityWrapper<DiscusszhunongshangpinEntity> ew = new EntityWrapper<DiscusszhunongshangpinEntity>();

		PageUtils page = discusszhunongshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhunongshangpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusszhunongshangpinEntity discusszhunongshangpin){
       	EntityWrapper<DiscusszhunongshangpinEntity> ew = new EntityWrapper<DiscusszhunongshangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusszhunongshangpin, "discusszhunongshangpin")); 
        return R.ok().put("data", discusszhunongshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusszhunongshangpinEntity discusszhunongshangpin){
        EntityWrapper< DiscusszhunongshangpinEntity> ew = new EntityWrapper< DiscusszhunongshangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusszhunongshangpin, "discusszhunongshangpin")); 
		DiscusszhunongshangpinView discusszhunongshangpinView =  discusszhunongshangpinService.selectView(ew);
		return R.ok("查询产品评论表成功").put("data", discusszhunongshangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusszhunongshangpinEntity discusszhunongshangpin = discusszhunongshangpinService.selectById(id);
        return R.ok().put("data", discusszhunongshangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusszhunongshangpinEntity discusszhunongshangpin = discusszhunongshangpinService.selectById(id);
        return R.ok().put("data", discusszhunongshangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusszhunongshangpinEntity discusszhunongshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusszhunongshangpin);
        discusszhunongshangpinService.insert(discusszhunongshangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusszhunongshangpinEntity discusszhunongshangpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusszhunongshangpin);
        discusszhunongshangpinService.insert(discusszhunongshangpin);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscusszhunongshangpinEntity discusszhunongshangpin = discusszhunongshangpinService.selectOne(new EntityWrapper<DiscusszhunongshangpinEntity>().eq("", username));
        return R.ok().put("data", discusszhunongshangpin);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusszhunongshangpinEntity discusszhunongshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusszhunongshangpin);
        discusszhunongshangpinService.updateById(discusszhunongshangpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusszhunongshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusszhunongshangpinEntity discusszhunongshangpin, HttpServletRequest request,String pre){
        EntityWrapper<DiscusszhunongshangpinEntity> ew = new EntityWrapper<DiscusszhunongshangpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusszhunongshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhunongshangpin), params), params));
        return R.ok().put("data", page);
    }










}
