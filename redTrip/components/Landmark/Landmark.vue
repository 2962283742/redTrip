<template>
	<view class="card-body">
		<u-image :show-loading="true" src="https://img.js.design/assets/img/65af8755d8eb252c96c30065.jpg" @click="Congress" width="350px" height="190px" mode="aspectFill" style="position: relative;"></u-image>
		
		<u-text text="中共一大会址" align="center" lineHeight="25px" style="position: absolute; top: 37%; left: 18%; transform: translateX(-50%);"></u-text>
	</view>
</template>

<script setup>
name:"Landmark"
const Congress = ()=>{
		uni.navigateTo({
			url:'/pages/Landmark/Congress',
			
		})
	}
</script>

<style lang="scss">
.card-body{
	width: 100%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-bottom: 10px;
}
</style>