<template>
	<view class="content">
		<view class="lists">
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="清除缓存" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="关于我们" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="检查更新" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="服务协议" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="隐私协议" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="item">
				<u-row>
					<u-col :span="4"><u-text text="注销" bold = "true" size="16px"></u-text></u-col>
					<u-col :span="1" offset="7">
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
			<view class="logoutArea">
				<button>退出登录</button>
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
	.logoutArea{
		margin-top: 5%;
	}
	.logoutArea button{
		width: 80%;
		background-color: white;
		color: red;
		font-weight: bold;
	}
</style>