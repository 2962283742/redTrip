<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="遵义会议" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content"> 遵义会议是指1935年1月中共中央政治局在贵州遵义召开的独立自主地解决中国革命问题的一次极其重要的扩大会议。是在红军第五次反“围剿”失败和长征初期严重受挫的情况下，为了纠正博古、王明、李德等人“左”倾领导在军事指挥上的错误而召开的。</text>
				</u-row>
				<u-row>
					<u-col offset="2">
						<u-row >
							<u-col span="2">
								<u-row>
   <u-col span="7">
	<u-text text="点赞" size="10px">
     </u-text>
</u-col>

      <u-col span="4" offset="1">
           <view class="icon" @click="togglePraise">
               <img :src="isPraise ? 'static/review/praise.png' : 'static/review/dispraise.png'" alt="praise icon" class="icon-image">
                        </view>
					</u-col>
				</u-row>
			</u-col>
			
			
	  <u-col span="2" offset="1">
	               <u-row>
	                 <u-col span="7"><u-text text="喜欢" size="10px">
	                    </u-text>
	               </u-col>
	
<u-col span="4">
	<view class="icon" @click="toggleLike">
	<img :src="isLiked ? 'static/review/like.png' : 'static/review/dislike.png'" alt="like icon" class="icon-image">
	</view>
	</u-col>
	</u-row>
  </u-col>
							
<u-col span="2" offset="1">
	  <u-row>
	   <u-col span="7"><u-text text="收藏" size="10px"></u-text></u-col>
	<u-col span="4">
		<view class="icon" @click="toggleCollect">
		<img :src="isCollect ? 'static/review/collect.png' : 'static/review/discollect.png'" alt="collect icon" class="icon-image2">
		</view>
		</u-col>
								</u-row>
							</u-col>
						</u-row>
					</u-col>
				</u-row>
			</u-col>
			<u-col span="3">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65ae1b5aa1bc8488160bedb1.jpg" width="90px" height="120px" radius="20"></u-image>
			</u-col>
		</u-row>
	</view>
</template>

<script setup>
import { ref } from 'vue'
const isLiked = ref(false);  
const isCollect = ref(false); // 初始化状态  
const isPraise = ref(false);  
  
// 定义方法  
function toggleLike() {  
  isLiked.value = !isLiked.value;  
}  
  
function toggleCollect() {  
  isCollect.value = !isCollect.value;  
}  
  
function togglePraise() {  
  isPraise.value = !isPraise.value;  
}  

</script>

<style lang="scss">
.card-text{
		margin-bottom: 3%;
	}
.card-content{
		font-size: 5px;
		line-height: 15px; 
		letter-spacing: 2px; 
	}
.card-body{
		margin-top: 5%;
		padding-bottom: 2%;
		border-bottom: 2px solid rgb(222, 222, 222);
	}
.icon-image {
  width: 24px; /* 设置图片的宽度 */
  height: 24px; /* 设置图片的高度 */
}

.icon-image2 {
  width: 27px; /* 设置图片的宽度 */
  height:27px; /* 设置图片的高度 */
}	
</style>