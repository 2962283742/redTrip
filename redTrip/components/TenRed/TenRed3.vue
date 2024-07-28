<template>
	<view class="card">
		<u-row>
			<u-col :span="4">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65b1f4bbf47a89ca6af3b4f2.png" width="100px"
					height="90px" radius="10"></u-image>
			</u-col>
			<u-col :span="8">
				<h3>南湖革命纪念馆</h3>
				<u-text text="位于浙江省嘉兴市烟雨路186号，现在出现的红船就是来源于此，嘉兴南湖是中国共产党诞生地、中国革命红船起航地。充分发挥了“鉴往知来、以史育人”的宣教作用，是全国文明单位、全国爱国主义教育示范基地、全国青少年教育基地。" lines="3"></u-text>
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