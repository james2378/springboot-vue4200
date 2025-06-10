package com.dao;

import com.entity.DiscusszhunongtuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhunongtuopinVO;
import com.entity.view.DiscusszhunongtuopinView;


/**
 * 文章评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface DiscusszhunongtuopinDao extends BaseMapper<DiscusszhunongtuopinEntity> {
	
	List<DiscusszhunongtuopinVO> selectListVO(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);
	
	DiscusszhunongtuopinVO selectVO(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);
	
	List<DiscusszhunongtuopinView> selectListView(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);

	List<DiscusszhunongtuopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);

	
	DiscusszhunongtuopinView selectView(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);
	

}
