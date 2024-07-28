<template>
	<u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(217, 74, 69, 1.0)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
					height="30px" class="filtered-image1"></u-image>
			</view>
		</template>
		<template #right>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/index/redtrip.png" width="95px"
					height="30px" class="filtered-image"></u-image>
			</view>
		</template>
	</u-navbar>
	
<Jinggang></Jinggang>
<Navigation></Navigation>	
</template>

<script setup>
import { ref } from 'vue'
import Jinggang from '@/components/Jinggang/Jinggang.vue'
import Navigation from '@/components/Navigation/Navigation.vue'

</script>

<style lang="scss">
page { 
  background-color: rgba(255, 255, 255, 1);
  background-size: cover;
  background-repeat: no-repeat;
  padding-bottom: 65px; /* 使填充量大于或等于导航栏的高度 */
}

.u-navbar .u-nav-slot {
  color: black;
  font-size: 18px;
}

.filtered-image {
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
.filtered-image1 {
	  filter: brightness(300%) saturate(0%) contrast(200%);
		}
</style>
