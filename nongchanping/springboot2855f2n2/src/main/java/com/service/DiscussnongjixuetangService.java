package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongjixuetangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongjixuetangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongjixuetangView;


/**
 * 课程评论表
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:27
 */
public interface DiscussnongjixuetangService extends IService<DiscussnongjixuetangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongjixuetangVO> selectListVO(Wrapper<DiscussnongjixuetangEntity> wrapper);
   	
   	DiscussnongjixuetangVO selectVO(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);
   	
   	List<DiscussnongjixuetangView> selectListView(Wrapper<DiscussnongjixuetangEntity> wrapper);
   	
   	DiscussnongjixuetangView selectView(@Param("ew") Wrapper<DiscussnongjixuetangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongjixuetangEntity> wrapper);

   	

}

