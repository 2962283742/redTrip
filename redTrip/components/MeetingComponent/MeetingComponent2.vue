<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="中共三大会址" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content">        中共三大会址纪念馆，位于广东省广州市越秀区恤孤院路3号， [10]由中共三大会址遗址广场、中共中央机关旧址——春园、中共三大历史陈列馆组成。 [8]占地面积5000平方米，建筑面积2700平方米，陈列面积854平方米。 [7]2020年，改扩建后，中共三大历史陈列馆占地面积为668.42平方米，建筑面积为2305平方米。</text>
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
								<u-image :show-loading="true" src="https://img.js.design/assets/img/65ae1c3057a2a0f912cf1d20.jpg" width="90px" height="120px" radius="20"></u-image>
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