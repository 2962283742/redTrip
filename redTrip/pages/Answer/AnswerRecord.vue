<template>
  <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(217, 74, 69, 1.0)" placeholder>
    <template #left>
      <view class="u-nav-slot">
        <u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px" height="30px" class="filtered-image1"></u-image>
      </view>
    </template>
    <template #center>
      <view class="u-nav-slot">
        答题记录
      </view>
    </template>
  </u-navbar>
  
  <view class="content">
	  <view class="search-container">
	    <input type="text" class="search-input" placeholder="请输入搜索内容">
	  </view>
    <u-row>
      <u-text text="今天-2024年1月16日星期二" bold="true" size="15px"></u-text>
    </u-row>
	
	
    <u-row>
      <u-text text="昨天-2024年1月15日星期一" bold="true" size="15px"></u-text>
    </u-row>
    
  </view>
</template>

<script setup>
import AnswerRecord from '@/components/AnswerRecord/AnswerRecord.vue'
</script>

<style>
page {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.content {
  width: 90%;
}
.content1 {
  color: rgb(158, 158, 158, 1);
  font-size: 5px;
}
.u-navbar .u-nav-slot {
  color: white;
  font-size: 18px;
}
.filtered-image {
  /* 尝试调整亮度和对比度 */
  filter: brightness(300%) contrast(200%);
}
.filtered-image1 {
  filter: brightness(300%) saturate(0%) contrast(200%);
}
.search-container {
  display: flex;
  align-items: center;
  background-color: white;
  border-radius: 5px;
  margin-top: 20px;
  margin-bottom: 20px;
  padding: 5px 5px;
  width: 100%;
}
.search-icon {
  margin-right: 10px;
}
.search-input {
  border: none;
  outline: none;
  width: 100%;
  font-size: 16px;
}
</style>
