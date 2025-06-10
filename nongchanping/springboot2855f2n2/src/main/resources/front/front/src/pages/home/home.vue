<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto","alignItems":"flex-start","flexWrap":"wrap","display":"flex"}'>



		<!-- 关于我们 -->
		<div id="about" class="animate__animated" :style='{"padding":"30px 30px 30px 10%","boxShadow":"0 1px 6px rgba(255, 255, 255, .3)","margin":"0 0 0","display":"flex","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20231125/447e503c74a84f1aa12e161d0010c879.png)","width":"50%","backgroundSize":"cover","backgroundPosition":"left center","position":"relative","backgroundRepeat":"no-repeat","height":"auto","order":"2"}'>
		  <div :style='{"margin":"0 0 20px","color":"#fff","textAlign":"left","width":"100%","lineHeight":"1.5","fontSize":"30px","order":"1"}'>{{aboutUsDetail.title}}</div>
		  <div :style='{"margin":"0 0 10px","color":"#999","textAlign":"center","display":"none","width":"100%","lineHeight":"1.5","fontSize":"20px"}'>{{aboutUsDetail.subtitle}}</div>
		  <div :style='{"padding":"0 10px 20px","margin":"0","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","height":"auto","order":"3"}'>
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"block","height":"160px"}' :src="baseUrl + aboutUsDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"block","height":"160px"}' :src="baseUrl + aboutUsDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
		  </div>
		  <div :style='{"padding":"20px 20px 0","margin":"0 0 0 0","color":"#000","display":"-webkit-box","overflow":"hidden","background":"#fff","width":"100%","lineHeight":"2","fontSize":"16px","-webkit-box-orient":"vertical","-webkit-line-clamp":"6","height":"220px","order":"2"}' v-html="aboutUsDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","margin":"0 auto","top":"38px","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"32px","position":"absolute","right":"30px","order":"4"}' @click="toDetail('aboutusDetail',aboutUsDetail)">
		    <span :style='{"color":"#fff","fontSize":"15px"}'>查看更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"15px"}'></span>
		  </div>
		</div>
		<!-- 关于我们 -->

		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"30px 10% 30px 30px","boxShadow":"none","margin":"0 0 0","display":"flex","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20231125/447e503c74a84f1aa12e161d0010c879.png)","width":"50%","backgroundSize":"cover","backgroundPosition":"right center","position":"relative","backgroundRepeat":"no-repeat","height":"auto","order":"3"}'>
		  <div :style='{"margin":"0 0 20px","color":"#fff","textAlign":"left","width":"100%","lineHeight":"1.5","fontSize":"30px","order":"1"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"margin":"0 0 10px","color":"#999","textAlign":"center","display":"none","width":"100%","lineHeight":"1.5","fontSize":"20px"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"padding":"30px 10px","margin":"0","background":"#fff","flexDirection":"column","display":"flex","width":"45%","justifyContent":"space-between","height":"400px","order":"3"}'>
		    <img :style='{"width":"100%","margin":"0","objectFit":"cover","display":"block","height":"160px"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"width":"100%","margin":"0","objectFit":"cover","display":"block","height":"160px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"20px 20px","margin":"0 0","color":"#000","display":"-webkit-box","overflow":"hidden","background":"#fff","width":"55%","lineHeight":"1.8","fontSize":"16px","textOverflow":"ellipsis","-webkit-box-orient":"vertical","-webkit-line-clamp":"13","order":"2","height":"400px"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","margin":"0 auto","top":"38px","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"32px","position":"absolute","right":"20%","order":"4"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"color":"#fff","fontSize":"15px"}'>查看更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"15px"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"padding":"30px 10% ","margin":"0 auto","background":"url(http://codegen.caihongy.cn/20231126/63b650a0aa95438c8d59ce436224ccf2.png)","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","position":"relatove","backgroundRepeat":"no-repeat","order":"6"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"200px","margin":"100px 0 20px","lineHeight":"1","textAlign":"left","background":"none"}'>
			<span :style='{"color":"#71509E","fontSize":"32px"}'>公告资讯</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		




		<div class="list list15 index-pv1" :style='{"width":"100%","padding":"10px 0","background":"none","height":"auto"}'>
			<div class="tab" :style='{"top":"20px","left":"10%","display":"flex","width":"80%","position":"absolute","justifyContent":"space-between","height":"auto"}'>
				<div class="item" :class="newsIndex15 == 0 ? 'active' : ''" @click="newsIndexClick15(0)">
					<div :style='{"color":"inherit","fontSize":"14px","order":"1"}'>全部</div>
				</div>
				<template v-for="(item,index) in newsCategoryList15">
				<div v-if="index < 6" class="item" :class="newsIndex15 == index + 1 ? 'active' : ''" @click="newsIndexClick15(index+1)">
					<!-- <img :style='{"width":"50px","margin":"0 0 0 10px","objectFit":"cover","display":"block","height":"50px","order":"2"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg"> -->
					<div :style='{"color":"inherit","fontSize":"14px","order":"1"}'>{{item.typename}}</div>
				</div>
				</template>
				<div class="more" @click="moreBtn('news')">
				  <div :style='{"color":"inherit","fontSize":"14px"}'>更多</div>
				  <span class="icon iconfont icon-jiantou25" :style='{"color":"inherit","margin":"0 0 0 2px","fontSize":"14px"}'></span>
				</div>
			</div>
		  <div v-if="newsList.length" class="content" :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"450px"}'>
		    <div @click="toDetail('newsDetail', newsList[0])" class="left list-item animation-box" :style='{"padding":"25px 20px","borderColor":"#efefef #efefef red #efefef","margin":"0","flexWrap":"wrap","background":"#fff","borderWidth":"0","display":"flex","width":"380px","borderStyle":"solid","height":"auto"}'>
		      <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"250px","order":"1"}' :src="baseUrl + newsList[0].picture">
		      <div :style='{"padding":"0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#000","width":"100%","lineHeight":"2","fontSize":"16px","textOverflow":"ellipsis","fontWeight":"bold","order":"2"}' class="name">{{newsList[0].title}}</div>
		      <div :style='{"padding":"0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#000","width":"100%","lineHeight":"1.5","fontSize":"14px","textOverflow":"ellipsis","order":"3"}' class="desc">{{newsList[0].introduction}}</div>
		      <div :style='{"padding":"0 0","order":"8"}'>
		        <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
		        <span :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{newsList[0].addtime}}</span>
		      </div>
		      <div :style='{"width":"100%","padding":"8px 0","order":"7"}'>
		        <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
		        <span :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{newsList[0].name}}</span>
		      </div>
		      <div :style='{"padding":"8px 10px 0 0","order":"4"}'>
		        <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
		        <span :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{newsList[0].thumbsupnum}}</span>
		      </div>
		      <div :style='{"padding":"8px 10px 0","order":"5"}'>
		        <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
		        <span :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{newsList[0].storeupnum}}</span>
		      </div>
		      <div :style='{"padding":"8px 10px 0","order":"6"}'>
		        <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
		        <span :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{newsList[0].clicknum}}</span>
		      </div>
		    </div>
		    <div v-if="newsList.length > 1" class="right" :style='{"width":"calc(100% - 380px)","flexWrap":"wrap","flexDirection":"column","justifyContent":"space-between","display":"flex","height":"100%"}'>
			  <template v-for="(item,index) in newsList">
		      <div v-if="index > 0" @click="toDetail('newsDetail', item)" class="list-item animation-box">
		        <div class="date">
		          <div class="day">{{item.addtime.split(" ")[0].split("-")[2]}}</div>
		          <div class="year">{{item.addtime.split(" ")[0].split("-")[0] + '-' + item.addtime.split(" ")[0].split("-")[1]}}</div>
		        </div>
		        <div :style='{"padding":"0 10px 0 20px","alignItems":"center","flexWrap":"wrap","flex":"1","display":"flex","width":"calc(100% - 100px)","height":"100%"}' class="info">
		          <div class="name">{{item.title}}</div>
		          <div class="desc">{{item.introduction}}</div>
		          <div class="publisher" :style='{"padding":"0 10px","display":"inline-block","order":"6"}'>
		            <span class="icon iconfont icon-geren16"></span>
		            <span class="text">{{item.name}}</span>
		          </div>
		          <div class="like" :style='{"padding":"0 10px 0 0","display":"inline-block","order":"3"}'>
		            <span class="icon iconfont icon-zan10"></span>
		            <span class="text">{{item.thumbsupnum}}</span>
		          </div>
		          <div class="collect" :style='{"padding":"0 10px","display":"inline-block","order":"4"}'>
		            <span class="icon iconfont icon-shoucang10"></span>
		            <span class="text">{{item.storeupnum}}</span>
		          </div>
		          <div class="view" :style='{"padding":"0 10px","display":"inline-block","order":"5"}'>
		            <span class="icon iconfont icon-chakan9"></span>
		            <span class="text">{{item.clicknum}}</span>
		          </div>
		        </div>
		      </div>
			  </template>
		    </div>
		  </div>
		</div>







		<div @click="moreBtn('news')" :style='{"border":"0","margin":"0 auto","top":"138px","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"1","position":"absolute","right":"10%"}'>
			<span :style='{"color":"#858585","fontSize":"16px"}'>更多</span>
			<i :style='{"color":"#858585","fontSize":"16px"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendzhunongshangpin" class="recommend animate__animated" :style='{"padding":"30px 10%","margin":"0 0 0","background":"url(http://codegen.caihongy.cn/20231125/8a4a2d41e5c9470aab1a79679b276e9d.png)","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","position":"relative","backgroundRepeat":"no-repeat","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"200px","margin":"100px 0 20px","lineHeight":"1","textAlign":"left","background":"none"}'>
		<span :style='{"color":"#71509E","fontSize":"32px"}'>产品推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	

	<div v-if="zhunongshangpinRecommend.length" class="list list10 index-pv1 list10zhunongshangpin" :style='{"width":"100%","padding":"10px","background":"none","height":"auto"}'>
	  <div :style='{"width":"100%","background":"none","height":"600px"}'>
	    <div class="swiper-container recommendSwiper10 recommend-list-10zhunongshangpin">
	      <div class="swiper-wrapper">
	        <div class="swiper-slide" v-for="item,index in zhunongshangpinRecommend" :key="index">
	          <div class="list-item animation-box" :style='{"width":"100%","position":"relative","height":"auto"}' @click="toDetail('zhunongshangpinDetail', item)">
				<img :name="item.id" :style='{"border":"1px solid #d8cbeb","width":"100%","objectFit":"contain","background":"rgba(255,255,255,.3)","display":"block","height":"248px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
				<img :name="item.id" :style='{"border":"1px solid #d8cbeb","width":"100%","objectFit":"contain","background":"rgba(255,255,255,.3)","display":"block","height":"248px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
				<div class="line1" :style='{"padding":"0 10px","lineHeight":"2","fontSize":"18px","color":"#000"}'>{{item.chanpinmingcheng}}</div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>






	
	<div @click="moreBtn('zhunongshangpin')" :style='{"border":"0","margin":"10px auto","top":"100px","textAlign":"center","background":"none","display":"block","width":"80px","lineHeight":"32px","position":"absolute","right":"10%"}'>
		<span :style='{"color":"#858585","fontSize":"14px"}'>MORE</span>
		<i :style='{"color":"#858585","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->


<!-- 特价商品 -->
<div id="animate_listzhunongtuopin" class="lists animate__animated" :style='{"width":"80%","padding":"20px 0","margin":"0 auto","position":"relative","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","margin":"10px 0","lineHeight":"54px","textAlign":"center","background":"none"}'>
	  <span :style='{"color":"#71509E","fontSize":"32px"}'>文章展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="zhunongtuopinList.length" class="list list11 index-pv1" :style='{"width":"100%","padding":"10px 0","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div class="tab" :style='{"padding":"20px 0","margin":"0 0 0 0","flexDirection":"column","background":"url(http://codegen.caihongy.cn/20231126/83802f5bebb04fd3bb1d104c21d64111.png)","display":"flex","width":"300px","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}'>
		<template v-for="item,index in listList11zhunongtuopin">
	    <div v-if="index < 6" :style='{"cursor":"pointer","padding":"15px 20px","margin":"0","borderColor":"#efefef","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center","height":"auto"}' class="item" @click="listIndexClick11(item, 'zhunongtuopin')">
	      <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#333","display":"none"}'></span>
	      <img v-if="item.image" :style='{"width":"60px","margin":"0 20px 0 0","objectFit":"cover","borderRadius":"5px","display":"inline-block","height":"60px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
		  <span :style='{"color":"#fff","lineHeight":"44px","fontSize":"18px"}'>{{item[listColumn11zhunongtuopin]}}</span>
	    </div>
		</template>
		<div :style='{"cursor":"pointer","padding":"0 20px","margin":"0","borderColor":"#efefef","textAlign":"center","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="more" @click="moreBtn('zhunongtuopin')">
		  <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#333","display":"none"}'></span>
		  <div :style='{"color":"#fff","lineHeight":"44px","fontSize":"18px"}'>更多</div>
		</div>
	  </div>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#F1F2F3","display":"flex","width":"calc(100% - 300px)","justifyContent":"space-between","height":"auto"}'>
	    <div :style='{"border":"1px solid #D8D8D8","width":"calc(100% / 3)","padding":"40px","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in zhunongtuopinList" :key="index" @click="toDetail('zhunongtuopinDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"contain","display":"block","height":"200px"}' v-if="preHttp(item.wenzhangzhaopian)" :src="item.wenzhangzhaopian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"contain","display":"block","height":"200px"}' v-else :src="baseUrl + (item.wenzhangzhaopian?item.wenzhangzhaopian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"10px 10px 0","lineHeight":"32px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{item.wenzhangbiaoti}}</div>
			<div class="line1" :style='{"padding":"10px 10px 0","lineHeight":"32px","fontSize":"18px","color":"#000","textAlign":"center"}'>{{item.wenzhangfenlei}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('zhunongtuopin')" :style='{"border":"0","margin":"10px auto","top":"30px","textAlign":"center","background":"none","display":"block","width":"80px","lineHeight":"32px","position":"absolute","right":"0"}'>
		<span :style='{"color":"#858585","fontSize":"16px"}'>更多</span>
		<i :style='{"color":"#858585","fontSize":"16px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->
	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],
        zhunongshangpinRecommend: [],

        zhunongtuopinList: [],


		newsIndex15: 0,
		newsCategoryList15: [],
		recommendListSwiper10zhunongshangpin: null,
		recommendIndex10zhunongshangpin: 0,
		recommendList10zhunongshangpin: [],
		recommendColumn10zhunongshangpin: '',

		listIndex11zhunongtuopin: 0,
		listList11zhunongtuopin: [],
		listColumn11zhunongtuopin: '',

      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getNewsCategory()
		this.getAboutUs();
		this.getSystemIntroduction();
		this.getList();
		this.zhunongshangpinRecommendCate()
		this.zhunongtuopinListCate()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			if (this['recommendListSwiper10zhunongshangpin']) this['recommendListSwiper10zhunongshangpin'].destroy()
			setTimeout(()=>{
				this['recommendListSwiper10zhunongshangpin'] = new Swiper(".recommend-list-10zhunongshangpin", {"freeMode":true,"slidesPerView":3,"slidesPerColumn":2,"spaceBetween":30})
			},750)
		},
		newsIndexClick15(index) {
			this.newsIndex15 = index
			this.getNewsList()
		},
		getNewsCategory() {
			this.$http.get('newstype/list', {}).then(res => {
				if (res.data.code == 0) {
					this.newsCategoryList15 = res.data.data
				}
			});
		},
		zhunongshangpinRecommendCate(){
			this.$http.get('chanpinfenlei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList10zhunongshangpin = res.data.data.list
			  }
			});
			this.recommendColumn10zhunongshangpin = 'chanpinfenlei'
		},
		async recommendIndexClick10(index, name) {
			this['recommendIndex10' + name] = index
			await this.getList()
			this.swiperChanges()
		},

		zhunongtuopinListCate(){
			this.$http.get('wenzhangfenlei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.listList11zhunongtuopin = res.data.data.list
			  }
			});
			this.listColumn11zhunongtuopin = 'wenzhangfenlei'
		},
		listIndexClick11(index, name) {
			this['listIndex11' + name] = index[this['listColumn11' + name]]
			this.getList()
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__shakeY'},
				{id:'about',css:'animate__swing'},
				{id:'system',css:'animate__heartBeat'},
				{id:'animate_recommendzhunongshangpin',css:'animate__bounceInDown'},
				{id:'animate_listzhunongtuopin',css:'animate__wobble'},
				{id:'animate_newsnews',css:'animate__jello'},
				{id:'msgs',css:'animate__backInDown'},
				{id:'friendly',css:'animate__pulse'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 6,
                sort: 'addtime',
				order: 'desc'
			}
			if(this.newsIndex15!=0) {
				data['typename'] = this.newsCategoryList15[this.newsIndex15 - 1].typename
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "zhunongshangpin/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "zhunongshangpin/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			if(this.recommendIndex10zhunongshangpin != 0){
				data.chanpinfenlei = this.recommendList10zhunongshangpin[this.recommendIndex10zhunongshangpin - 1].chanpinfenlei
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.zhunongshangpinRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			data = {
				page: 1,
				limit: 6,
			}
			if(this.listIndex11zhunongtuopin){
				data.wenzhangfenlei = this.listIndex11zhunongtuopin
			}
			this.$http.get('zhunongtuopin/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.zhunongtuopinList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 0;
			border-radius: 30px 0 0 30px;
			padding: 0 30px 0 10px;
			box-shadow: none;
			outline: none;
			color: #000;
			background: #ffffff50;
			width: 200px;
			font-size: 14px;
			height: 50px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 0 30px 30px 0;
			padding: 0 10px;
			box-shadow: none;
			outline: none;
			color: #000;
			background: #ffffff50;
			width: 100%;
			font-size: 14px;
			height: 50px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(0.9) skew(0deg, 0deg) translate3d(0px, 20px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 20px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, -2deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(3deg, 3deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(-3deg, -3deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	


	.home-preview .news .list15 .tab .item {
				cursor: pointer;
				border-radius: 10px;
				padding: 5px 20px;
				margin: 0 10px;
				color: #000;
				background: linear-gradient(135deg, #E4D8F4 0%, #B1C8F0 100%);
				display: flex;
				line-height: 44px;
				align-items: center;
				height: 80px;
			}
	
	.home-preview .news .list15 .tab .item:hover {
				color: #333;
				background: linear-gradient(270deg, #E4D8F4 0%, #B1C8F0 100%);
			}
	
	.home-preview .news .list15 .tab .item.active {
				color: #333;
				background: #A293B6;
			}
	
	.home-preview .news .list15 .tab .more {
				cursor: pointer;
				border-radius: 10px;
				padding: 5px 30px;
				margin: 0 10px;
				color: #000;
				background: linear-gradient(135deg, #E4D8F4 0%, #B1C8F0 100%);
				display: flex;
				line-height: 44px;
				align-items: center;
				height: 80px;
			}
	
	.home-preview .news .list15 .tab .more:hover {
				background: red;
			}
	
	.home-preview .news .list15 .content .right .list-item  {
				border: 1px solid #efefef;
				padding: 0 0;
				margin: 0 0 0 auto;
				background: #fff;
				display: flex;
				width: calc(50% - 30px);
				justify-content: space-between;
				align-items: center;
				height: 26%;
			}
	.home-preview .news .list15 .content .right .list-item:hover  {
				background: #A293B6;
			}
	
	.home-preview .news .list15 .content .right .list-item .date  {
				flex-direction: column;
				display: flex;
				width: 100px;
				border-color: #D8D8D8;
				border-width: 0 1px 0 0;
				justify-content: center;
				align-items: center;
				border-style: solid;
				height: 80%;
			}
	.home-preview .news .list15 .content .right .list-item:hover .date {
				border-color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .date .day  {
				color: #000;
				width: auto;
				font-size: 28px;
				border-color: red;
				border-width: 0;
				line-height: 1;
				border-style: solid;
			}
	.home-preview .news .list15 .content .right .list-item:hover .date .day {
				color: #fff;
				border-color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .date .year  {
				color: #000;
				width: auto;
				font-size: 14px;
				line-height: 1.5;
				text-align: center;
			}
	.home-preview .news .list15 .content .right .list-item:hover .date .year {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .name  {
				padding: 0 0;
				overflow: hidden;
				color: #000;
				white-space: nowrap;
				font-weight: bold;
				width: 100%;
				font-size: 16px;
				line-height: 1.5;
				text-overflow: ellipsis;
				order: 1;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .name {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .desc  {
				padding: 0 0;
				overflow: hidden;
				color: #000;
				white-space: nowrap;
				width: 100%;
				font-size: 14px;
				line-height: 1.5;
				text-overflow: ellipsis;
				order: 2;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .desc {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .publisher .icon {
				margin: 0 2px 0 0;
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .publisher .icon {
				color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .info .publisher .text {
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .publisher .text {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .like .icon {
				margin: 0 2px 0 0;
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .like .icon {
				color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .info .like .text {
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .like .text {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .collect .icon {
				margin: 0 2px 0 0;
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .collect .icon {
				color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .info .collect .text {
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .collect .text {
				color: #fff;
			}
	
	.home-preview .news .list15 .content .right .list-item .info .view .icon {
				margin: 0 2px 0 0;
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .view .icon {
				color: #fff;
			}
	.home-preview .news .list15 .content .right .list-item .info .view .text {
				color: #666;
				font-size: 12px;
				line-height: 1.5;
			}
	.home-preview .news .list15 .content .right .list-item:hover .info .view .text {
				color: #fff;
			}




	.home-preview .recommend .list10 .swiper-container {
	    width: 100%;
	    height: 100%;
	    margin-left: auto;
	    margin-right: auto;
	}
	
	.home-preview .recommend .list10 .swiper-slide {
	    text-align: center;
	    height: calc((100% - 30px) / 2);
		
	    /* Center slide text vertically */
	    display: -webkit-box;
	    display: -ms-flexbox;
	    display: -webkit-flex;
	    display: flex;
	    -webkit-box-pack: center;
	    -ms-flex-pack: center;
	    -webkit-justify-content: center;
	    justify-content: center;
	    -webkit-box-align: center;
	    -ms-flex-align: center;
	    -webkit-align-items: center;
	    align-items: center;
	}
	
	.home-preview .recommend .list10 .tab .item {
				cursor: pointer;
				border-radius: 10px;
				padding: 5px 20px;
				margin: 0 10px;
				color: #000;
				background: linear-gradient(135deg, #E4D8F4 0%, #B1C8F0 100%);
				display: flex;
				line-height: 44px;
				align-items: center;
				height: 80px;
			}
	
	.home-preview .recommend .list10 .tab .item:hover {
				color: #333;
				background: linear-gradient(270deg, #E4D8F4 0%, #B1C8F0 100%);
			}
	
	.home-preview .recommend .list10 .tab .item.active {
				color: #333;
				background: #A293B6;
			}
	
	.home-preview .recommend .list10 .tab .more {
				cursor: pointer;
				border-radius: 6px;
				padding: 5px 30px;
				margin: 0 10px;
				color: #000;
				background: linear-gradient(135deg, #E4D8F4 0%, #B1C8F0 100%);
				display: flex;
				line-height: 44px;
				align-items: center;
				height: 80px;
			}
	
	.home-preview .recommend .list10 .tab .more:hover {
				background: linear-gradient(270deg, #E4D8F4 0%, #B1C8F0 100%);
			}




</style>
