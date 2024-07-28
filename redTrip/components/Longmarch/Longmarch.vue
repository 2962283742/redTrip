<template>
	 <img src="https://img.js.design/assets/img/65ae0734fbf6ce02f1a0af8f.jpg" class="title-image" />
	 <p>
		 <h3>伟大的长征</h3>
	 长征是中华民族宝贵的精神财富，是革命战争史上伟大的史诗，它的丰功伟绩，惊天地、泣鬼神，彪炳史册，万古流芳！
	 </p><br>
	 
	 <view class="content">
	 <h3>时代背景</h3><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65ae08241629325e1f39856c.jpg" @click="history" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h3>长征由来</h3><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65ae096296c3ad9a149fa372.jpg" @click="origin" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h3>基本路线</h3><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65ae0a46a2fc1d273eca9b07.jpg" @click="route" class="content-img" />
	 <view class="line"></view><br><br>
	 
	 <h3>发展阶段</h3><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65ae0c4157a2a0f912cc2d97.jpg" @click="Development" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h3>重要会议</h3><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65ae0e7b86fb0bf15e42ee83.jpg" @click="meeting" class="content-img" />
	 <view class="line"></view>
	 </view>
</template>

<script setup>
	name:"Longmarch"
	const history = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/backdrop',
			
		})
	} 
	const origin = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/origin',
			
		})
	}
	const route = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/route',
			
		})
	}
	const Development = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithoutReview/Development',
			
		})
	}
	const meeting = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithoutReview/meeting',
			
		})
	}
</script>

<style>
.title-image {
	  width: 100%; 
	  height: 200px; 
	  margin: 0%;
	}
	
p{
	background: rgba(255, 255, 255, 1.0);
	line-height: 23px;
	letter-spacing: 1px;
	padding: 10px;
	margin-top: 10px;
}

.time{
	font-size:10px;
}

.line{
    border: 1px solid rgba(122, 122, 122, 1);
}

.content{
	padding:10px;
	line-height: 30px;
}

.content-img{
	    float: right; /* 将图片向右浮动 */
		margin-top: -60px; /* 设置图片上边距为 10 像素 */
		height: 70px;
		width: 130px;
	 
}
</style>