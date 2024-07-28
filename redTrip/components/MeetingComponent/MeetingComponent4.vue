<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="苟坝会议会址" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content">     苟坝会议会址，位于贵州省遵义县枫香镇苟坝村马鬃岭山脚，距县城50千米，距遵义市56千米.一座老式黔北农家三合院，传统木结构的瓦房。民国二十四年（1935年）3月10日—3月12日，中央红军在此召开会议。苟坝会议会址见证了改写中国命运的历史瞬间，作为全国爱国主义教育示范基地，是爱国主义教育和革命传统教育的重要载体。</text>
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
								<u-image :show-loading="true" src="https://img.js.design/assets/img/65ae237d0ade14719e621111.webp" width="90px" height="120px" radius="20"></u-image>
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