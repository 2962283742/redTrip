<template>
	<view class="content">
		<view class="userInfo">
			<view class="userAvatar">
				<u-row justify="space-between">
					<u-col span="3">
						<u-image :show-loading="true" :src="src" width="90px" height="90px" shape="circle"></u-image>
					</u-col>
					<u-col span="3">
						<u-button type="primary" shape="circle" text="编辑资料" color="rgb(217, 74, 69)" @click="jumpToEditInfo"></u-button>
					</u-col>
				</u-row>
			</view>

			<view class="username">
				<u-row justify="start">
					<u-col span="12">雲初</u-col>
				</u-row>
			</view>
			<view class="ownStatement">
				<u-rwo justify="start">

					<u-text text="个性签名：你再温柔些，月亮会融化，我也会~~~~" lines="1" color="rgb(148, 148, 148)" size="10"></u-text>
				</u-rwo>
			</view>
		</view>
		
		<view class="chooseTabbar">
			<view class="history bar" @click="jumpToVisitRecord">
				<u-row justify="space-around">
					<u-col span="2">
						<u-image :show-loading="true" src="../../static/ownIcon/history.png" width="30px" height="30px"></u-image>
					</u-col>
					<u-col span="9">
						<u-text text="历史记录" bold="true" size="20px"></u-text>
					</u-col>
					<u-col span="1" justify="end">
						<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
					</u-col>
				</u-row>
			</view>
			<view class="collection bar" @click="jumpToCollection">
				<u-row justify="space-around">
					<u-col span="2">
						<u-image :show-loading="true" src="../../static/ownIcon/collection.png" width="30px" height="30px" ></u-image>
					</u-col>
					<u-col span="9">
						<u-text text="我的收藏" bold="true" size="20px"></u-text>
					</u-col>
					<u-col span="1" justify="end">
						<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
					</u-col>
				</u-row>
			</view>
			<view class="star bar" @click="jumpToLike">
				<u-row justify="space-around">
					<u-col span="2">
						<u-image :show-loading="true" src="../../static/ownIcon/star.png" width="30px" height="30px"></u-image>
					</u-col>
					<u-col span="9">
						<u-text text="我的喜欢" bold="true" size="20px"></u-text>
					</u-col>
					<u-col span="1" justify="end">
						<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
					</u-col>
				</u-row>
			</view>
			<view class="setting bar" @click="jumpToSetting">
				<u-row justify="space-around">
					<u-col span="2">
						<u-image :show-loading="true" src="../../static/ownIcon/set.png" width="30px" height="30px"></u-image>
					</u-col>
					<u-col span="9">
						<u-text text="设置" bold="true" size="20px"></u-text>
					</u-col>
					<u-col span="1" justify="end">
						<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
					</u-col>
				</u-row>
			</view>
		</view>
	</view>
</template>

<script setup>	
	import {
		ref
	} from 'vue'
	const src = ref('https://q1.qlogo.cn/g?b=qq&nk=3198841971&s=100')
	
	
	const jumpToSetting = ()=>{
		uni.navigateTo({
			url:'/pages/Setting/Setting'
		})
	}
	const jumpToVisitRecord = ()=>{
		uni.navigateTo({
			url:'/pages/VisitRecord/VisitRecord'
		})
	}
	
	const jumpToEditInfo = ()=>{
		uni.navigateTo({
			url:'/pages/OwnInfo/OwnInfo'
		})
	}
	
	const jumpToCollection = ()=>{
		uni.navigateTo({
			url:'/pages/MyCollection/MyCollection'
		})
	}
	const jumpToLike = ()=>{
		uni.navigateTo({
			url:'/pages/MyLike/MyLike'
		})
	}
</script>

<style lang="scss">
	page {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}

	.content {
		width: 90%;
	}

	.userInfo {
		margin-top: 10%;
	}

	.username {
		margin-top: 3%;
		font-size: 25px;
		font-weight: bold;
		word-spacing: 30px;
	}

	.ownStatement {
		margin-top: 3%;
	}
	.chooseTabbar{
		margin-top: 10%;
	}
	.bar{
		margin-top: 10%;
	}
</style>