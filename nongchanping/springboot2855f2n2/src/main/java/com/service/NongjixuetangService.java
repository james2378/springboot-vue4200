package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjixuetangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjixuetangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjixuetangView;


/**
 * 课程
 *
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public interface NongjixuetangService extends IService<NongjixuetangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjixuetangVO> selectListVO(Wrapper<NongjixuetangEntity> wrapper);
   	
   	NongjixuetangVO selectVO(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);
   	
   	List<NongjixuetangView> selectListView(Wrapper<NongjixuetangEntity> wrapper);
   	
   	NongjixuetangView selectView(@Param("ew") Wrapper<NongjixuetangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjixuetangEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<NongjixuetangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<NongjixuetangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<NongjixuetangEntity> wrapper);



}

