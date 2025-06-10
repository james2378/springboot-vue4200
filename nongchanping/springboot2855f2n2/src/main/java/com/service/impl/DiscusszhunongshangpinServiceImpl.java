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


import com.dao.DiscusszhunongshangpinDao;
import com.entity.DiscusszhunongshangpinEntity;
import com.service.DiscusszhunongshangpinService;
import com.entity.vo.DiscusszhunongshangpinVO;
import com.entity.view.DiscusszhunongshangpinView;

@Service("discusszhunongshangpinService")
public class DiscusszhunongshangpinServiceImpl extends ServiceImpl<DiscusszhunongshangpinDao, DiscusszhunongshangpinEntity> implements DiscusszhunongshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhunongshangpinEntity> page = this.selectPage(
                new Query<DiscusszhunongshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusszhunongshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhunongshangpinEntity> wrapper) {
		  Page<DiscusszhunongshangpinView> page =new Query<DiscusszhunongshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusszhunongshangpinVO> selectListVO(Wrapper<DiscusszhunongshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhunongshangpinVO selectVO(Wrapper<DiscusszhunongshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhunongshangpinView> selectListView(Wrapper<DiscusszhunongshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhunongshangpinView selectView(Wrapper<DiscusszhunongshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
