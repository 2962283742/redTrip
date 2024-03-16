<template>
	<u-navbar bgColor="rgb(217, 74, 69)" height="50" safeAreaInsetTop placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
					height="30px"></u-image>
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
				<u-image :show-loading="true" src="../../static/redMetting/redMeetingTitle.png" width="40px"
					height="40px"></u-image>
			</view>
		</template>
	</u-navbar>
	<view class="content">
		<view class="swiper">
			
			<u-swiper :list="list2" keyName="image" showTitle :autoplay="false" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px" imgMode="scaleToFill"></u-swiper>
		</view>
		<view class="meetingArticle">
			<MeetingComponent></MeetingComponent>
			<MeetingComponent></MeetingComponent>
			<MeetingComponent></MeetingComponent>
			<MeetingComponent></MeetingComponent>
		</view>
	</view>
</template>

<script setup>
	import {
		ref
	} from 'vue'
	import MeetingComponent from '@/components/MeetingComponent/MeetingComponent.vue'
	const list2 = ref([{
                    image: 'https://cdn.uviewui.com/uview/swiper/swiper2.png',
                    title: '昨夜星辰昨夜风，画楼西畔桂堂东',
                },{
                    image: 'https://cdn.uviewui.com/uview/swiper/swiper1.png',
                    title: '身无彩凤双飞翼，心有灵犀一点通'
                },{
                    image: 'https://cdn.uviewui.com/uview/swiper/swiper3.png',
                    title: '谁念西风独自凉，萧萧黄叶闭疏窗，沉思往事立残阳'
                }])
</script>

<style lang="scss">
	.content {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}

	.swiper {
		width: 95%;
		margin-top: 2%;
	}

	.meetingArticle {
		width: 95%;
	}
</style>