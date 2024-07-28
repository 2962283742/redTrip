<template>
	<u-navbar bgColor="rgb(217, 74, 69)" height="50" safeAreaInsetTop placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/index/redtrip.png" width="95px"
					height="30px" class="filtered-image"></u-image>
			</view>
		</template>
		
	</u-navbar>
	
	<view class="content">
		<view class="swiper">
			<u-swiper :list="list3" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px">
				
				
				<template v-slot="{ item }">
				        <u-video v-if="isVideo(item)" :src="item" width="100%" height="200px"></u-video>
				        <u-image v-else :show-loading="true" :src="item" width="100%" height="200px"></u-image>
				      </template>
					  
					  
			</u-swiper>
		</view>
		
		<view class="tabNavs">
			

			<u-row justify="space-around">
				
				<u-col span="3" align="center" justify="center">
					<view class="redRemain tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redRemain.png" @click="redRemain" width="40px"
							height="40px"></u-image>
							<u-text text="红色会议会址" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				
				<u-col span="3" align="center">
					<view class="redLandmark tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redLandmark.png" @click="redLandmark" width="40px"
							height="40px"></u-image>
							<u-text text="红色地标" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				
				<u-col span="3" align="center">
					<view class="redRevloation tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redRevloation.png" @click="redRevloation" width="40px"
							height="40px"></u-image>
							<u-text text="红色革命根据地" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				
				
				<u-col span="3" align="center">
					<view class="memorialHall tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/memorialHall.png" @click="memorialHall" width="40px"
							height="40px"></u-image>
							<u-text text="红色纪念馆" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				
			</u-row>
			
			
			<u-row justify="space-around">
			</u-row>
			
			
		</view>
		
		
		<view class="listOfRemain">
			<view class="logoAndText">
				<u-row justify="start">
					<u-col justify="start" span="4">
						<u-image :show-loading="true" src="../../static/remains/listOfRemain.png" width="30px"
							height="30px"></u-image>
							
					</u-col>
					<u-col justify="start">
						<u-text text="遗迹排行榜" bold="true" size="20px" class="textToMargin"></u-text>
					</u-col>
				</u-row>
			</view>
			
		</view>
		<view class="remainList">
			<u-row>
				<u-col :span="5" >
					<RemainList></RemainList>
				</u-col>
				<u-col :span="5" offset="2">
					<RemainList2></RemainList2>
				</u-col>
			</u-row>
			<u-row>
				<u-col :span="5" >
					<RemainList3></RemainList3>
				</u-col>
				<u-col :span="5" offset="2">
					<RemainList4></RemainList4>
				</u-col>
			</u-row>
		</view>
	</view>
	<Navigation></Navigation>
</template>

<script setup>
	import { ref } from 'vue'
	import RemainList from '/components/RemainList/RemainList.vue'
	import RemainList2 from '/components/RemainList/RemainList2.vue'
	import RemainList3 from '/components/RemainList/RemainList3.vue'
	import RemainList4 from '/components/RemainList/RemainList4.vue'
	import Navigation from '@/components/Navigation/Navigation.vue'
	
	const list3 = ref([
		'https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4'
		// 'https://www.w3schools.com/html/mov_bbb.mp4',
		// 'https://cdn.uviewui.com/uview/swiper/swiper3.png',
		// 'https://cdn.uviewui.com/uview/swiper/swiper2.png',
		// 'https://cdn.uviewui.com/uview/swiper/swiper1.png'
		
	])
	const isVideo = (item) => {
	  return item.endsWith('.mp4')
	}
	const redRemain = ()=>{
		uni.navigateTo({
			url:'/pages/RedMeeting/RedMeeting',
			
		})
	}
	const redLandmark = ()=>{
		uni.navigateTo({
			url:'/pages/Landmark/Landmark',
			
		})
	}
	const redRevloation = ()=>{
		uni.navigateTo({
			url:'/pages/WaterFallPage/WaterFallPage',
			
		})
	}
	const memorialHall = ()=>{
		uni.navigateTo({
			url:'/pages/Memorial/Memorial',
			
		})
	} 
</script>

<style lang="scss">
	.content{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding-bottom: 55px; /* 使填充量大于或等于导航栏的高度 */
	}
	.tabNavs{
		width: 95%;
		margin-top: 3%;
		
	}
	.tabNavCenter{
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
		margin-top: 10%;
	}
	.swiper{
		width: 95%;
		margin-top: 3%;
	}
	.listOfRemain{
		width: 95%;
		display: inherit;
		margin-top: 5%;
	}
	.remainList{
		width: 95%;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		margin-bottom: 5%;
	}
	.remainList .u-row{
		width: 100%;
		margin-top: 5%;
	}
	.filtered-image {  
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
	
</style>
