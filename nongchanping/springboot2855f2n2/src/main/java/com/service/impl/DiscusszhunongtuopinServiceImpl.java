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


import com.dao.DiscusszhunongtuopinDao;
import com.entity.DiscusszhunongtuopinEntity;
import com.service.DiscusszhunongtuopinService;
import com.entity.vo.DiscusszhunongtuopinVO;
import com.entity.view.DiscusszhunongtuopinView;

@Service("discusszhunongtuopinService")
public class DiscusszhunongtuopinServiceImpl extends ServiceImpl<DiscusszhunongtuopinDao, DiscusszhunongtuopinEntity> implements DiscusszhunongtuopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhunongtuopinEntity> page = this.selectPage(
                new Query<DiscusszhunongtuopinEntity>(params).getPage(),
                new EntityWrapper<DiscusszhunongtuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhunongtuopinEntity> wrapper) {
		  Page<DiscusszhunongtuopinView> page =new Query<DiscusszhunongtuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusszhunongtuopinVO> selectListVO(Wrapper<DiscusszhunongtuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhunongtuopinVO selectVO(Wrapper<DiscusszhunongtuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhunongtuopinView> selectListView(Wrapper<DiscusszhunongtuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhunongtuopinView selectView(Wrapper<DiscusszhunongtuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
