<template>
  <div class="comment-bar">
    <div class="comment-bar-content">
		
      <button @click="toggleLike">
        <span v-if="liked">取消点赞</span>
        <span v-else>点赞</span>
      </button>
	  
      <button @click="toggleFavorite">
        <span v-if="favorited">取消</span>
        <span v-else>收藏</span>
      </button>
	  
      <view class="search-container">
        <input v-model="commentText" type="text" placeholder="请输入你的评论" class="search-input">
      </view>
	  
      <button @click="sendComment">发送</button>
    </div>
    <form v-if="showCommentForm" class="comment-form" @submit.prevent="submitComment">
      <textarea v-model="newCommentText" placeholder="请输入评论内容"></textarea>
      <input v-model="newCommentAuthor" type="text" placeholder="请输入您的名字">
      <button type="submit">提交评论</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const liked = ref(false);
const favorited = ref(false); // 新增收藏状态
const commentText = ref('');

const toggleLike = () => {
  liked.value = !liked.value;
};

const toggleFavorite = () => {
  favorited.value = !favorited.value;
};

const toggleCommentForm = () => {
  showCommentForm.value = !showCommentForm.value;
};

const sendComment = () => {
  if (commentText.value.trim()) {
    console.log('发送评论:', commentText.value);
    // 在这里处理发送评论的逻辑，您可以调用后端接口或其他逻辑
    commentText.value = ''; // 发送后清空输入框内容
  } else {
    alert('请输入评论内容！');
  }
};
</script>

<style scoped>
.comment-bar {
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  background-color: rgba(204, 204, 204, 1);
  box-shadow: 0 -2px 4px rgba(0, 0, 0, 0.1);
}

.comment-bar-content {    
  display: flex;
  justify-content: space-between;
}

.comment-form {
  display: flex;
  flex-direction: column;
}

textarea {
  width: 100%;
  height: 100px;
  margin-bottom: 10px;
}

input {
  width: 100%;
  margin-bottom: 5px;
}

button {
  margin-top: 10px;
  margin-left: 5px;
  padding: 2px;
  background-color: rgba(153, 153, 153, 1);
  color: white;
  border: 1px solid rgba(153, 153, 153, 1); /* 添加边框 */
  border-radius: 20px; /* 圆角边框 */
  cursor: pointer;
  font-size: 15px;
  width: 80px; /* 修改按钮宽度 */
  height: 40px; /* 修改按钮高度 */
}

button:hover {
  background-color:rgba(0, 0, 0, 1.0);
}
  
.search-container {
  background-color: rgba(153, 153, 153, 1); /* 设置背景颜色为白色 */
  border-radius: 20px; /* 设置圆角半径为20px */
  padding: 6px; /* 可根据需要调整内边距 */
  margin: 10px;
}
.search-input {
  width: 80%; /* 设置文本框宽度为容器宽度的80% */
  height: 10px; /* 设置文本框高度为30像素 */
  font-size: 15px; /* 设置文本框内文字的字体大小 */
}

</style>
