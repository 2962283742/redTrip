<template>
  <u-scroll-view>
    <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(255, 255, 255, 1.0)" placeholder>
     <template #left>
     	<view class="u-nav-slot">
     		<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
     			height="30px" class="filtered-image1"></u-image>
     	</view>
     </template>
	 
      <template #center>
        <view class="u-nav-slot">
          发展阶段
        </view>
      </template>
      <template #right>
        <view class="u-nav-slot">
          <u-icon size="40" name="share-square" color="rgba(0, 0, 0, 1.0)"></u-icon>
        </view>
      </template>
    </u-navbar>

    <view>
     
    </view>

    <Development></Development>
	
  </u-scroll-view>
</template>

<script setup>
import Development from '@/components/Longmarch/Development.vue'
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


.filtered-image1 {
    filter: brightness(0%) saturate(0%);
}


.u-nav-slot-left {
  color: rgba(135, 135, 135, 1);
  font-size: 30px;
}

</style>
