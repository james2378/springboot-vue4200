package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NongjixuetangDao;
import com.entity.NongjixuetangEntity;
import com.service.NongjixuetangService;
import com.entity.vo.NongjixuetangVO;
import com.entity.view.NongjixuetangView;

@Service("nongjixuetangService")
public class NongjixuetangServiceImpl extends ServiceImpl<NongjixuetangDao, NongjixuetangEntity> implements NongjixuetangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjixuetangEntity> page = this.selectPage(
                new Query<NongjixuetangEntity>(params).getPage(),
                new EntityWrapper<NongjixuetangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjixuetangEntity> wrapper) {
		  Page<NongjixuetangView> page =new Query<NongjixuetangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<NongjixuetangVO> selectListVO(Wrapper<NongjixuetangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjixuetangVO selectVO(Wrapper<NongjixuetangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjixuetangView> selectListView(Wrapper<NongjixuetangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjixuetangView selectView(Wrapper<NongjixuetangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<NongjixuetangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<NongjixuetangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<NongjixuetangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
