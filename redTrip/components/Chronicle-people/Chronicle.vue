<template>
  <view class="card-body" @click="navigateToChroniclein">
    <u-image :show-loading="true" src="https://img.js.design/assets/img/65b396a4704a94d338e72539.jpg" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
    <u-text text="军记史书 | 人民子弟兵的发展" align="center" lineHeight="25px"></u-text>
  </view>
</template>

<script setup>
const navigateToChroniclein = () => {
  uni.navigateTo({
    url: '/pages/Chronicle/Chroniclein'
  });
};
</script>

<style lang="scss">
.card-body {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
</style>
