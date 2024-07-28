<template>
	<view class="content">
		<Article></Article>
	</view>
</template>

<script setup>
	import Article from '@/components/Article/Article.vue'
	
</script>

<style lang="scss">
page{
	width: 100%;
	border-top: 1px solid rgb(223,223,223);
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding-bottom: 65px; /* 使填充量大于或等于导航栏的高度 */
}
.content{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 90%;
}
</style>
