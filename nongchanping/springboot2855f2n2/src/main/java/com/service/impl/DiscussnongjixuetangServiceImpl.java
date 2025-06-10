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


import com.dao.DiscussnongjixuetangDao;
import com.entity.DiscussnongjixuetangEntity;
import com.service.DiscussnongjixuetangService;
import com.entity.vo.DiscussnongjixuetangVO;
import com.entity.view.DiscussnongjixuetangView;

@Service("discussnongjixuetangService")
public class DiscussnongjixuetangServiceImpl extends ServiceImpl<DiscussnongjixuetangDao, DiscussnongjixuetangEntity> implements DiscussnongjixuetangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongjixuetangEntity> page = this.selectPage(
                new Query<DiscussnongjixuetangEntity>(params).getPage(),
                new EntityWrapper<DiscussnongjixuetangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongjixuetangEntity> wrapper) {
		  Page<DiscussnongjixuetangView> page =new Query<DiscussnongjixuetangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussnongjixuetangVO> selectListVO(Wrapper<DiscussnongjixuetangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongjixuetangVO selectVO(Wrapper<DiscussnongjixuetangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongjixuetangView> selectListView(Wrapper<DiscussnongjixuetangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongjixuetangView selectView(Wrapper<DiscussnongjixuetangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
