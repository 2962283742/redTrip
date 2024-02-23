<template>
	 <img src="/static/Longmarch/1.jpg" class="title-image" />
	   <view>
	     <view class="search-container">
	       <input type="text" placeholder="请输入关键词搜索" class="search-input">
	     </view>
	   </view>
	
	 <view class="content">
	 <h4>打造IP，让红色文化火起来！</h4><br><span class="time">2024-01-16</span>
	 <img src="/static/Longmarch/1.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>打造IP，让红色文化火起来！</h4><br><span class="time">2024-01-16</span>
	 <img src="/static/Longmarch/1.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>打造IP，让红色文化火起来！</h4><br><span class="time">2024-01-16</span>
	 <img src="/static/Longmarch/1.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>打造IP，让红色文化火起来！</h4><br><span class="time">2024-01-16</span>
	 <img src="/static/Longmarch/1.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>打造IP，让红色文化火起来！</h4><br><span class="time">2024-01-16</span>
	 <img src="/static/Longmarch/1.jpg" class="content-img" />
	 <view class="line"></view>
	 </view>
</template>

<script>
	name:"Newjourney"
</script>

<style>
.title-image {
	  width: 100%; 
	  height: 160px; 
	  margin: 0%;
	}
	
p{
	background: rgba(163, 163, 163, 1);
	line-height: 23px;
	letter-spacing: 1px;
	padding: 10px;
}

.time{
	font-size:10px;
	margin-left: 10px; /* 左边距 10px*/
}

.line{
    border: 1px solid rgba(122, 122, 122, 1);
}

.content{
	padding:10px;
	line-height: 30px;
	text-indent: 140px;/* 向右移动140像素 */
}

.content-img{
	    float: left; /* 将图片向右浮动 */
		margin-top: -60px; /* 设置图片上边距为 10 像素 */
		height: 70px;
		width: 130px;
	 
}
.search-container {
    background-color: rgba(153, 153, 153, 1); /* 设置背景颜色为白色 */
    border-radius: 20px; /* 设置圆角半径为20px */
    padding: 10px; /* 可根据需要调整内边距 */
	margin: 5px;
}

.search-input::placeholder {
    text-align: center; /* 让 placeholder 文本居中 */
    color: blue; /* 设置文本颜色为蓝色 */
}


</style>
