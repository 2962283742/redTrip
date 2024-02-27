<template>
	<view class="content">
		<AbstractArticle></AbstractArticle>
	</view>
</template>

<script setup>
	import AbstractArticle from '@/components/AbstractArticle/AbstractArticle.vue'
</script>

<style lang="scss">
page{
	border-top: 1px solid rgb(223,223,223);
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 100%;
}
.content{
	display: inherit;
	width: 90%;
}
</style>
