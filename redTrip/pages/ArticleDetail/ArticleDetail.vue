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
				<u-image :show-loading="true" src="../../static/NavBarImage/redOrganization.png" width="40px"
					height="40px"></u-image>
			</view>
		</template>
	</u-navbar>
	<view class="content">
		 <u-swiper
		            :list="list3"
		            indicator
		            indicatorMode="line"
		            circular
					height="200px"
					imgMode="scaleToFill"
					style="margin-top: 3%;"
					showTitle="true"
		    ></u-swiper>
			<mp-html :content="html"></mp-html>
	</view>
</template>

<script setup>
	import { ref } from 'vue'
	import { marked } from 'marked'
	const html = ref('# 测试用例')
	html.value = marked(html.value)
	const list3 = ref([{
                    url: 'https://cdn.uviewui.com/uview/resources/video.mp4',
                    title: '昨夜星辰昨夜风，画楼西畔桂堂东',
                    poster: 'https://cdn.uviewui.com/uview/swiper/swiper1.png',
                    type: 'video'
                },{
                    url: 'https://cdn.uviewui.com/uview/swiper/swiper2.png',
                    title: '身无彩凤双飞翼，心有灵犀一点通',
                    type: 'image'
                },{
                    url: 'https://cdn.uviewui.com/uview/swiper/swiper3.png',
                    title: '谁念西风独自凉，萧萧黄叶闭疏窗，沉思往事立残阳'
                }])
	
</script>

<style lang="scss">
	page {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}

	.content {
		width: 95%;
	}	
</style>
