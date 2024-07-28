<template>
	<view>
	  <view class="search-container">
	    <input type="text" placeholder="请输入关键词搜索" class="search-input">
	  </view>
	</view>
	
	 <img src="https://img.js.design/assets/img/65b3b02846f762273ec4fb58.jpg" class="title-image" />
	   
	 <view class="content">
	
	 <h5>江苏省十四届人大二次会议隆重开幕</h5><br><span class="time">新华日报 2024年01月23日</span>
	 <img src="https://img.js.design/assets/img/65b3a94597e1604ae56d3029.png" @click="journey" class="content-img"/>
	 <view class="line"></view><br>
	 
	 
	 
	 <h5>进击吧！2024丨2024年，四川交通冲击两个“一万”目标</h5><br><span class="time">四川日报 2024年01月24日</span>
	 <img src="https://img.js.design/assets/img/65b3abb416f49af6fe90ec93.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 
	 <h5>“新能源+”为中国西部农村蓄能加码</h5><br><span class="time">中国新闻网 2024年01月26日</span>
	 <img src="https://img.js.design/assets/img/65b3aecdea6b22f6f302e28b.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h5>全国铁路春运预计发送旅客4.8亿人次 同比2023年春运增长37.9%</h5><br><span class="time">中国新闻网 2024年01月14日</span>
	 <img src="https://img.js.design/assets/img/65b3af13f47a89ca6a160a3d.jpg" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h5>专家：4亿“新职人”将帮助中国从“人口红利”转向“人才红利”</h5><br><span class="time">中国新闻网 2024年01月14日</span>
	 <img src="https://img.js.design/assets/img/642fcb38c787aa67cd90bd1c.jpg" class="content-img" />
	 <view class="line"></view>
	 </view>
</template>

<script setup>
	const journey = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Newjourneyin',
			
		})
	}
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
;
; /* 设置背景颜色为白色 */
    border-radius: 20px; /* 设置圆角半径为20px */
    padding: 10px; /* 可根据需要调整内边距 */
	margin: 10px;
}




</style>
