<template>
	 <img src="https://img.js.design/assets/img/65ae0c4157a2a0f912cc2d97.jpg" class="title-image" />
	 
	 <view class="content">
	 <h4>长征准备阶段（1934年7月7日~1934年10月10日）</h4>
	 <br>
	 <span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65af587d0a7395525d73cafe.jpg" @click="Preparatory" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>长征失利阶段（1934年10月10日~1935年1月15日）</h4>
	 <br>
	 <span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65af5c0e57cb0b21d28777a2.jpg" @click="Loseout" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>长征转折阶段（1935年1月15日~1935年6月14日）</h4><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65af59b1a2fc1d273ee4364d.jpg" @click="Turnaround" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>坚持北上和南下分裂阶段（1935年6月~1935年10月）</h4><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65af5a24b744bbb6e66335a9.jpg" @click="Northsouth" class="content-img" />
	 <view class="line"></view><br>
	 
	 <h4>发展巩固和南下受挫阶段（1935年10月~1936年7月）</h4><br><span class="time">2024-01-16</span>
	 <img src="https://img.js.design/assets/img/65af58c2a4ba17572dffc0fc.jpg" @click="Setback" class="content-img" />
	 <view class="line"></view>
	 </view>
</template>

<script setup>
	name:"Development"
	const Preparatory = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Preparatory',
			
		})
	} 
	const Loseout = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Loseout',
			
		})
	}
	const Turnaround = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Turnaround',
			
		})
	}
	const Northsouth = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Northsouth',
			
		})
	}
	const Setback = ()=>{
		uni.navigateTo({
			url:'/pages/ArticleWithReview/Setback',
			
		})
	} 
</script>

<style>
.title-image {
	  width: 100%; 
	  height: 200px; 
	  margin: 0%;
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