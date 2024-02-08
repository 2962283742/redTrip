<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="遵义会议" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
					<u-text text="     遵义会议是指1935年1月中共中央政治局在贵州遵义召开的独立自主地解决中国革命问题的一次极其重要的扩大会议。是在红军第五次反“围剿”失败和长征初期严重受挫的情况下，为了纠正博古、王明、李德等人“左”倾领导在军事指挥上的错误而召开的。"  size="10px"></u-text>
				</u-row>
				<u-row>
					<u-col offset="7">
						222
					</u-col>
				</u-row>
			</u-col>
			<u-col span="2">
				<u-image :show-loading="true" src="https://cdn.uviewui.com/uview/swiper/swiper2.png" width="90px" height="100px"></u-image>
			</u-col>
		</u-row>
	</view>
</template>

<script setup>
	import { ref } from 'vue'
</script>

<style lang="scss">
	.card-text{
		margin-bottom: 3%;
	}
</style>