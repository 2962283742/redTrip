<template>
  <view class="card-body" @click="navigateToDaily">
    <u-image :show-loading="true" src="https://img.js.design/assets/img/65b4ba2a704a94d338f36a6b.png" width="165px" height="130px" radius="10%" mode="aspectFill"></u-image>
  </view>
</template>

<script setup>
const navigateToDaily = () => {
  uni.navigateTo({
    url: '/pages/Answer/Daily'
  });
};
</script>

<style lang="scss">
.card-body {
  margin-top: 15px;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
</style>
