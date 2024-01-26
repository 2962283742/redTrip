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
	</u-navbar>

	<view class="content">
		<view class="swiper">
			<u-swiper :list="list3" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px"></u-swiper>
		</view>
		<view class="tabNavs">
			<u-row justify="space-around">
				<u-col span="3" align="center" justify="center">
					<view class="chinesePillar" >
						<u-image :show-loading="true" src="../../static/index/chinesePillar.png" width="50px"
							height="50px"></u-image>
							<u-text text="中华年柱" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="historyBook" >
						<u-image :show-loading="true" src="../../static/index/historyBook.png" width="50px"
							height="50px"></u-image>
							<u-text text="军纪史书" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="longTrip" >
						<u-image :show-loading="true" src="../../static/index/longTrip.png" width="50px"
							height="50px"></u-image>
							<u-text text="漫漫长征" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="newTrip" >
						<u-image :show-loading="true" src="../../static/index/newTrip.png" width="50px"
							height="50px"></u-image>
							<u-text text="新的征程" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
			</u-row>
			
		</view>
		<view class="exploreRecommend">
			<view class="logoAndText">
				<u-row justify="start">
					<u-col justify="start" span="4">
						<u-image :show-loading="true" src="../../static/index/fire.png" width="30px"
							height="30px"></u-image>
							
					</u-col>
					<u-col justify="start">
						<u-text text="探索推荐" bold="true" size="20px" class="textToMargin"></u-text>
					</u-col>
				</u-row>
			</view>
			
		</view>
		<view class="articles">
			<Article></Article>
			<Article></Article>
			<Article></Article>
			<Article></Article>
		</view>
	</view>
</template>

<script setup>
	import {
		ref
	} from 'vue'
	import Article from '../../components/Article.vue'

	const list3 = ref([
		'https://cdn.uviewui.com/uview/swiper/swiper3.png',
		'https://cdn.uviewui.com/uview/swiper/swiper2.png',
		'https://cdn.uviewui.com/uview/swiper/swiper1.png',
	])
</script>

<style scoped>
	.content{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;

		
	}
	.swiper{
		width: 95%;
		margin-top: 3%;
	}
	.tabNavs{
		width: 95%;
		margin-top: 3%;
		
	}
	.exploreRecommend{
		width: 95%;
		display: inherit;
		margin-top: 5%;
	}
	.articles{
		width: 95%;
	}
	
</style>