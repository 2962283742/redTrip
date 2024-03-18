<template>
  <u-scroll-view>
    <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(221, 221, 221, 1)" placeholder>
      <template #left>                         
        <view class="u-nav-slot-left">
          &lt;
        </view>
      </template>
      <template #center>
        <view class="u-nav-slot">
          坚持北上和南下分裂阶段
        </view>
      </template>
      <template #right>
        <view class="u-nav-slot">
          <u-icon size="40" name="share-square" color="rgba(135, 135, 135, 1)"></u-icon>
        </view>
      </template>
    </u-navbar>

    <view>
     
    </view>

    <Northsouth></Northsouth>
	<Review2></Review2>
	<Review3></Review3>
  </u-scroll-view>
</template>

<script setup>
import Northsouth from '@/components/Longmarch/Northsouth.vue'
import Review2 from '@/components/Review/Review2.vue'
import Review3 from '@/components/Review/Review3.vue'
</script>

<style lang="scss">
page { 
  background-color: rgb(204, 204, 204);
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


</style>
