package com.dao;

import com.entity.DiscussnongjixuetangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongjixuetangVO;
import com.entity.view.DiscussnongjixuetangView;


/**
 * 课程评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:27
 */
public interface DiscussnongjixuetangDao extends BaseMapper<DiscussnongjixuetangEntity> {
	
	List<DiscussnongjixuetangVO> selectListVO(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);
	
	DiscussnongjixuetangVO selectVO(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);
	
	List<DiscussnongjixuetangView> selectListView(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);

	List<DiscussnongjixuetangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);

	
	DiscussnongjixuetangView selectView(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);
	

}
