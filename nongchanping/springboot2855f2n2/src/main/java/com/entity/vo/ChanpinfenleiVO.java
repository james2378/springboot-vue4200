package com.entity.vo;

import com.entity.ChanpinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 产品分类
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-08 17:32:25
 */
public class ChanpinfenleiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * image
	 */
	
	private String image;
				
	
	/**
	 * 设置：image
	 */
	 
	public void setImage(String image) {
		this.image = image;
	}
	
	/**
	 * 获取：image
	 */
	public String getImage() {
		return image;
	}
			
}
