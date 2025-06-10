package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhunongtuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhunongtuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhunongtuopinView;


/**
 * 文章评论表
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface DiscusszhunongtuopinService extends IService<DiscusszhunongtuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhunongtuopinVO> selectListVO(Wrapper<DiscusszhunongtuopinEntity> wrapper);
   	
   	DiscusszhunongtuopinVO selectVO(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);
   	
   	List<DiscusszhunongtuopinView> selectListView(Wrapper<DiscusszhunongtuopinEntity> wrapper);
   	
   	DiscusszhunongtuopinView selectView(@Param("ew") Wrapper<DiscusszhunongtuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhunongtuopinEntity> wrapper);

   	

}

