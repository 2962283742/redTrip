<template>
	<view class="card-body">
		<u-row class="card">
			<u-col span="9">
				<u-row class="card-text">
					<u-text text="古田会议会址" bold="true" size="15px" lines="1"></u-text>
				</u-row>
				<u-row>
				<text space="emsp" class="card-content">     古田会议会址，原为“廖氏宗祠”，又名“万源祠”。位于福建省龙岩市上杭县古田镇采眉岭笔架山下。会址座东朝西。始建于清宣宗道光二十八年（1848年）的单层歇山四合院式砖木结构宗祠建筑。祠堂由前后厅和左右厢房组成，建筑面积826平方米。后改为和声小学校址。</text>
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
								<u-image :show-loading="true" src="https://img.js.design/assets/img/65ae1f5286fb0bf15e462bc2.jpg" width="90px" height="120px" radius="20"></u-image>
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