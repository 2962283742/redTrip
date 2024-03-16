<template>
  <u-scroll-view style="height: 100vh;">
    <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="gray" placeholder>
      <template #left>
        <view class="u-nav-slot-left">
          &lt;
        </view>
      </template>
      <template #center>
        <view class="u-nav-slot">
          LOGO
        </view>
      </template>
      <template #right>
        <view class="u-nav-slot">
          <u-icon size="40" name="share-square" color="white"></u-icon>
        </view>
      </template>
    </u-navbar>

    <view>
    </view>

    <CigarettesTop></CigarettesTop>
  </u-scroll-view>
</template>

<script setup>
import CigarettesTop from '@/components/CigarettesTop/CigarettesTop.vue'
</script>

<style lang="scss">
page {
  background-color: rgb(204, 204, 204);
  background-size: cover;
  background-repeat: no-repeat;
}

.u-navbar .u-nav-slot {
  color: white;
  font-size: 18px;
}

.u-nav-slot-left {
  color: white;
  font-size: 30px;
}
</style>
