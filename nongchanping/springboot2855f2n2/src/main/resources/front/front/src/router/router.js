import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import nonghuList from '../pages/nonghu/list'
import nonghuDetail from '../pages/nonghu/detail'
import nonghuAdd from '../pages/nonghu/add'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import chanpinfenleiList from '../pages/chanpinfenlei/list'
import chanpinfenleiDetail from '../pages/chanpinfenlei/detail'
import chanpinfenleiAdd from '../pages/chanpinfenlei/add'
import wenzhangfenleiList from '../pages/wenzhangfenlei/list'
import wenzhangfenleiDetail from '../pages/wenzhangfenlei/detail'
import wenzhangfenleiAdd from '../pages/wenzhangfenlei/add'
import zhunongshangpinList from '../pages/zhunongshangpin/list'
import zhunongshangpinDetail from '../pages/zhunongshangpin/detail'
import zhunongshangpinAdd from '../pages/zhunongshangpin/add'
import zhunongtuopinList from '../pages/zhunongtuopin/list'
import zhunongtuopinDetail from '../pages/zhunongtuopin/detail'
import zhunongtuopinAdd from '../pages/zhunongtuopin/add'
import nongjixuetangList from '../pages/nongjixuetang/list'
import nongjixuetangDetail from '../pages/nongjixuetang/detail'
import nongjixuetangAdd from '../pages/nongjixuetang/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discusszhunongshangpinList from '../pages/discusszhunongshangpin/list'
import discusszhunongshangpinDetail from '../pages/discusszhunongshangpin/detail'
import discusszhunongshangpinAdd from '../pages/discusszhunongshangpin/add'
import discusszhunongtuopinList from '../pages/discusszhunongtuopin/list'
import discusszhunongtuopinDetail from '../pages/discusszhunongtuopin/detail'
import discusszhunongtuopinAdd from '../pages/discusszhunongtuopin/add'
import discussnongjixuetangList from '../pages/discussnongjixuetang/list'
import discussnongjixuetangDetail from '../pages/discussnongjixuetang/detail'
import discussnongjixuetangAdd from '../pages/discussnongjixuetang/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'nonghu',
					component: nonghuList
				},
				{
					path: 'nonghuDetail',
					component: nonghuDetail
				},
				{
					path: 'nonghuAdd',
					component: nonghuAdd
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'chanpinfenlei',
					component: chanpinfenleiList
				},
				{
					path: 'chanpinfenleiDetail',
					component: chanpinfenleiDetail
				},
				{
					path: 'chanpinfenleiAdd',
					component: chanpinfenleiAdd
				},
				{
					path: 'wenzhangfenlei',
					component: wenzhangfenleiList
				},
				{
					path: 'wenzhangfenleiDetail',
					component: wenzhangfenleiDetail
				},
				{
					path: 'wenzhangfenleiAdd',
					component: wenzhangfenleiAdd
				},
				{
					path: 'zhunongshangpin',
					component: zhunongshangpinList
				},
				{
					path: 'zhunongshangpinDetail',
					component: zhunongshangpinDetail
				},
				{
					path: 'zhunongshangpinAdd',
					component: zhunongshangpinAdd
				},
				{
					path: 'zhunongtuopin',
					component: zhunongtuopinList
				},
				{
					path: 'zhunongtuopinDetail',
					component: zhunongtuopinDetail
				},
				{
					path: 'zhunongtuopinAdd',
					component: zhunongtuopinAdd
				},
				{
					path: 'nongjixuetang',
					component: nongjixuetangList
				},
				{
					path: 'nongjixuetangDetail',
					component: nongjixuetangDetail
				},
				{
					path: 'nongjixuetangAdd',
					component: nongjixuetangAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discusszhunongshangpin',
					component: discusszhunongshangpinList
				},
				{
					path: 'discusszhunongshangpinDetail',
					component: discusszhunongshangpinDetail
				},
				{
					path: 'discusszhunongshangpinAdd',
					component: discusszhunongshangpinAdd
				},
				{
					path: 'discusszhunongtuopin',
					component: discusszhunongtuopinList
				},
				{
					path: 'discusszhunongtuopinDetail',
					component: discusszhunongtuopinDetail
				},
				{
					path: 'discusszhunongtuopinAdd',
					component: discusszhunongtuopinAdd
				},
				{
					path: 'discussnongjixuetang',
					component: discussnongjixuetangList
				},
				{
					path: 'discussnongjixuetangDetail',
					component: discussnongjixuetangDetail
				},
				{
					path: 'discussnongjixuetangAdd',
					component: discussnongjixuetangAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
