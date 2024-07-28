<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f608ea6b22f6f3df34a5.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>井冈山革命遗址</h3>
				<u-text text="位于江西省吉安井冈山市，这里发生的历史故事是：秋收起义失败后，毛泽东率领部队挺进井冈山，在井冈山创立了全国第一个农村革命根据地，而且根据地以茨坪为中心，拥有宁岗、永新、莲花三县和吉安、安福、随县、酃县的一部分，方圆275公里。" lines="3"></u-text>
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