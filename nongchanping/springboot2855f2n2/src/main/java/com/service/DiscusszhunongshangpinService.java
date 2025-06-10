package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhunongshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhunongshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhunongshangpinView;


/**
 * 产品评论表
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface DiscusszhunongshangpinService extends IService<DiscusszhunongshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhunongshangpinVO> selectListVO(Wrapper<DiscusszhunongshangpinEntity> wrapper);
   	
   	DiscusszhunongshangpinVO selectVO(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);
   	
   	List<DiscusszhunongshangpinView> selectListView(Wrapper<DiscusszhunongshangpinEntity> wrapper);
   	
   	DiscusszhunongshangpinView selectView(@Param("ew") Wrapper<DiscusszhunongshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhunongshangpinEntity> wrapper);

   	

}

