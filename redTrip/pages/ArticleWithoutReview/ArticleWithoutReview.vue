<template>
	<view>
		<mp-html :content="html"></mp-html>
		
	</view>
</template>

<script setup>
	//引入marked，将markdown转换成html
	import { marked } from 'marked'
	import { ref } from 'vue'
	const html = ref('# 测试用例')
	html.value = marked(html.value)
</script>

<style lang="scss">

</style>
