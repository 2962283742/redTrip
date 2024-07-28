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
			<u-text text="红色革命根据地" bold="true" size="20px"></u-text>
		</u-row>
		
		<view class="water-fall">
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
				<WaterFallConpoment2></WaterFallConpoment2>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<WaterFallConpoment3></WaterFallConpoment3>
				</u-col>
				<u-col span="5" offset="2">
				<WaterFallConpoment4></WaterFallConpoment4>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<WaterFallConpoment5></WaterFallConpoment5>
				</u-col>
				<u-col span="5" offset="2">
				<WaterFallConpoment6></WaterFallConpoment6>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
				<WaterFallConpoment7></WaterFallConpoment7>
				</u-col>
				<u-col span="5" offset="2">
				<WaterFallConpoment8></WaterFallConpoment8>
				</u-col>
			</u-row>
		</view>

	</view>
	<Navigation></Navigation>
</template>

<script setup>
	import WaterFallConpoment from '/components/WaterFallConpoment/WaterFallConpoment.vue'
	import WaterFallConpoment2 from '/components/WaterFallConpoment/WaterFallConpoment2.vue'
	import WaterFallConpoment3 from '/components/WaterFallConpoment/WaterFallConpoment3.vue'
	import WaterFallConpoment4 from '/components/WaterFallConpoment/WaterFallConpoment4.vue'
	import WaterFallConpoment5 from '/components/WaterFallConpoment/WaterFallConpoment5.vue'
	import WaterFallConpoment6 from '/components/WaterFallConpoment/WaterFallConpoment6.vue'
	import WaterFallConpoment7 from '/components/WaterFallConpoment/WaterFallConpoment7.vue'
	import WaterFallConpoment8 from '/components/WaterFallConpoment/WaterFallConpoment8.vue'
	import Navigation from '@/components/Navigation/Navigation.vue'

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
		padding-bottom: 70px; /* 使填充量大于或等于导航栏的高度 */
	}
	.filtered-image {
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
	.filtered-image1 {
	  filter: brightness(300%) saturate(0%) contrast(200%);
		}
</style>