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
	        
	      </view>
	    </template>
		
		
	    <template #right>
	      <view class="u-nav-slot" @click="AnswerRecord">
	       答题记录
	      </view>
	    </template>
	  </u-navbar>
	  
	<view class="content">
		<u-row style="padding-top: 2%; padding-bottom: 2%;">
			<u-text text="趣味答题" bold="true" size="25px"></u-text>
		</u-row>
		
		<view class="content1">
			完成趣味答题后可点亮五角星，<br>全部答题完成后可点亮两颗五角星
		</view>
		
		
		
		<u-row>
			<u-col span="5">
				<Answer></Answer>
			</u-col>
			<u-col span="5" offset="2">
			    <Answer2></Answer2>
			</u-col>
		</u-row>
		
		<u-row style="padding-top: 8%; padding-bottom: 2%;">
			<u-text text="答题竞赛" bold="true" size="25px"></u-text>
		</u-row>
		
		<view class="content1">
			完成答题竞赛后可点亮五角星，<br>全部竞赛完成后可点亮三颗五角星
		</view>
		
		
		<u-row>
			<u-col span="5">
				<Answer3></Answer3>
			</u-col>
			<u-col span="5" offset="2">
			    <Answer4></Answer4>
			</u-col>
		</u-row>
		<u-row>
			<u-col span="5">
			<Answer5></Answer5>
			</u-col>
		</u-row>
		
		</view>
		<Navigation></Navigation>
</template>

<script setup>
import Answer from '@/components/Answer/Answer.vue'
import Answer2 from '@/components/Answer/Answer2.vue'
import Answer3 from '@/components/Answer/Answer3.vue'
import Answer4 from '@/components/Answer/Answer4.vue'
import Answer5 from '@/components/Answer/Answer5.vue'
import Navigation from '@/components/Navigation/Navigation.vue'
const AnswerRecord = ()=>{
		uni.navigateTo({
			url:'/pages/Answer/AnswerRecord',
			
		})
	}
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
	}
.content1 {
	    color: rgb(158, 158, 158, 1);
		font-size: 5px;
		}
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
</style>