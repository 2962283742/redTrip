<template>
	<view class="card-body">
		<u-image :show-loading="true" src="https://img.js.design/assets/img/65af8f71329c0dd38e076d02.jpg" @click="Memorialin" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
		<u-text text="中国人民抗日战争纪念馆" align="center" lineHeight="25px"></u-text>
	</view>
</template>

<script setup>
name:"Memorial"
const Memorialin = ()=>{
		uni.navigateTo({
			url:'/pages/Memorial/Memorialin1',
			
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