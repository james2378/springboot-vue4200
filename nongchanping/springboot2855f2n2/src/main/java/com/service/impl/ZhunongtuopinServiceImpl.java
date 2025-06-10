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


import com.dao.ZhunongtuopinDao;
import com.entity.ZhunongtuopinEntity;
import com.service.ZhunongtuopinService;
import com.entity.vo.ZhunongtuopinVO;
import com.entity.view.ZhunongtuopinView;

@Service("zhunongtuopinService")
public class ZhunongtuopinServiceImpl extends ServiceImpl<ZhunongtuopinDao, ZhunongtuopinEntity> implements ZhunongtuopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhunongtuopinEntity> page = this.selectPage(
                new Query<ZhunongtuopinEntity>(params).getPage(),
                new EntityWrapper<ZhunongtuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhunongtuopinEntity> wrapper) {
		  Page<ZhunongtuopinView> page =new Query<ZhunongtuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhunongtuopinVO> selectListVO(Wrapper<ZhunongtuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhunongtuopinVO selectVO(Wrapper<ZhunongtuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhunongtuopinView> selectListView(Wrapper<ZhunongtuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhunongtuopinView selectView(Wrapper<ZhunongtuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhunongtuopinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhunongtuopinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhunongtuopinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
