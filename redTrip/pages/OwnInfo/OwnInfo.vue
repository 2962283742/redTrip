<template>
	<view class="content">
		<view class="lists">
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="头像" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="7">
						<u-row>
							<u-col :span="6">
								<u-image :show-loading="true" :src="src" width="30px" height="30px"
									shape="circle"></u-image>
							</u-col>
							<u-col :span="6" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>

			</view>
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="昵称" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="6">
						<u-row>
							<u-col :span="10">
								<u-text text="骑猪上高速" lines="1" size="15px" bold="true"></u-text>
							</u-col>
							<u-col :span="2" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			
			</view>
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="性别" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="7">
						<u-row>
							<u-col :span="6">
								<u-text text="男" bold="true" size="15px"></u-text>
							</u-col>
							<u-col :span="6" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			
			</view>
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="年龄" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="7">
						<u-row>
							<u-col :span="6">
								<u-text text="20" bold="true" size="15px"></u-text>
							</u-col>
							<u-col :span="6" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			
			</view>
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="手机" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="6">
						<u-row>
							<u-col :span="10">
								<u-text text="15182662612" bold="true" size="15px" lines="1"></u-text>
							</u-col>
							<u-col :span="2" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			
			</view>
			<view class="item">
				<u-row>
					<u-col :span="2"><u-text text="实名" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="3" offset="7">
						<u-row>
							<u-col :span="6">
								
							</u-col>
							<u-col :span="6" offset="1">
								<u-image :show-loading="true" src="../../static/ownIcon/lr.png" width="15px" height="20px"></u-image>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			
			</view>
			
		</view>

	</view>
</template>

<script setup>
	import {
		ref
	} from 'vue'
	const src = ref('https://q1.qlogo.cn/g?b=qq&nk=3198841971&s=100')
</script>

<style lang="scss">
	page {
		display: flex;
		width: 100%;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		border-top: 1px solid rgb(223,223,223);
	}

	.content {
		width: 90%;
	}

	.item {
		padding: 5%;
		border-bottom: 1px solid rgb(223, 223, 223);
	}
</style>