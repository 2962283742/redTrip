<template>
	<view class="card-body">
		<view class="LabelText">
			<u-row >
				<u-col span="2">
					<u-image :show-loading="true" src="../../static/remains/label.png" width="20px"
						height="20px"></u-image>
				</u-col>
				<u-col span="10">
					<u-text text="十大革命遗址综合指数" bold="true" size="10px" class="textToMargin"></u-text>
				</u-col>
			</u-row>
		</view>
		<view class="listLabel">
			<u-row>
			<u-text text="1&nbsp;&nbsp;遵义会议旧址" bold="true" size="10px" lines="1"></u-text>
			</u-row>
			<u-row>
			<u-text text="2&nbsp;&nbsp;井冈山革命遗址" bold="true" size="10px" lines="1"></u-text>
			</u-row>
			<u-row>
			<u-text text="3&nbsp;&nbsp;西柏坡革命旧址" bold="true" size="10px" lines="1"></u-text>
			</u-row>
			<u-row>
				<u-text text="4&nbsp;&nbsp;延安革命纪念地" bold="true" size="10px" lines="1"></u-text>
			</u-row>
			<u-row>
			<u-text text="5&nbsp;&nbsp;沂蒙山革命根据地" bold="true" size="10px" lines="1"></u-text>
			</u-row>
		</view>
		
	</view>
</template>

<script>
	
</script>

<style lang="scss">
	.LabelText{
		width: 100%;
		background: linear-gradient(to bottom,rgb(255,210,196),rgb(255,255,255));
		border-top-left-radius: 15px;
		border-top-right-radius: 15px;
	}
	.LabelText .u-row{
		padding-top: 10%;
		padding-left: 2%;
		
		
	}
	.card-body{
		width: 110%;
		border: 1px solid #E6E6E6;
		border-radius: 15%;
		
		
		
	}
	.listLabel{
		padding: 10%;
		
	}
	.listLabel .u-row{
		margin-top: 5%;
	}
	.listLabel .u-row .u-text{
		word-spacing: normal;
	}
</style>