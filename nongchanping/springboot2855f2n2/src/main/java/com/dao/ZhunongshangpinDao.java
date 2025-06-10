package com.dao;

import com.entity.ZhunongshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhunongshangpinVO;
import com.entity.view.ZhunongshangpinView;


/**
 * 产品
 * 
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
public interface ZhunongshangpinDao extends BaseMapper<ZhunongshangpinEntity> {
	
	List<ZhunongshangpinVO> selectListVO(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);
	
	ZhunongshangpinVO selectVO(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);
	
	List<ZhunongshangpinView> selectListView(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);

	List<ZhunongshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);

	
	ZhunongshangpinView selectView(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);



}
