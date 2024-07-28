<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="黎平会议会址" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content">     1934年底，中央红军由湖南通道进入贵州，占领黎平后，总司令部就设在这里。12月18日，中共中央政治局在此召开会议，史称“黎平会议”。这是红军离开江西后召开的一次重要会议，在紧要关头改变红军的战略方针，变被动为主动，并为遵义会议的召开奠定思想和组织基础。</text>
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
								<u-image :show-loading="true" src="https://img.js.design/assets/img/65ae233057cb0b21d271a426.jpg" width="90px" height="120px" radius="20"></u-image>
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
		padding-bottom: 70px; /* 使填充量大于或等于导航栏的高度 */
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