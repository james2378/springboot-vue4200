package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhunongtuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhunongtuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhunongtuopinView;


/**
 * 文章
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface ZhunongtuopinService extends IService<ZhunongtuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhunongtuopinVO> selectListVO(Wrapper<ZhunongtuopinEntity> wrapper);
   	
   	ZhunongtuopinVO selectVO(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);
   	
   	List<ZhunongtuopinView> selectListView(Wrapper<ZhunongtuopinEntity> wrapper);
   	
   	ZhunongtuopinView selectView(@Param("ew") Wrapper<ZhunongtuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhunongtuopinEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhunongtuopinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhunongtuopinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhunongtuopinEntity> wrapper);



}

