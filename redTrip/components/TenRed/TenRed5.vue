<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f58ff47a89ca6af3cee0.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>古田会议纪念馆纪念馆</h3>
				<u-text text="位于福建省龙岩市上杭县，纪念馆以古田会议会址为依托建立的集文物收藏、资料研究和宣传教育为一体的场馆。在这个地方收藏了馆藏文物20000余件，三级以上文物藏品2028件，收藏采访资料600多份、图书资料1万余册。是国家一级博物馆，并且也是国家4A级旅游景区。喜欢古田文化的可以到这个地方参观。" lines="3"></u-text>
			</u-col>
			
		</u-row>
	</view>
</template>

<script setup>
name:"TenRed"
import { ref } from 'vue'
	
</script>

<style lang="scss">
.card{
	margin-top: 5%;
	margin-bottom: 5%;
}
h3{
	margin-bottom: 5px;
}
</style>