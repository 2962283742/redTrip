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
			<MessageBox_left2 :style="randMarginLeft"></MessageBox_left2>
			<MessageBox_left3 :style="randMarginLeft"></MessageBox_left3>
			<MessageBox_left4 :style="randMarginLeft"></MessageBox_left4>
			<MessageBox_left5 :style="randMarginLeft"></MessageBox_left5>
			<MessageBox_left :style="randMarginLeft"></MessageBox_left>
			<MessageBox_left6 :style="randMarginLeft"></MessageBox_left6>
			<MessageBox_left7 :style="randMarginLeft"></MessageBox_left7>
			<MessageBox_left8 :style="randMarginLeft"></MessageBox_left8>
			<MessageBox_left9 :style="randMarginLeft"></MessageBox_left9>
			<MessageBox_left10 :style="randMarginLeft"></MessageBox_left10>
			<MessageBox_left11 :style="randMarginLeft"></MessageBox_left11>
			<MessageBox_left12 :style="randMarginLeft"></MessageBox_left12>
			<MessageBox_left13 :style="randMarginLeft"></MessageBox_left13>
			<MessageBox_left14 :style="randMarginLeft"></MessageBox_left14>
			<MessageBox_left15 :style="randMarginLeft"></MessageBox_left15>
			<MessageBox_left16 :style="randMarginLeft"></MessageBox_left16>
			<MessageBox_left17 :style="randMarginLeft"></MessageBox_left17>
			<MessageBox_left18 :style="randMarginLeft"></MessageBox_left18>
			

		</view>
		<view class="message-right message-common">
			<MessageBox_right :style="rangMarginRight"></MessageBox_right>
			<MessageBox_right2 :style="rangMarginRight"></MessageBox_right2>
			<MessageBox_right3 :style="rangMarginRight"></MessageBox_right3>
			<MessageBox_right4 :style="rangMarginRight"></MessageBox_right4>
			<MessageBox_right5 :style="rangMarginRight"></MessageBox_right5>
			<MessageBox_right6 :style="rangMarginRight"></MessageBox_right6>
			<MessageBox_right7 :style="rangMarginRight"></MessageBox_right7>
			<MessageBox_right8 :style="rangMarginRight"></MessageBox_right8>
			<MessageBox_right9 :style="rangMarginRight"></MessageBox_right9>
			<MessageBox_right10 :style="rangMarginRight"></MessageBox_right10>
			<MessageBox_right11 :style="rangMarginRight"></MessageBox_right11>
			<MessageBox_right12 :style="rangMarginRight"></MessageBox_right12>
			<MessageBox_right13 :style="rangMarginRight"></MessageBox_right13>
			<MessageBox_right14 :style="rangMarginRight"></MessageBox_right14>
			<MessageBox_right15 :style="rangMarginRight"></MessageBox_right15>
			<MessageBox_right16 :style="rangMarginRight"></MessageBox_right16>
			<MessageBox_right17 :style="rangMarginRight"></MessageBox_right17>
			
		</view>


	</view>
	
</template>

<script setup>
	import MessageBox_left from '@/components/MessageBox_left/MessageBox_left.vue'
	import MessageBox_left2 from '@/components/MessageBox_left/MessageBox_left2.vue'
	import MessageBox_left3 from '@/components/MessageBox_left/MessageBox_left3.vue'
	import MessageBox_left4 from '@/components/MessageBox_left/MessageBox_left4.vue'
	import MessageBox_left5 from '@/components/MessageBox_left/MessageBox_left5.vue'
	import MessageBox_left6 from '@/components/MessageBox_left/MessageBox_left6.vue'
	import MessageBox_left7 from '@/components/MessageBox_left/MessageBox_left7.vue'
	import MessageBox_left8 from '@/components/MessageBox_left/MessageBox_left8.vue'
	import MessageBox_left9 from '@/components/MessageBox_left/MessageBox_left9.vue'
	import MessageBox_left10 from '@/components/MessageBox_left/MessageBox_left10.vue'
	import MessageBox_left11 from '@/components/MessageBox_left/MessageBox_left11.vue'
	import MessageBox_left12 from '@/components/MessageBox_left/MessageBox_left12.vue'
	import MessageBox_left13 from '@/components/MessageBox_left/MessageBox_left13.vue'
	import MessageBox_left14 from '@/components/MessageBox_left/MessageBox_left14.vue'
	import MessageBox_left15 from '@/components/MessageBox_left/MessageBox_left15.vue'
	import MessageBox_left16 from '@/components/MessageBox_left/MessageBox_left16.vue'
	import MessageBox_left17 from '@/components/MessageBox_left/MessageBox_left17.vue'
	import MessageBox_left18 from '@/components/MessageBox_left/MessageBox_left18.vue'
	
	
	import MessageBox_right from '@/components/MessageBox_right/MessageBox_right.vue'
	import MessageBox_right2 from '@/components/MessageBox_right/MessageBox_right2.vue'
	import MessageBox_right3 from '@/components/MessageBox_right/MessageBox_right3.vue'
	import MessageBox_right4 from '@/components/MessageBox_right/MessageBox_right4.vue'
	import MessageBox_right5 from '@/components/MessageBox_right/MessageBox_right5.vue'
	import MessageBox_right6 from '@/components/MessageBox_right/MessageBox_right6.vue'
	import MessageBox_right7 from '@/components/MessageBox_right/MessageBox_right7.vue'
	import MessageBox_right8 from '@/components/MessageBox_right/MessageBox_right8.vue'
	import MessageBox_right9 from '@/components/MessageBox_right/MessageBox_right9.vue'
	import MessageBox_right10 from '@/components/MessageBox_right/MessageBox_right10.vue'
	import MessageBox_right11 from '@/components/MessageBox_right/MessageBox_right11.vue'
	import MessageBox_right12 from '@/components/MessageBox_right/MessageBox_right12.vue'
	import MessageBox_right13 from '@/components/MessageBox_right/MessageBox_right13.vue'
	import MessageBox_right14 from '@/components/MessageBox_right/MessageBox_right14.vue'
	import MessageBox_right15 from '@/components/MessageBox_right/MessageBox_right15.vue'
	import MessageBox_right16 from '@/components/MessageBox_right/MessageBox_right16.vue'
	import MessageBox_right17 from '@/components/MessageBox_right/MessageBox_right17.vue'
	
	import { ref } from 'vue'
	
	const randMarginLeft = ref('margin-top:12%')
	const rangMarginRight = ref('margin-top:16%')
	
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
		height: 1000px;
		overflow-y: scr;
	}
	
	.message-common{
		width: 100%;
	}
</style>