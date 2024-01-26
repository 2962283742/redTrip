<template>


	<view class="content">
		<view class="leftIcon" @click="returnFun">
			&lt;
			
		</view>
		<view class="registerText">
			新用户注册
		</view>
		
		<view class="registerArea">
			<view class="numberArea" v-if="nextStep">
				<text>手机号码</text>
				<u-input border="bottom" v-model="value" clearable  placeholder="请输入手机号码"></u-input>
				<u-button text="下一步" @click="nextStepFun"></u-button>
				<u-radio-group v-model="choice">
					<u-radio name="yes" shape="circle" label="已阅读并同意“服务协议”和“隐私权政策”" size="10px"></u-radio>
				</u-radio-group>
			</view>
			
			<view class="surePasswordArea" v-if="!nextStep">
				<view class="usernameLabel">
					<text>密码</text>
					<u-input border="bottom" v-model="value" clearable font-size="25"></u-input>
				</view>
				<view class="passwordLabel">
					<text>确认密码</text>
					<u-input border="bottom" v-model="value" type="password" clearable font-size="25"></u-input>
				</view>
				<u-button text="完成注册"></u-button>
			</view>
		</view>
	</view>
</template>

<script setup>
import { ref } from 'vue'
const choice = ref('no')
//nextStep用于判定是否显示surePasswordArea和numberArea
const nextStep = ref(1)
/*
点击下一步就改nextStep
*/
const nextStepFun = ()=>{
	nextStep.value=0;
}
/*
判断当前页面返回到哪个页面

*/
const returnFun = ()=>{
	if(nextStep.value==0){
		nextStep.value=1;
	}else{
		uni.navigateBack()
	}
}
</script>

<style lang="scss">
	page {
		background-color: rgb(204, 204, 204);
		display: flex;

		flex-direction: column;
		align-items: center;
		height: 100%;
	}

	.content {
		margin-top: 5%;
		width: 85%;
	}
	.leftIcon{
		width: 100%;
		font-size: 35px;
		color: rgb(166, 166, 166);
	}
	.registerText{
		font-size: 25px;
		color: white;
		margin-top: 5%;
	}
	.registerArea{
		margin-top: 15%;
	}
	.registerArea{
		color: white;
	}
	.numberArea .u-button{
		margin-top:10%;
		background-color: rgb(89, 89, 89);
		
	}
	.numberArea .u-radio-group{
		margin-top: 3%;
		
	}
	.passwordLabel {
		margin-top: 5%;
	}
	.surePasswordArea .u-button{
		margin-top:10%;
		background-color: rgb(89, 89, 89);
		color: white;
		
	}
</style>