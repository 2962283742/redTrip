<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f3a259b56e07db7bd28f.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>西柏坡纪念馆</h3>
				<u-text text="位于中国河北省石家庄市平山县西柏坡镇西柏坡村西柏坡景区内，是解放战争时期中央工委、中共中央和解放军总部的所在地，国家一级博物馆。他的总共建筑面积3344平方米。" lines="3"></u-text>
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