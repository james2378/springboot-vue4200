package com.entity.vo;

import com.entity.ZhunongtuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 文章
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
public class ZhunongtuopinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章标题
	 */
	
	private String wenzhangbiaoti;
		
	/**
	 * 文章分类
	 */
	
	private String wenzhangfenlei;
		
	/**
	 * 文章照片
	 */
	
	private String wenzhangzhaopian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 文章简介
	 */
	
	private String wenzhangjianjie;
		
	/**
	 * 文章详情
	 */
	
	private String wenzhangxiangqing;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：文章标题
	 */
	 
	public void setWenzhangbiaoti(String wenzhangbiaoti) {
		this.wenzhangbiaoti = wenzhangbiaoti;
	}
	
	/**
	 * 获取：文章标题
	 */
	public String getWenzhangbiaoti() {
		return wenzhangbiaoti;
	}
				
	
	/**
	 * 设置：文章分类
	 */
	 
	public void setWenzhangfenlei(String wenzhangfenlei) {
		this.wenzhangfenlei = wenzhangfenlei;
	}
	
	/**
	 * 获取：文章分类
	 */
	public String getWenzhangfenlei() {
		return wenzhangfenlei;
	}
				
	
	/**
	 * 设置：文章照片
	 */
	 
	public void setWenzhangzhaopian(String wenzhangzhaopian) {
		this.wenzhangzhaopian = wenzhangzhaopian;
	}
	
	/**
	 * 获取：文章照片
	 */
	public String getWenzhangzhaopian() {
		return wenzhangzhaopian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：文章简介
	 */
	 
	public void setWenzhangjianjie(String wenzhangjianjie) {
		this.wenzhangjianjie = wenzhangjianjie;
	}
	
	/**
	 * 获取：文章简介
	 */
	public String getWenzhangjianjie() {
		return wenzhangjianjie;
	}
				
	
	/**
	 * 设置：文章详情
	 */
	 
	public void setWenzhangxiangqing(String wenzhangxiangqing) {
		this.wenzhangxiangqing = wenzhangxiangqing;
	}
	
	/**
	 * 获取：文章详情
	 */
	public String getWenzhangxiangqing() {
		return wenzhangxiangqing;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
