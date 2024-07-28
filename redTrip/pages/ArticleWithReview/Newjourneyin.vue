<template>
  <u-scroll-view>
    <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(255, 255, 255, 1)" placeholder>
     <template #left>
     	<view class="u-nav-slot">
     		<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
     			height="30px" class="filtered-image1"></u-image>
     	</view>
     </template>
	 
      <template #center>
        <view class="u-nav-slot">
          新的征程
        </view>
      </template>
      <template #right>
        <view class="u-nav-slot">
          <u-icon size="40" name="share-square" color="rgba(0, 0, 0, 1.0)"></u-icon>
        </view>
      </template>
    </u-navbar>

   <journeyin></journeyin>
	<Review2></Review2>
	<Review3></Review3>
  </u-scroll-view>
</template>

<script setup>
import journeyin from '@/components/Newjourney/journeyin.vue'
import Review2 from '@/components/Review/Review2.vue'
import Review3 from '@/components/Review/Review3.vue'	
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
	  color: rgba(0, 0, 0, 1.0);
	  font-size: 30px;
	}
	
	.filtered-image1 {
	    filter: brightness(0%) saturate(0%);
	}
</style>