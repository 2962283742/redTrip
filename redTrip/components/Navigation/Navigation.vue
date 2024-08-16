<template>
  <view class="Navigation-bar">
    <view class="icon" @click="handleMainClick">
      <img :src="activeIcon === 'main' ? 'static/Navigation/main2.png' : 'static/Navigation/main1.png'" alt="main icon" class="icon-image">
      <view class="word">首页</view>
    </view>
    
    <view class="icon" @click="handleRemainClick">
      <img :src="activeIcon === 'remain' ? 'static/Navigation/remain2.png' : 'static/Navigation/remain1.png'" alt="remain icon" class="icon-image">
      <view class="word">遗迹</view>
    </view>
    
    <view class="icon" @click="handleH5Click">
      <img src="/static/Navigation/red.png" alt="red icon" class="icon-image2">
    </view>
    
    <view class="icon" @click="handleAnswerClick">
      <img :src="activeIcon === 'answer' ? 'static/Navigation/answer2.png' : 'static/Navigation/answer1.png'" alt="answer icon" class="icon-image">
      <view class="word">答题</view>
    </view>
    
    <view class="icon" @click="handleOwnClick">
      <img :src="activeIcon === 'own' ? 'static/Navigation/own2.png' : 'static/Navigation/own1.png'" alt="own icon" class="icon-image">
      <view class="word">我的</view>
    </view>
  </view>
</template>


<script setup>
import { ref } from 'vue';

const saveIconState = (key, value) => {
  localStorage.setItem(key, value);
};

const getIconState = () => {
  return localStorage.getItem('activeIcon') || 'main';
};

const activeIcon = ref(getIconState());

const handleMainClick = () => {
  activeIcon.value = 'main';
  saveIconState('activeIcon', 'main');
  uni.navigateTo({
    url: '/pages/index/index'
  });
};

const handleRemainClick = () => {
  activeIcon.value = 'remain';
  saveIconState('activeIcon', 'remain');
  uni.navigateTo({
    url: '/pages/Remains/Remains'
  });
};

const handleAnswerClick = () => {
  activeIcon.value = 'answer';
  saveIconState('activeIcon', 'answer');
  uni.navigateTo({
    url: '/pages/Answer/Answer'
  });
};

const handleOwnClick = () => {
  activeIcon.value = 'own';
  saveIconState('activeIcon', 'own');
  uni.navigateTo({
    url: '/pages/Own/Own'
  });
};

const handleH5Click = () => {  
  // 判断当前是否为 H5 环境  
  if (process.env.UNI_PLATFORM === 'h5') {  
    // 在 H5 环境下，使用 window.location.href 跳转到外部链接  
    window.location.href = 'https://u.eqxiu.com/s/4CxW7zdm?eip=true';  
  } else {  
    // 在其他环境下，考虑给出提示或者执行其他逻辑  
    uni.showToast({  
      title: '该功能仅支持在 H5 环境下使用',  
      icon: 'none'  
    });   
  }  
};
</script>


<style>
.Navigation-bar {
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 35px; /* 设置评论栏的高度 */
  background-color: rgba(255, 255, 255, 1.0);
  box-shadow: 0 -5px 5px rgba(0, 0, 0, 0.1);
  padding: 10px;
  display: flex;
  align-items: center;
}

.icon {
  margin-right: 55px;
  display: flex; /* 设置为flex布局，使子元素可以灵活排列 */
  flex-direction: column; /* 子元素（图片和文字）垂直排列 */
  align-items: center; /* 水平居中对齐子元素 */
}

.icon-image {
  width: 23px; /* 设置图片的宽度 */
  height: 26px; /* 设置图片的高度 */
}

.icon-image2 {
  width: 42px; /* 设置图片的宽度 */
  height: 42px; /* 设置图片的高度 */
}

.word {
  font-size: 10px;
  width: 108%;
}
</style>

