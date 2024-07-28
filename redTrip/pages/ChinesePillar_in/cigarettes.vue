<template>
	<u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(217, 74, 69, 1.0)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
					height="30px" class="filtered-image1"></u-image>
			</view>
		</template>
		
  <template #center>
	      <view class="u-nav-slot">
	      	<u-image :show-loading="true" src="../../static/index/redtrip.png" width="95px"
	      		height="30px" class="filtered-image"></u-image>
	      </view>
	    </template>		
		
		<template #right>
		  <view class="u-nav-slot">
		    <u-icon size="40" name="share-square" color="rgba(255, 255, 255, 1.0)"></u-icon>
		  </view>
		</template>
		
	</u-navbar>
	
<CigarettesTop></CigarettesTop>
	
</template>

<script setup>
import CigarettesTop from '@/components/ChinesePillar_in/CigarettesTop.vue'
</script>

<style lang="scss">
page { 
  background-color: rgb(255, 255, 255);
  background-size: cover;
  background-repeat: no-repeat;
}

.u-navbar .u-nav-slot {
  color: black;
  font-size: 18px;
}



.u-nav-slot-left {
  color: rgba(135, 135, 135, 1);
  font-size: 30px;
}
.filtered-image {
	  /* 尝试调整亮度和对比度， */  
	  filter: brightness(300%) contrast(200%);  
	}  
.filtered-image1 {
	  filter: brightness(300%) saturate(0%) contrast(200%);
	}
</style>
