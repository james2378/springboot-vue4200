package com.dao;

import com.entity.DiscusszhunongshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhunongshangpinVO;
import com.entity.view.DiscusszhunongshangpinView;


/**
 * 产品评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface DiscusszhunongshangpinDao extends BaseMapper<DiscusszhunongshangpinEntity> {
	
	List<DiscusszhunongshangpinVO> selectListVO(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);
	
	DiscusszhunongshangpinVO selectVO(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);
	
	List<DiscusszhunongshangpinView> selectListView(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);

	List<DiscusszhunongshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);

	
	DiscusszhunongshangpinView selectView(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);
	

}
