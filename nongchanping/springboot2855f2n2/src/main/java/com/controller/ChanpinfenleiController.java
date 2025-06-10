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

import com.entity.ChanpinfenleiEntity;
import com.entity.view.ChanpinfenleiView;

import com.service.ChanpinfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 产品分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
@RestController
@RequestMapping("/chanpinfenlei")
public class ChanpinfenleiController {
    @Autowired
    private ChanpinfenleiService chanpinfenleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChanpinfenleiEntity chanpinfenlei,
		HttpServletRequest request){
        EntityWrapper<ChanpinfenleiEntity> ew = new EntityWrapper<ChanpinfenleiEntity>();

		PageUtils page = chanpinfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpinfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChanpinfenleiEntity chanpinfenlei, 
		HttpServletRequest request){
        EntityWrapper<ChanpinfenleiEntity> ew = new EntityWrapper<ChanpinfenleiEntity>();

		PageUtils page = chanpinfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpinfenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChanpinfenleiEntity chanpinfenlei){
       	EntityWrapper<ChanpinfenleiEntity> ew = new EntityWrapper<ChanpinfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chanpinfenlei, "chanpinfenlei")); 
        return R.ok().put("data", chanpinfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChanpinfenleiEntity chanpinfenlei){
        EntityWrapper< ChanpinfenleiEntity> ew = new EntityWrapper< ChanpinfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chanpinfenlei, "chanpinfenlei")); 
		ChanpinfenleiView chanpinfenleiView =  chanpinfenleiService.selectView(ew);
		return R.ok("查询产品分类成功").put("data", chanpinfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChanpinfenleiEntity chanpinfenlei = chanpinfenleiService.selectById(id);
        return R.ok().put("data", chanpinfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChanpinfenleiEntity chanpinfenlei = chanpinfenleiService.selectById(id);
        return R.ok().put("data", chanpinfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChanpinfenleiEntity chanpinfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chanpinfenlei);
        chanpinfenleiService.insert(chanpinfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChanpinfenleiEntity chanpinfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chanpinfenlei);
        chanpinfenleiService.insert(chanpinfenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChanpinfenleiEntity chanpinfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chanpinfenlei);
        chanpinfenleiService.updateById(chanpinfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chanpinfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
