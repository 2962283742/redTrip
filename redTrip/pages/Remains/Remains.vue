<template>
	<u-navbar bgColor="rgb(217, 74, 69)" height="50" safeAreaInsetTop placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/index/fiveStars.png" width="30px"
					height="40px"></u-image>
			</view>
		</template>
		<template #right>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/index/redRember.png" width="80px"
					height="20px"></u-image>
			</view>
		</template>
		
		
		<template #center>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/remains/remainTower.png" width="40px"
					height="40px"></u-image>
			</view>
		</template>
	</u-navbar>
	
	<view class="content">
		<view class="tabNavs">
			<u-row justify="space-around">
				<u-col span="3" align="center" justify="center">
					<view class="redRemain tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redRemain.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色会议会址" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="redInsRemain tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redInsRemain.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色机构旧址" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="redRevloation tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redRevloation.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色革命根据地" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="redSchool tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redSchool.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色学校" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
			</u-row>
			<u-row justify="space-around">
				<u-col span="3" align="center" justify="center">
					<view class="cemetery tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/cemetery.png" width="40px"
							height="40px"></u-image>
							<u-text text="革命烈士陵园" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="redLandmark tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/redLandmark.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色地标" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="memorialHall tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/memorialHall.png" width="40px"
							height="40px"></u-image>
							<u-text text="红色纪念馆" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="residence tabNavCenter" >
						<u-image :show-loading="true" src="../../static/remains/residence.png" width="40px"
							height="40px"></u-image>
							<u-text text="红人故居" bold="true" size="10px" class="textToMargin"></u-text>
					</view>
				</u-col>
			</u-row>
		</view>
		<view class="swiper">
			<u-swiper :list="list3" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px"></u-swiper>
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
					<RemainList></RemainList>
				</u-col>
			</u-row>
			<u-row>
				<u-col :span="5" >
					<RemainList></RemainList>
				</u-col>
				<u-col :span="5" offset="2">
					<RemainList></RemainList>
				</u-col>
			</u-row>
		</view>
	</view>
</template>

<script setup>
	import { ref } from 'vue'
	import RemainList from '/components/RemainList/RemainList.vue'
	
	const list3 = ref([
		'https://cdn.uviewui.com/uview/swiper/swiper3.png',
		'https://cdn.uviewui.com/uview/swiper/swiper2.png',
		'https://cdn.uviewui.com/uview/swiper/swiper1.png',
	])
</script>

<style lang="scss">
	.content{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
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
	
	
</style>
