<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f50e16f49af6fe6eba9e.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>瑞金革命遗址</h3>
				<u-text text="位于江西省东南部、武夷山西麓的瑞金市。在瑞金东北约六公里处，中华苏维埃第一次全国代表大会就在这里召开，1933年4月至1934年7月，中央工农民主政府从叶坪迁到此，现有总办公厅旧址、毛泽东、张闻天、谢觉哉、邓小平等同志的故居以及中华全国总工会旧址、列宁小学旧址等。" lines="3"></u-text>
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