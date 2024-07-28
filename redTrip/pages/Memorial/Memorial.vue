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
		<u-row style="padding-top: 2%; padding-bottom: 2%;">
			<u-text text="红色纪念馆" bold="true" size="20px"></u-text>
		</u-row>
		
		<view class="water-fall">
			<u-row>
				<u-col span="5">
					<Memorial></Memorial>
				</u-col>
				<u-col span="5" offset="2">
				<Memorial2></Memorial2>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<Memorial3></Memorial3>
				</u-col>
				<u-col span="5" offset="2">
				<Memorial4></Memorial4>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<Memorial5></Memorial5>
				</u-col>
				<u-col span="5" offset="2">
				<Memorial6></Memorial6>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<Memorial7></Memorial7>
				</u-col>
				<u-col span="5" offset="2">
				<Memorial8></Memorial8>
				</u-col>
			</u-row>
		</view>

	</view>
	<Navigation></Navigation>
</template>

<script setup>
	import Memorial from '/components/Memorial/Memorial.vue'
	import Memorial2 from '/components/Memorial/Memorial2.vue'
	import Memorial3 from '/components/Memorial/Memorial3.vue'
	import Memorial4 from '/components/Memorial/Memorial4.vue'
	import Memorial5 from '/components/Memorial/Memorial5.vue'
	import Memorial6 from '/components/Memorial/Memorial6.vue'
	import Memorial7 from '/components/Memorial/Memorial7.vue'
    import Memorial8 from '/components/Memorial/Memorial8.vue'
	import Navigation from '@/components/Navigation/Navigation.vue'
</script>

<style lang="scss">
	page {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding-bottom: 65px; /* 使填充量大于或等于导航栏的高度 */
	}

	.content {
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