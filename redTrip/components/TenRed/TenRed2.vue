<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f45616f49af6fe6ea938.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>沂蒙山红色基地</h3>
				<u-text text="位于山东省沂水县夏蔚镇，总共占地面积32、6平方公里。由夏蔚、双山、王庄、大战地、云头峪五大景区构成。它是中共山东分局旧址、八路军山东纵队指挥部旧址、大众日报创刊地及孟良崮战役陈毅指挥所旧址。" lines="3"></u-text>
			</u-col>
			
		</u-row>
	</view>
</template>

<script setup>
name:"TenRed"
import { ref } from 'vue'
	
</script>

<style lang="scss">
.card{
	margin-top: 5%;
	margin-bottom: 5%;
}
h3{
	margin-bottom: 5px;
}
</style>