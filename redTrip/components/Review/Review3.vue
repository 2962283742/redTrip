<template>
  <div class="comment-section">
    <h3 class="section-title">评论区</h3>
    <div v-for="(comment, index) in comments" :key="index" class="comment-item">
      <p>{{ comment }}</p>
      <div class="divider" v-if="index !== comments.length - 1"></div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      comments: [ // 已有的评论列表
        "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
        "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
        "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
        "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
		 "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
		  "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
		   "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。",
		    "坚定不移走中国特色社会主义发展道路，实现中国人民解放道路。"
      ]
    };
  }
};
</script>

<style>
.comment-section {
  margin-top: 30px;
}

.section-title {
  font-size: 20px;
  font-weight: bold; /* 设置字体加粗 */
  color: #333;
  margin-bottom: 15px;
}

.comment-item {
  margin-bottom: 20px;
}

.comment-item p {
  margin: 20px 40px; /* 设置文字的上下外边距 */
  font-size: 15px;
  color: rgba(0, 0, 0, 1);
  font-weight: bold; /* 设置字体加粗 */
}

.divider {
  border-top: 1px solid rgba(156, 156, 156, 1);
  margin-top: 10px;
}
</style>
