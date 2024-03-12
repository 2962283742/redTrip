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
		<u-row style="padding-top: 2%; padding-bottom: 2%;">
			<u-text text="红色机构旧址" bold="true" size="20px"></u-text>
		</u-row>
		
		<view class="water-fall">
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
			</u-row>
			<u-row>
				<u-col span="5">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
				<u-col span="5" offset="2">
					<WaterFallConpoment></WaterFallConpoment>
				</u-col>
			</u-row>
		</view>

	</view>
</template>

<script setup>
	import WaterFallConpoment from '/components/WaterFallConpoment/WaterFallConpoment.vue'

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
	}
</style>