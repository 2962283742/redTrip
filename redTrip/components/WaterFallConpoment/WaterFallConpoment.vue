<template>
	<view class="card-body">
		<u-image :show-loading="true" src="https://img.js.design/assets/img/65af7847b744bbb6e669802f.jpg" @click="Jinggang" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
		<u-text text="井冈山革命根据地" align="center" lineHeight="25px"></u-text>
	</view>
</template>

<script setup>
name:"WaterFallConpoment"
const Jinggang = ()=>{
		uni.navigateTo({
			url:'/pages/WaterFallPage/Jinggang',
			
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
}
</style>