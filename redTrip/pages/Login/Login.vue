<template>
	<view class="content">
		
		
		<view class="userLogo">
			<view class="userAvatar">
				<u-image :show-loading="true" :src="src" width="70px" height="70px" shape="circle"></u-image>
			</view>
			<!-- <view class="appLogo">
				<u-image :show-loading="true" :src="src" width="150px" height="70px" shape="square"
					radius="10px"></u-image>
			</view> -->
		</view>


		<view class="userLogin">
			<view class="usernameLabel">
				<text>手机号码</text>

				<u-input border="bottom" v-model="user.number" placeholder="请输入手机号码" placeholder-style="color: rgba(168, 168, 168, 1); font-size: 15px;" clearable font-size="30"></u-input>
			</view>
			
			<view class="passwordLabel">
				<text>密码</text>
				<view style="display: flex; align-items: center; position: relative;">
				<u-input border="bottom" v-model="user.password" placeholder="请输入密码" placeholder-style="color: rgba(168, 168, 168, 1); font-size: 15px;" clearable font-size="25"></u-input>
			<img src="/static/index/redtrip.png" class="content-img" />
				</view>
			</view>
			
			<view class="buttonArea">
				<view>
					<u-button @click="login" style="background-color:red;color: white;">登录</u-button>
				</view>

				<view>
					<u-button @click="registerJump" style="background-color: white; color: red;">新用户注册</u-button>
				</view>

			</view>
		</view>
		<view class="moreArea">
			<text>找回密码</text>
			<view class="divider">
				
			</view>
			<text>账号挂失</text>
		</view>
	</view>
</template>

<script setup>
	import {
		ref
	} from 'vue';
	import { userLogin } from '@/request/api.js'
	//这个src到时候是要改的，暂时用一下
	const src = ref('https://cdn.uviewui.com/uview/album/1.jpg');
	const user = ref({
		number:'',
		password:''
	})
	/*
	这个函数用来跳转到注册页面，用navigateTo防止关闭当前页面，因为后续注册可能没注册，还要返回当前页面
	*/
   const login =()=>{
	   userLogin(user.value).then(res=>{
		   console.log(res.data.tokenValue);
		   uni.setStorageSync("Token",res.data.tokenValue)
			console.log(uni.getStorageSync("Token"));
			 // 登录成功后跳转到首页页面
			    uni.navigateTo({
			      url: '/pages/index/index',
			    });
	   })
   }
   
	const registerJump = ()=>{
		uni.navigateTo({
			url:'/pages/Register/Register',
			
		})
	}
	
</script>

<style lang="scss">
	page {
		// background-color: rgb(204, 204, 204);
		background-color: rgba(255, 255, 255, 1);

		display: flex;

		flex-direction: column;
		align-items: center;
		height: 100%;
	}

	.content {
		width: 85%;
		margin-top: 15%;
		height: 100%;
		display: flex;
		flex-direction: column;
		align-items: center;
	}

	.userLogo {
		width: 90%;
		display: flex;
		justify-content: space-between;

	}

	.userLogin {
		margin-top: 25%;
		color: black;
	}

	.userLogin .u-input {
		// background-color: rgb(135, 135, 135);
		color: black;


	}

	.passwordLabel {
		margin-top: 5%;
	}

	.buttonArea {
		margin-top: 10%;
		display: flex;
		justify-content: space-around;

	}

	.buttonArea view {
		width: 40%;
	}

	// .buttonArea .u-button {
	// 	// background-color: rgb(89, 89, 89);
	// 	background-color: rgba(230, 67, 64, 1);
	// 	color: black;
	// }
    
	.buttonArea view:first-child {
		margin-right: 15%;
	}

	.moreArea {
		position: fixed;
		bottom: 5%;
		width: 50%;
		display: flex;
		justify-content: space-around;
	}
	.moreArea text{
		background-color: rgb(255, 255, 255);//框的颜色
		color: black;
	}
	.divider{
		border: 1px solid rgb(144, 144, 144);
	}
	.content-img{
		position: absolute;
		margin-bottom: 10px; 
		margin-left: 210px;
		height: 35px;
		width: 90px;
	}
</style>