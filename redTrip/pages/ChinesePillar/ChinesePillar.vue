<template>
	<u-navbar  @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(0, 0, 0,0.3)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				&lt;
			</view>
		</template>
		<template #center>
			<view class="u-nav-slot">
				中华年柱
			</view>
		</template>
		
		<template #right>
			<view class="u-nav-slot">
				<u-icon  size="40" name="share-square"></u-icon>
			</view>
		</template>
		
	</u-navbar>

	<view>
	

	</view>
	<MessageBox></MessageBox>
</template>

<script setup>
import MessageBox from '@/components/MessageBox/MessageBox.vue'
</script>

<style lang="scss">
page{
	background-image: url(../../static/backgroundImage/ChinesePillarBg.png);
	background-size: cover;
	background-repeat: no-repeat;
	
	
}
.u-navbar .u-nav-slot{
	color: white;
	font-size: 20px;
}
</style>