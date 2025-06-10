package com.dao;

import com.entity.ZhunongtuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhunongtuopinVO;
import com.entity.view.ZhunongtuopinView;


/**
 * 文章
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface ZhunongtuopinDao extends BaseMapper<ZhunongtuopinEntity> {
	
	List<ZhunongtuopinVO> selectListVO(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);
	
	ZhunongtuopinVO selectVO(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);
	
	List<ZhunongtuopinView> selectListView(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);

	List<ZhunongtuopinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);

	
	ZhunongtuopinView selectView(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);



}
