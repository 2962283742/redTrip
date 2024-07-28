<template>
	<u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(217, 74, 69, 1.0)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				<u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
					height="30px" class="filtered-image1"></u-image>
			</view>
		</template>
		
	    <template #center>
	      <view class="u-nav-slot">
	        每日答题
	      </view>
	    </template>
		
		
	    <template #right>
			<button @click="sendComment" class="buttonsend">提交</button>
	    </template>
	  </u-navbar>
	  
	  <view class="content">
	  	<u-row style="padding-top: 2%; padding-bottom: 2%;">
	  		<u-text text="趣味答题" bold="true" size="25px"></u-text>
	  	</u-row>
	  	
	  	
		<u-row style="padding-top: 2%; padding-bottom: 2%;">
			<u-text text="1943年7月8日，在《中国共产党与中国民族解放的道路》一文中，每一次提出毛泽东思想这个概念的是(   ) " bold="true" size="18px"></u-text>
		</u-row>
		<Daily></Daily>
	  	<!-- <Daily2></Daily2> -->
	  	</view>
</template>

<script setup>
import Daily from '@/components/Answer/Daily.vue'
import Daily2 from '@/components/Answer/Daily2.vue'
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
		margin-top: 20px;
	}
/* .content1 {
	    color: rgb(0, 0, 0);
		font-size: 18px;
		font-weight: bold;
		}	 */	
.u-navbar .u-nav-slot {
		color: white;
		font-size: 18px;
			}
.filtered-image {
				  /* 尝试调整亮度和对比度， */  
		filter: brightness(300%) contrast(200%);  
		}  
.filtered-image1 {
		filter: brightness(300%) saturate(0%) contrast(200%);
		}
		
.buttonsend {
  background-color: rgba(255, 255, 255, 1.0);
  color: black;
  border: 1px solid rgba(153, 153, 153, 1); /* 添加边框 */
  border-radius: 10px; /* 圆角边框 */
  cursor: pointer;
  font-size: 15px;
  width: 70px; /* 修改按钮宽度 */
  height: 40px; /* 修改按钮高度 */
  
}		
</style>