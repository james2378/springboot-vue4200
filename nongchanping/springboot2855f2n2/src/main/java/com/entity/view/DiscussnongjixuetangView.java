package com.entity.view;

import com.entity.DiscussnongjixuetangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 课程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-08 17:32:27
 */
@TableName("discussnongjixuetang")
public class DiscussnongjixuetangView  extends DiscussnongjixuetangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussnongjixuetangView(){
	}
 
 	public DiscussnongjixuetangView(DiscussnongjixuetangEntity discussnongjixuetangEntity){
 	try {
			BeanUtils.copyProperties(this, discussnongjixuetangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
