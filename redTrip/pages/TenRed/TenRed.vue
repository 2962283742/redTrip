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
	<view class="content">
<TenRed></TenRed>
<TenRed2></TenRed2>
<TenRed3></TenRed3>
<TenRed4></TenRed4>
<TenRed5></TenRed5>
<TenRed6></TenRed6>
	</view>
	
	<Navigation></Navigation>
</template>

<script setup>
import TenRed from '@/components/TenRed/TenRed.vue'	
import TenRed2 from '@/components/TenRed/TenRed2.vue'
import TenRed3 from '@/components/TenRed/TenRed3.vue'
import TenRed4 from '@/components/TenRed/TenRed4.vue'
import TenRed5 from '@/components/TenRed/TenRed5.vue'
import TenRed6 from '@/components/TenRed/TenRed6.vue'
</script>

<style>
page { 
  background-color: rgba(255, 255, 255, 1);
  background-size: cover;
  background-repeat: no-repeat;
  padding-bottom: 65px; /* 使填充量大于或等于导航栏的高度 */
  border-top: 1px solid rgb(223,223,223);
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.content{
	width: 90%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
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