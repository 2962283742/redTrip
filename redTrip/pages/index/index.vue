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
			<u-swiper :list="list3" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px"></u-swiper>
		</view>
		<view class="tabNavs">
			<u-row justify="space-around">
				<u-col span="3" align="center" justify="center">
					<view class="chinesePillar" >
						<u-image :show-loading="true" src="../../static/index/chinesePillar.png" @click="chinesePillar" width="50px" height="50px"></u-image>
							<u-text text="中华年柱" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="historyBook" >
						<u-image :show-loading="true" src="../../static/index/historyBook.png" @click="historyBook" width="50px"
							height="50px"></u-image>
							<u-text text="军纪史书" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="longTrip" >
						<u-image :show-loading="true" src="../../static/index/longTrip.png" @click="textToMargin" width="50px"
							height="50px"></u-image>
							<u-text text="漫漫长征" bold="true" size="13px" class="textToMargin"></u-text>
					</view>
				</u-col>
				<u-col span="3" align="center">
					<view class="newTrip" >
						<u-image :show-loading="true" src="../../static/index/newTrip.png" @click="newTrip" width="50px"
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
			<Article2></Article2>
			<Article3></Article3>
			<Article4></Article4>
		</view>
	</view>
	<Navigation></Navigation>
</template>

<script setup>
import { ref } from 'vue'
import Article from '../../components/Article/Article.vue'
import Article2 from '../../components/Article/Article2.vue'
import Article3 from '../../components/Article/Article3.vue'
import Article4 from '../../components/Article/Article4.vue'
import Navigation from '@/components/Navigation/Navigation.vue'

	const list3 = ref([
		'https://img.js.design/assets/img/65b24d46f47a89ca6affb562.png#ec7e0cc30f61d53db5e0c107f3db6525',
		'https://img.js.design/assets/img/65b24d46f47a89ca6affb562.png#ec7e0cc30f61d53db5e0c107f3db6525',
		'https://img.js.design/assets/img/65b24d46f47a89ca6affb562.png#ec7e0cc30f61d53db5e0c107f3db6525',
		'https://img.js.design/assets/img/65b24d46f47a89ca6affb562.png#ec7e0cc30f61d53db5e0c107f3db6525',
	])
	const chinesePillar = ()=>{
		uni.navigateTo({
			url:'/pages/ChinesePillar/ChinesePillar',
			
		})
	}
	const historyBook = ()=>{
		uni.navigateTo({
			url:'/pages/Chronicle/Chronicle',
			
		})
	}
	const textToMargin = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithoutReview/Longmarch',
			
		})
	}
	const newTrip = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithoutReview/Newjourney',
			
		})
	}
</script>

<style scoped>
	.content{
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding-bottom: 65px; /* 使填充量大于或等于导航栏的高度 */
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
	.filtered-image {
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
</style>