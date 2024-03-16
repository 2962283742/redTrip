<template>
  <div class="comment-bar">
    <div class="icon" @click="togglePraise">
      <img :src="isPraise ? 'static/review/praise.png' : 'static/review/dispraise.png'" alt="praise icon" class="icon-image">
    </div>
    
    <div class="icon" @click="toggleCollect">
      <img :src="isCollect ? 'static/review/collect.png' : 'static/review/discollect.png'" alt="collect icon" class="icon-image2">
    </div>
    
    <div class="icon" @click="toggleLike">
      <img :src="isLiked ? 'static/review/like.png' : 'static/review/dislike.png'" alt="like icon" class="icon-image">
    </div>
    
    <view class="search-container">
      <input v-model="commentText" placeholder="输入评论...">
    </view>
    <button @click="sendComment" class="send-comment-button">
		<span>发送</span>
	</button>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  data() {
    return {
      isLiked: false,
      isCollect: false, // 初始化状态
      isPraise: false,
      commentText: ''
    };
  },
  methods: {
    toggleLike() {
      this.isLiked = !this.isLiked;
    },
    toggleCollect() {
      this.isCollect = !this.isCollect;
    },
    togglePraise() {
      this.isPraise = !this.isPraise;
    },
    
    sendComment() {
      // 在这里实现发送评论的逻辑
      console.log('发送评论：', this.commentText);
      this.commentText = ''; // 清空评论输入框
    }
  }
};
</script>

<style>
.comment-bar {
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 35px; /* 设置评论栏的高度 */
  background-color: rgba(204, 204, 204, 1);
  box-shadow: 0 -5px 5px rgba(0, 0, 0, 0.1);
  padding: 10px;
  display: flex;
  align-items: center;
}

.icon {
  margin-right: 15px;
}

.icon-image {
  width: 24px; /* 设置图片的宽度 */
  height: 24px; /* 设置图片的高度 */
}

.icon-image2 {
  width: 27px; /* 设置图片的宽度 */
  height:27px; /* 设置图片的高度 */
}

input {
  flex: 1;
  margin-right: 10px;
}

/* 发送按钮功能 */
.send-comment-button {
  margin-right: 20px;
  padding: 7px 15px; /* 调整按钮的内边距，控制按钮的大小 */
  background-color: rgba(153, 153, 153, 1);
  color: white;
  border: none;
  border-radius: 20px; /* 设置按钮的圆角 */
  font-size: 15px; 
  line-height:20px; /* 减少按钮的上下边距 */
  cursor: pointer;
  width: 80px; /* 修改按钮宽度 */
  height: 35px; /* 修改按钮高度 */
  
}

/* 文字栏功能 */
.search-container { 
  background-color: rgba(153, 153, 153, 1); /* 设置背景颜色为白色 */
  border-radius: 20px; /* 设置圆角半径为20px */
  padding: 5px; /* 可根据需要调整内边距 */
  margin: 10px;
}

</style>
