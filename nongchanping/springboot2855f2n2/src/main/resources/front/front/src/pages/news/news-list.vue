<template>
<div>
	<div :style='{"width":"100%","padding":"30px 10%","margin":"0 auto","borderRadius":"0","background":"#A293B6"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'>'" :style='{"fontSize":"16px","lineHeight":"1"}'>
			<el-breadcrumb-item class="item1" to="/"><a>首页</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item2" v-for="(item, index) in breadcrumbItem" :key="index"><a>{{item.name}}</a></el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	
	<div class="news-preview-pv" :style='{"width":"100%","margin":"0 auto","position":"relative","background":"none"}'>
		<el-form :inline="true" :model="formSearch" class="list-form-pv" :style='{"padding":"10px 10%","alignItems":"center","flexWrap":"wrap","background":"#A293B6","display":"flex","width":"100%","justifyContent":"flex-start","height":"auto"}'>
			<el-form-item :style='{"margin":"0 10px"}'>
				<el-input v-model="title" placeholder="标题"></el-input>
			</el-form-item>
			<el-button type="primary" @click="getNewsList(1)" :style='{"cursor":"pointer","border":"0","padding":"0px 15px","margin":"0 10px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"rgb(64, 158, 255)","width":"auto","fontSize":"14px","lineHeight":"42px","height":"42px"}'>
				<span class="icon iconfont icon-chakan14" :style='{"color":"#fff","margin":"0 10px 0 0","fontSize":"14px"}'></span>
				搜索
			</el-button>
		</el-form>
		
		<!-- category -->
		<div class="category" :style='{"width":"100%","padding":"10px 10%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		  <div class="item" @click="categoryClick(0)" :class="categoryIndex == 0 ? 'active' : ''">全部</div>
		  <div v-for="(item,index) in categoryList" @click="categoryClick(index+1)" :key="index" class="item" :class="categoryIndex == index+1 ? 'active' : ''">{{item.typename}}</div>
		</div>
	
				
				
				
				
				
				
				
				<div v-if="newsList.length" :style='{"width":"100%","padding":"10px 10%","background":"none","height":"auto"}' class="list8 index-pv1">
		  <div :style='{"width":"100%","display":"flex","height":"auto"}'>
		    <div :style='{"width":"50%","position":"relative","height":"auto"}' @click="toNewsDetail(newsList[0])">
		      <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"500px"}' :src="baseUrl + newsList[0].picture">
		      <div :style='{"padding":"10px","left":"0","bottom":"0","background":"rgba(0,0,0,.3)","display":"none","width":"100%","position":"absolute","zIndex":"9"}'>
		        <div :style='{"color":"#fff","lineHeight":"32px","fontSize":"16px"}'>{{newsList[0].title}}</div>
		        <div :style='{"color":"#fff","lineHeight":"1.5","fontSize":"14px"}'>{{newsList[0].introduction}}</div>
		        <div :style='{"color":"#fff","lineHeight":"1.5","fontSize":"14px"}'>{{newsList[0].addtime}}</div>
		      </div>
		    </div>
		    <div v-if="newsList.length > 1" :style='{"width":"50%","padding":"0 0 0 20px","flexDirection":"column","justifyContent":"space-between","display":"flex","height":"500px"}'>
			  <template v-for="item,index in newsList">
				  <div v-if="index > 0 && index < 5" :style='{"padding":"0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","alignItems":"center","display":"flex","width":"100%","justifyContent":"center","height":"100px"}' @click="toNewsDetail(item)">
					<div :style='{"border":"0","padding":"10px 0","margin":"0 20px 0 0","alignItems":"center","flexDirection":"column","background":"#A293B6","display":"flex","width":"80px","justifyContent":"center","height":"100%"}'>
					  <div :style='{"color":"#fff","lineHeight":"1.5","fontSize":"30px"}'>{{item.addtime.split(" ")[0].split("-")[2]}}</div>
					  <div :style='{"color":"#fff","lineHeight":"1.5","fontSize":"14px"}'>{{item.addtime.split(" ")[0].split("-")[0] + '-' + item.addtime.split(" ")[0].split("-")[1]}}</div>
					</div>
					<div :style='{"flex":"1","flexDirection":"column","justifyContent":"center","display":"flex","height":"100%"}'>
					  <div :style='{"lineHeight":"30px","fontSize":"16px","whiteSpace":"nowrap","overflow":"hidden","textOverflow":"ellipsis","color":"#333"}'>{{item.title}}</div>
					  <div :style='{"padding":"0 20px 0 0","overflow":"hidden","color":"#666","display":"-webkit-box","lineHeight":"20px","fontSize":"14px","-webkit-box-orient":"vertical","-webkit-line-clamp":"2"}'>{{item.introduction}}</div>
					  <span class="icon iconfont icon-jiantou37" :style='{"lineHeight":"20px","fontSize":"14px","color":"#999","float":"right","display":"none"}'></span>
					</div>
				  </div>
			  </template>
		    </div>
		  </div>
		  <div v-if="newsList.length > 4" :style='{"width":"100%","margin":"20px 0 0 0","height":"auto"}'>
			<template v-for="item,index in newsList">
				<div v-if="index > 4" @click="toNewsDetail(item)" :style='{"padding":"0 10px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","borderColor":"#efefef","margin":"0 0 10px","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between"}'>
				  <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#000","width":"50%","lineHeight":"50px","fontSize":"16px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{item.title}}</div>
				  <div :style='{"color":"#818181","lineHeight":"50px","fontSize":"14px"}'>{{item.addtime.split(" ")[0]}}</div>
				</div>
			</template>
		  </div>
		</div>
				
				
		<el-pagination
		  background
		  id="pagination" class="pagination"
		  :pager-count="7"
		  :page-size="pageSize"
		  :page-sizes="pageSizes"
		  prev-text="上一页"
		  next-text="下一页"
		  :hide-on-single-page="false"
		  :layout='["prev","pager","next"].join()'
		  :total="total"
		  :style='{"padding":"0","margin":"20px auto","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","fontWeight":"500"}'
		  @current-change="curChange"
		  @prev-click="prevClick"
		  @next-click="nextClick"
		></el-pagination>

		<!-- 热门信息 -->
		<div class="hot" :style='{"width":"100%","boxShadow":"none","padding":"20px 10%","background":"#fff","height":"auto"}'>
		  <div :style='{"width":"100%","lineHeight":"44px","fontSize":"24px","color":"#A293B6","textAlign":"left","background":"none"}'>热门信息</div>
		  <div :style='{"padding":"0 0 5px 0","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
		    <div v-for="item in hotList" :key="item.id" :style='{"padding":"10px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","borderRadius":"10px","flexWrap":"wrap","background":"#fff","flexDirection":"column","display":"flex","width":"calc(20% - 20px)","justifyContent":"center","height":"120px"}' @click="toNewsDetail(item)">
		      <img :style='{"width":"100px","objectFit":"cover","display":"block","height":"100px"}' :src="baseUrl + item.picture" alt="">
		      <div :style='{"width":"calc(100% - 100px)","padding":"0 0 0 10px","lineHeight":"1.5","fontSize":"16px","color":"#000"}'>{{ item.title }}</div>
		      <div :style='{"width":"calc(100% - 100px)","padding":"0 0 0 10px","lineHeight":"1.5","fontSize":"14px","color":"#4D4D4D","textAlign":"left"}'>{{item.addtime}}</div>
		    </div>
		  </div>
		</div>
		<!-- 最新动态 -->
		<div class="news" :style='{"width":"100%","padding":"20px 10%","background":"#fff","height":"auto"}'>
		  <div :style='{"width":"100%","padding":"0 0","lineHeight":"44px","fontSize":"24px","color":"#A293B6","background":"none"}'>最新动态</div>
		  <div :style='{"width":"100%","padding":"20px 0","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
		    <div v-for="item in recommendList" :key="item.id" :style='{"width":"23%","margin":"0 10px","background":"#fff","flex":"1","height":"auto"}' @click="toNewsDetail(item)">
		      <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"140px"}' :src="baseUrl + item.picture" alt="">
		      <div :style='{"padding":"0 10px","lineHeight":"32px","fontSize":"16px","color":"#000","textAlign":"center"}'>{{ item.title }}</div>
		      <div :style='{"padding":"0 10px","lineHeight":"1.5","fontSize":"14px","color":"#4d4d4d","textAlign":"center"}'>{{item.addtime}}</div>
		    </div>
		  </div>
		</div>
	</div>
