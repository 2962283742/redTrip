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
			<u-text text="红色地标" bold="true" size="20px"></u-text>
		</u-row>
		
		<view class="water-fall">
			<u-row>
				<u-col>
					<Landmark></Landmark>
					<Landmark2></Landmark2>
					<Landmark3></Landmark3>
					<Landmark4></Landmark4>
				</u-col>
				
			</u-row>
		</view>

	</view>
	<Navigation></Navigation>
</template>

<script setup>
	import { ref } from 'vue'
	import Landmark from '/components/Landmark/Landmark.vue'
	import Landmark2 from '/components/Landmark/Landmark2.vue'
	import Landmark3 from '/components/Landmark/Landmark3.vue'
	import Landmark4 from '/components/Landmark/Landmark4.vue'
	import Navigation from '@/components/Navigation/Navigation.vue'
	

</script>

<style lang="scss">
	page {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding-bottom: 75px; /* 使填充量大于或等于导航栏的高度 */
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