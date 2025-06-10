package com.dao;

import com.entity.NongjixuetangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjixuetangVO;
import com.entity.view.NongjixuetangView;


/**
 * 课程
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface NongjixuetangDao extends BaseMapper<NongjixuetangEntity> {
	
	List<NongjixuetangVO> selectListVO(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);
	
	NongjixuetangVO selectVO(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);
	
	List<NongjixuetangView> selectListView(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);

	List<NongjixuetangView> selectListView(Pagination page,@Param("ew") Wrapper<NongjixuetangEntity> wrapper);

	
	NongjixuetangView selectView(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongjixuetangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongjixuetangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongjixuetangEntity> wrapper);



}