</div>
</template>

<script>
	export default {
		//数据集合
		data() {
			return {
				baseUrl: this.$config.baseUrl,
				breadcrumbItem: [
				  {
					name: '公告资讯'
				  }
				],
				newsList: [],
				total: 1,
				pageSize: 10,
				pageSizes: [10,20,30,50],
				totalPage: 1,
				layouts: '',
				title: '',
				categoryIndex: 0,
				categoryList: [],
				hotList: [],
				recommendList: [],
			}
		},
		created() {
			this.getCategoryList()
			this.getNewsList(1);
			this.getHotList()
			this.getRecommendList()
		},
		//方法集合
		methods: {
			getCategoryList(){
				this.$http.get('newstype/list', {}).then(res => {
					if (res.data.code == 0) {
						this.categoryList = res.data.data.list
					}
				});
			},
			categoryClick(index) {
				this.categoryIndex = index
				this.getNewsList()
			},
			getNewsList(page) {
				let params = {page, limit: this.pageSize,sort:'addtime',order:'desc'};
				let searchWhere = {};
				if(this.title != '') searchWhere.title = '%' + this.title + '%';
				if(this.categoryIndex!=0){
					searchWhere.typename = this.categoryList[this.categoryIndex - 1].typename
				}
				this.$http.get('news/list', {params: Object.assign(params, searchWhere)}).then(res => {
					if (res.data.code == 0) {
						this.newsList = res.data.data.list;
						this.total = res.data.data.total;
						this.pageSize = Number(res.data.data.pageSize);
						this.pageSizes = [this.pageSize, this.pageSize*2, this.pageSize*3, this.pageSize*5];
						this.totalPage = res.data.data.totalPage;
					}
				});
			},
			getHotList(){
				let params = {page:1, limit: 4,sort:'addtime',order:'desc'};
				this.$http.get('news/autoSort', {params: params}).then(res => {
					if (res.data.code == 0) {
						this.hotList = res.data.data.list;
					}
				});
			},
			getRecommendList(){
				let url = 'news/autoSort'
				if(localStorage.getItem('frontToken')){
					url = 'news/autoSort2'
				}
				let params = {page:1, limit: 4,sort:'addtime',order:'desc'};
				this.$http.get(url, {params: params}).then(res => {
					if (res.data.code == 0) {
						this.recommendList = res.data.data.list;
					}
				});
			},
			curChange(page) {
				this.getNewsList(page);
			},
			prevClick(page) {
				this.getNewsList(page);
			},
			nextClick(page) {
				this.getNewsList(page);
			},
			toNewsDetail(item) {
				this.$router.push({path: '/index/newsDetail', query: {id: item.id}});
			}
		}
	}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 20px;
		color: #000;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb .item1 /deep/ .el-breadcrumb__inner a {
		color: #000;
		display: inline-block;
	}
	
	.breadcrumb-preview .el-breadcrumb .item2 /deep/ .el-breadcrumb__inner a {
		color: #000;
		display: inline-block;
	}
	
	.news-wrap {
	  width: 1000px;
	  margin: 0 auto;
	}
	.news-item {
	  height: 200px;
	  width: auto;
	  margin-bottom: 30px;
	  cursor: pointer;
	}
	.news-item-text {
	  width: calc(100% - 215px);
	  display: inline-block;
	  vertical-align: top;
	  margin-left: 15px;
	}
	.news-item-text-title {
	  font-size: 16px;
	  margin-bottom: 15px;
	}
	.news-item-text-intro {
	  font-size: 14px;
	  color: #666;
	}
	
	.hide1 {
		text-overflow: ellipsis;
		display: -webkit-box;
		-webkit-line-clamp: 1;
		-webkit-box-orient: vertical;
		overflow:hidden;
		text-overflow:ellipsis;
	}
	.hide2 {
		text-overflow: ellipsis;
		display: -webkit-box;
		-webkit-line-clamp: 2;
		-webkit-box-orient: vertical;
		overflow:hidden;
		text-overflow:ellipsis;
	}
	.hide3 {
		text-overflow: ellipsis;
		display: -webkit-box;
		-webkit-line-clamp: 3;
		-webkit-box-orient: vertical;
		overflow:hidden;
		text-overflow:ellipsis;
	}
	
	.index-pv1 .animation-box {
		transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
		z-index: initial;
	}
	
	.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(4deg, 4deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
	}
	
	.index-pv1 .animation-box img {
		transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
	}
	
	.index-pv1 .animation-box img:hover {
				transform: rotate(360deg) scale(1) skew(-4deg, -4deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		
	#pagination.el-pagination /deep/ .el-pagination__total {
				margin: 0 10px 0 0;
				color: #666;
				font-weight: 400;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	#pagination.el-pagination /deep/ .btn-prev {
				border: none;
				border-radius: 2px;
				padding: 0 10px;
				margin: 0 5px;
				color: #000;
				background: none;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				min-width: 35px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .btn-next {
				border: none;
				border-radius: 2px;
				padding: 0 10px;
				margin: 0 5px;
				color: #000;
				background: none;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				min-width: 35px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .btn-prev:disabled {
				border: none;
				cursor: not-allowed;
				border-radius: 2px;
				padding: 0 0;
				margin: 0 5px;
				color: #666;
				background: none;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .btn-next:disabled {
				border: none;
				cursor: not-allowed;
				border-radius: 2px;
				padding: 0 0;
				margin: 0 5px;
				color: #666;
				background: none;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .el-pager {
				padding: 0;
				margin: 0;
				display: inline-block;
				vertical-align: top;
			}
	
	#pagination.el-pagination /deep/ .el-pager .number {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #000;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				border-radius: 50%;
				background: #9E9E9E;
				text-align: center;
				min-width: 30px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .el-pager .number:hover {
				cursor: pointer;
				padding: 0 4px;
				margin: 0 5px;
				color: #000;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				border-radius: 50%;
				background: #A293B6;
				text-align: center;
				min-width: 30px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .el-pager .number.active {
				cursor: default;
				padding: 0 4px;
				margin: 0 5px;
				color: #000;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 30px;
				border-radius: 50%;
				background: #A293B6;
				text-align: center;
				min-width: 30px;
				height: 30px;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes {
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input {
				margin: 0 5px;
				width: 100px;
				position: relative;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0 25px 0 8px;
				color: #606266;
				display: inline-block;
				font-size: 13px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
				top: 0;
				position: absolute;
				right: 0;
				height: 100%;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
				cursor: pointer;
				color: #C0C4CC;
				width: 25px;
				font-size: 14px;
				line-height: 28px;
				text-align: center;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__jump {
				margin: 0 0 0 24px;
				color: #606266;
				display: inline-block;
				vertical-align: top;
				font-size: 13px;
				line-height: 28px;
				height: 28px;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input {
				border-radius: 3px;
				padding: 0 2px;
				margin: 0 2px;
				display: inline-block;
				width: 50px;
				font-size: 14px;
				line-height: 18px;
				position: relative;
				text-align: center;
				height: 28px;
			}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
				border: 1px solid #DCDFE6;
				cursor: pointer;
				padding: 0 3px;
				color: #606266;
				display: inline-block;
				font-size: 14px;
				line-height: 28px;
				border-radius: 3px;
				outline: 0;
				background: #FFF;
				width: 100%;
				text-align: center;
				height: 28px;
			}
	
	.news-preview-pv .el-input /deep/ .el-input__inner {
				border: 0;
				border-radius: 8px;
				padding: 0 10px;
				margin: 0;
				outline: none;
				color: #333;
				width: 200px;
				font-size: 14px;
				line-height: 42px;
				height: 42px;
			}
	
	.news-preview-pv .category .item {
				cursor: pointer;
				border-radius: 4px;
				padding: 20px;
				margin: 0 10px 0 0;
				color: #000;
				background: linear-gradient(135deg, #E4D8F4 0%, #B1C8F0 100%);
				width: auto;
				font-size: 14px;
				line-height: 36px;
				text-align: center;
			}
	
	.news-preview-pv .category .item:hover {
				color: #000;
				background: linear-gradient(270deg, #E4D8F4 0%, #B1C8F0 100%);
			}
	
	.news-preview-pv .category .item.active {
				color: #000;
				background: #A293B6;
			}
	
	.news-preview-pv .list9 .item .image {
				object-fit: cover;
				display: block;
				width: 100%;
				transition: 0.3s;
				height: 100%;
			}
	
	.news-preview-pv .list9 .item:hover .image {
				transform: scale(1.1);
			}
	
	.news-preview-pv .list9 .item .info {
				padding: 10px;
				left: 0;
				bottom: -100%;
				background: rgba(0,0,0,.5);
				width: 100%;
				position: absolute;
				transition: 0.3s;
				height: 100%;
			}
	
	.news-preview-pv .list9 .item:hover .info {
				bottom: 0;
			}
</style>
