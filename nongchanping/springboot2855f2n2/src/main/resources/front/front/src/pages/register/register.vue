<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20231124/ca7faea83f7d45558b36d644e432cfae.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"padding":"20px","boxShadow":"none","margin":"0","borderRadius":"10px","background":"none","width":"600px","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"margin":"0 0 20px 0","color":"#A293B6","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"30px","textShadow":"none","fontWeight":"bold"}'>基于SpringBoot的农产品电商平台注册</p></div>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="nonghuzhanghao">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('nonghuzhanghao')?'required':''">农户账号：</div>
				<el-input v-model="registerForm.nonghuzhanghao"  placeholder="请输入农户账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="mima">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="mima2">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="nonghuxingming">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('nonghuxingming')?'required':''">农户姓名：</div>
				<el-input v-model="registerForm.nonghuxingming"  placeholder="请输入农户姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="xingbie">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in nonghuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="nonghudianhua">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('nonghudianhua')?'required':''">农户电话：</div>
				<el-input v-model="registerForm.nonghudianhua"  placeholder="请输入农户电话" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='nonghu'" prop="touxiang">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="nonghutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="yonghuzhanghao">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('yonghuzhanghao')?'required':''">用户账号：</div>
				<el-input v-model="registerForm.yonghuzhanghao"  placeholder="请输入用户账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima2">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="yonghuxingming">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('yonghuxingming')?'required':''">用户姓名：</div>
				<el-input v-model="registerForm.yonghuxingming"  placeholder="请输入用户姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="xingbie">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yonghuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="yonghudianhua">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('yonghudianhua')?'required':''">用户电话：</div>
				<el-input v-model="registerForm.yonghudianhua"  placeholder="请输入用户电话" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="touxiang">
				<div v-if="true" :style='{"width":"94px","lineHeight":"44px","fontSize":"14px","color":"#000"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="yonghutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"none","margin":"20px auto 5px","color":"#fff","display":"block","outline":"none","borderRadius":"30px","background":"#A293B6","width":"80%","fontSize":"24px","height":"50px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 6px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"none","outline":"none","borderRadius":"8px","background":"rgba(64, 158, 255, 1)","width":"80%","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","color":"#A293B6","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"2","fontSize":"14px","textDecoration":"none","fontWeight":"bold"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"40px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            nonghuxingbieOptions: [],
            yonghuxingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			
			this.tableName = this.$route.query.role;
			if(this.tableName=='nonghu'){
				this.registerForm = {
					nonghuzhanghao: '',
					mima: '',
					mima2: '',
					nonghuxingming: '',
					xingbie: '',
					nonghudianhua: '',
					touxiang: '',
					money: '',
				}
			}
			if(this.tableName=='yonghu'){
				this.registerForm = {
					yonghuzhanghao: '',
					mima: '',
					mima2: '',
					yonghuxingming: '',
					xingbie: '',
					yonghudianhua: '',
					touxiang: '',
					money: '',
					vip: '',
				}
			}
			if ('nonghu' == this.tableName) {
				this.requiredRules.nonghuzhanghao = [{ required: true, message: '请输入农户账号', trigger: 'blur' }]
			}
			if ('nonghu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('nonghu' == this.tableName) {
				this.requiredRules.nonghuxingming = [{ required: true, message: '请输入农户姓名', trigger: 'blur' }]
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }]
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.yonghuxingming = [{ required: true, message: '请输入用户姓名', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('nonghu' == this.tableName) {
			this.rules.nonghuzhanghao = [{ required: true, message: '请输入农户账号', trigger: 'blur' }];
		  }
		  if ('nonghu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('nonghu' == this.tableName) {
			this.rules.nonghuxingming = [{ required: true, message: '请输入农户姓名', trigger: 'blur' }];
		  }
			this.nonghuxingbieOptions = "男,女".split(',');
		  if ('nonghu' == this.tableName) {
			this.rules.nonghudianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('nonghu' == this.tableName) {
			this.rules.money = [{ required: true, validator: this.$validate.isNumber, trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.yonghuxingming = [{ required: true, message: '请输入用户姓名', trigger: 'blur' }];
		  }
			this.yonghuxingbieOptions = "男,女".split(',');
		  if ('yonghu' == this.tableName) {
			this.rules.yonghudianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.money = [{ required: true, validator: this.$validate.isNumber, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      nonghutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      yonghutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.nonghuzhanghao) && `nonghu` == this.tableName){
					this.$message.error(`农户账号不能为空`);
					return
				}
               if(`nonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `nonghu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.nonghuxingming) && `nonghu` == this.tableName){
					this.$message.error(`农户姓名不能为空`);
					return
				}
					if(`nonghu` == this.tableName && this.registerForm.nonghudianhua &&(!this.$validate.isMobile2(this.registerForm.nonghudianhua))){
						this.$message.error(`农户电话应输入手机格式`);
						return
					}
				if((!this.registerForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$message.error(`用户账号不能为空`);
					return
				}
               if(`yonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `yonghu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$message.error(`用户姓名不能为空`);
					return
				}
					if(`yonghu` == this.tableName && this.registerForm.yonghudianhua &&(!this.$validate.isMobile2(this.registerForm.yonghudianhua))){
						this.$message.error(`用户电话应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20231124/ca7faea83f7d45558b36d644e432cfae.png);
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: flex;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #A293B6;
						border-radius: 30px;
						padding: 0 10px;
						box-shadow: none;
						outline: none;
						color: #000;
						background: rgba(255,255,255,.8);
						width: 400px;
						font-size: 14px;
						height: 50px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #A293B6;
						border-radius: 30px;
						padding: 0 10px;
						box-shadow: none;
						outline: none;
						color: #000;
						background: rgba(255,255,255,.8);
						width: 400px;
						font-size: 14px;
						height: 50px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #A293B6;
						border-radius: 30px;
						padding: 0 10px 0 30px;
						box-shadow: none;
						outline: none;
						color: #000;
						background: rgba(255,255,255,.8);
						width: 400px;
						font-size: 14px;
						height: 50px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #A293B6;
						border-radius: 30px;
						padding: 0 10px 0 30px;
						box-shadow: none;
						outline: none;
						color: #000;
						background: rgba(255,255,255,.8);
						width: 400px;
						font-size: 14px;
						height: 50px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid #A293B6;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #A293B6;
		  		  background: rgba(255,255,255,.8);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid #A293B6;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #A293B6;
		  		  background: rgba(255,255,255,.8);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid #A293B6;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #A293B6;
		  		  background: rgba(255,255,255,.8);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: -15px;
				position: absolute;
				content: "*";
			}
</style>
