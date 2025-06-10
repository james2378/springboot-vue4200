package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhunongshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhunongshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhunongshangpinView;


/**
 * 产品
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
public interface ZhunongshangpinService extends IService<ZhunongshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhunongshangpinVO> selectListVO(Wrapper<ZhunongshangpinEntity> wrapper);
   	
   	ZhunongshangpinVO selectVO(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);
   	
   	List<ZhunongshangpinView> selectListView(Wrapper<ZhunongshangpinEntity> wrapper);
   	
   	ZhunongshangpinView selectView(@Param("ew") Wrapper<ZhunongshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhunongshangpinEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhunongshangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhunongshangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhunongshangpinEntity> wrapper);



}

