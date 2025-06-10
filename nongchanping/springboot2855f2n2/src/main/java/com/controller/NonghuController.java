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

import com.entity.NonghuEntity;
import com.entity.view.NonghuView;

import com.service.NonghuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 农商
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
@RestController
@RequestMapping("/nonghu")
public class NonghuController {
    @Autowired
    private NonghuService nonghuService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		NonghuEntity u = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"nonghu",  "农户" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody NonghuEntity nonghu){
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity u = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		nonghu.setId(uId);
        nonghuService.insert(nonghu);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        NonghuEntity u = nonghuService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	NonghuEntity u = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        nonghuService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NonghuEntity nonghu,
		HttpServletRequest request){
        EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();

		PageUtils page = nonghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nonghu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NonghuEntity nonghu, 
		HttpServletRequest request){
        EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();

		PageUtils page = nonghuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nonghu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NonghuEntity nonghu){
       	EntityWrapper<NonghuEntity> ew = new EntityWrapper<NonghuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nonghu, "nonghu")); 
        return R.ok().put("data", nonghuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NonghuEntity nonghu){
        EntityWrapper< NonghuEntity> ew = new EntityWrapper< NonghuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nonghu, "nonghu")); 
		NonghuView nonghuView =  nonghuService.selectView(ew);
		return R.ok("查询农商成功").put("data", nonghuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NonghuEntity nonghu = nonghuService.selectById(id);
        return R.ok().put("data", nonghu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NonghuEntity nonghu = nonghuService.selectById(id);
        return R.ok().put("data", nonghu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
        if(nonghuService.selectCount(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()))>0) {
            return R.error("农户账号已存在");
        }
    	nonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity u = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nonghu.setId(new Date().getTime());
        nonghuService.insert(nonghu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
        if(nonghuService.selectCount(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()))>0) {
            return R.error("农户账号已存在");
        }
    	nonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nonghu);
    	NonghuEntity u = nonghuService.selectOne(new EntityWrapper<NonghuEntity>().eq("nonghuzhanghao", nonghu.getNonghuzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nonghu.setId(new Date().getTime());
        nonghuService.insert(nonghu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NonghuEntity nonghu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nonghu);
        if(nonghuService.selectCount(new EntityWrapper<NonghuEntity>().ne("id", nonghu.getId()).eq("nonghuzhanghao", nonghu.getNonghuzhanghao()))>0) {
            return R.error("农户账号已存在");
        }
        nonghuService.updateById(nonghu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nonghuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
