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


import com.dao.ZhunongshangpinDao;
import com.entity.ZhunongshangpinEntity;
import com.service.ZhunongshangpinService;
import com.entity.vo.ZhunongshangpinVO;
import com.entity.view.ZhunongshangpinView;

@Service("zhunongshangpinService")
public class ZhunongshangpinServiceImpl extends ServiceImpl<ZhunongshangpinDao, ZhunongshangpinEntity> implements ZhunongshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhunongshangpinEntity> page = this.selectPage(
                new Query<ZhunongshangpinEntity>(params).getPage(),
                new EntityWrapper<ZhunongshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhunongshangpinEntity> wrapper) {
		  Page<ZhunongshangpinView> page =new Query<ZhunongshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhunongshangpinVO> selectListVO(Wrapper<ZhunongshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhunongshangpinVO selectVO(Wrapper<ZhunongshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhunongshangpinView> selectListView(Wrapper<ZhunongshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhunongshangpinView selectView(Wrapper<ZhunongshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhunongshangpinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhunongshangpinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhunongshangpinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
