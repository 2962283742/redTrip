<template>
	<view>
	  <view class="search-container">
	    <input type="text" placeholder="请输入关键词搜索" class="search-input">
	  </view>
	</view>
	
	 
</template>

<script>
	name:"Newjourney"
</script>

<style>
.title-image {
	  width: 100%; 
	  height: 160px; 
	  margin-left: 5px;
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
	display: flex;
	flex-direction: column;
}

.content-img{
	    float: left; 
		margin-top: -60px; 
		height: 80px;
		width: 130px;
	 
}
.search-container {
    background-color: rgba(242, 242, 242, 1);
; /* 设置背景颜色为白色 */
    border-radius: 20px; /* 设置圆角半径为20px */
    padding: 10px; /* 可根据需要调整内边距 */
	margin: 10px;
}




</style>
