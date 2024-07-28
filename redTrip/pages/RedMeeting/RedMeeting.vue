<template>
	<u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(217, 74, 69, 1.0)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
					height="30px" class="filtered-image1"></u-image>
			</view>
		</template>
		<template #right>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/index/redtrip.png" width="95px"
					height="30px" class="filtered-image"></u-image>
			</view>
		</template>


		
	</u-navbar>
	<view class="content">
		<view class="swiper">
			
			<u-swiper :list="list2" indicator indicatorMode="dot" indicatorActiveColor="rgb(255, 191, 0)" circular radius="10" height="200px"></u-swiper>
		</view>
		<view class="meetingArticle">
			<MeetingComponent></MeetingComponent>
			<MeetingComponent2></MeetingComponent2>
			<MeetingComponent3></MeetingComponent3>
			<MeetingComponent4></MeetingComponent4>
			<MeetingComponent5></MeetingComponent5>
		</view>
	</view>
	<Navigation></Navigation>
</template>

<script setup>
	import {
		ref
	} from 'vue'
	import MeetingComponent from '@/components/MeetingComponent/MeetingComponent.vue'
	import MeetingComponent2 from '@/components/MeetingComponent/MeetingComponent2.vue'
	import MeetingComponent3 from '@/components/MeetingComponent/MeetingComponent3.vue'
	import MeetingComponent4 from '@/components/MeetingComponent/MeetingComponent4.vue'
	import MeetingComponent5 from '@/components/MeetingComponent/MeetingComponent5.vue'
	import Navigation from '@/components/Navigation/Navigation.vue'
	const list2 = ref([
            'https://img.js.design/assets/img/65ae1a177b5ead1b5fd99dc2.jpg#7d933907b84dfbfbf7163a51386523b7',
			'https://img.js.design/assets/img/65ae1a177b5ead1b5fd99dc2.jpg#7d933907b84dfbfbf7163a51386523b7',
			'https://img.js.design/assets/img/65ae1a177b5ead1b5fd99dc2.jpg#7d933907b84dfbfbf7163a51386523b7',
			'https://img.js.design/assets/img/65ae1a177b5ead1b5fd99dc2.jpg#7d933907b84dfbfbf7163a51386523b7',
                ])
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
		width: 90%;
	}
	.filtered-image {
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
	.filtered-image1 {
	  filter: brightness(300%) saturate(0%) contrast(200%);
		}
</style>