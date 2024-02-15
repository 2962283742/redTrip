<template>
	<view>
		
	</view>
</template>

<script>
	import { ref } from 'vue'
	import { getBaseInfo } from '@/request/api.js'
	getBaseInfo().then(res=>{
		console.log(res)
	})
</script>

<style>

</style>
