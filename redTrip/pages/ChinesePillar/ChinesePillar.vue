<template>
	<u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(0, 0, 0,0.3)" placeholder>
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
				<u-icon size="40" name="share-square"></u-icon>
			</view>
		</template>

	</u-navbar>

	<view class="message-area">
		<view class="message-left message-common">
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>

		</view>
		<view class="message-right message-common">
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			


		
		</view>


	</view>
	
	
	
	
	
</template>

<script setup>
	import MessageBox_left from '@/components/MessageBox/MessageBox_left.vue'
	import MessageBox_right from '@/components/MessageBox/MessageBox_right.vue'
	import { ref } from 'vue'
	
	const randMarginLeft = ref('margin-top:20%')
	const rangMarginRight = ref('margin-top:35%')
	
</script>

<style lang="scss">
	page {
		background-image: url(../../static/backgroundImage/ChinesePillarBg.png);
		background-size: cover;
		background-repeat: no-repeat;
		background-attachment: fixed;


	}

	.u-navbar .u-nav-slot {
		color: white;
		font-size: 20px;
	}
	.message-area{
		width: 100%;
		display: flex;
		justify-content: space-around;
		align-items: center;
		height: 600px;
		overflow-y: scr;
	}
	
	.message-common{
		width: 100%;
	}
</style>