<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="遵义会议" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content">遵义会议是指1935年1月中共中央政治局在贵州遵义召开的独立自主地解决中国革命问题的一次极其重要的扩大会议。是在红军第五次反“围剿”失败和长征初期严重受挫的情况下，为了纠正博古、王明、李德等人“左”倾领导在军事指挥上的错误而召开的</text>
				</u-row>
				<u-row>
					<u-col offset="2">
						<u-row >
							<u-col span="2">
								<u-row>
									<u-col span="7"><u-text text="点赞" size="10px"></u-text></u-col>
									<u-col span="4" offset="1"><u-image :show-loading="true" src="../../static/AbstractArticle/dianzan.png" width="20px"
										height="20px"></u-image></u-col>
								</u-row>
							</u-col>
							<u-col span="2" offset="1">
								<u-row>
									<u-col span="7"><u-text text="喜欢" size="10px"></u-text></u-col>
									<u-col span="4"><u-image :show-loading="true" src="../../static/redMetting/like.png" width="20px"
										height="20px"></u-image></u-col>
								</u-row>
							</u-col>
							<u-col span="2" offset="1">
								<u-row>
									<u-col span="7"><u-text text="收藏" size="10px"></u-text></u-col>
									<u-col span="4"><u-image :show-loading="true" src="../../static/AbstractArticle/star.png" width="20px"
										height="20px"></u-image></u-col>
								</u-row>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			</u-col>
			<u-col span="3">
				<u-image :show-loading="true" src="https://cdn.uviewui.com/uview/swiper/swiper2.png" width="90px" height="100px" radius="20"></u-image>
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
	.card-content{
		font-size: 5px;
	}
	.card-body{
		margin-top: 3%;
		padding-bottom: 2%;
		border-bottom: 2px solid rgb(222, 222, 222);
	}
</style>