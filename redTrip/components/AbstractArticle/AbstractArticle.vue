<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="http://bdbaq.cn/a.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="6">
				<u-text text="【探索推荐】习总书记：继续把党史总结学习教育宣传引向深入 更好把握和运用党的百年奋斗历史经验" lines="3"></u-text>
			</u-col>
			<u-col>
				<u-image :show-loading="true" src="../../static/AbstractArticle/star.png" width="50px"
					height="50px" radius="10"></u-image>
			</u-col>
		</u-row>
	</view>
</template>

<script setup>
	
	name:"AbstractArticle"
	
	import { ref } from 'vue'
	
	const typeJudge = [{
		"ArticleType":"C",
		"starImage":"",
		"unStarImage":""
	},
	{
		"ArticleType":"L",
		"starImage":"",
		"unStarImage":""
		
	}
	]
		
</script>

<style lang="scss">
.card{
	margin-top: 3%;
}
</style>