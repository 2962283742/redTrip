<template>
	<view class="articleBody">
		<u-row align="start">
			<u-col span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b250d5f72159ba113befd1.jpg" @click="Explore" width="130px" height="100px" radius="10"></u-image>
			</u-col>
			<u-col span="7" offset="1">
				<u-text text="【探索推荐】巩固拓展主题教育成果 为强国建设民族复兴伟业汇聚强大力量" lines="3"></u-text>
			</u-col>
		</u-row>
		
	</view>
</template>

<script setup>
	name:"Article3"
	import { ref } from 'vue'
	const Explore = ()=>{
		uni.navigateTo({
			url:'/pages/Explore/Explore',
			
		})
	}
</script>

<style>
.articleBody{
	margin-top: 5%;
}
</style>