<template>
  <view class="messageBoxA">
    <view class="messageA">
      社会主义改造基本完成
    </view>
    <view class="lineWithoutCricleA">	
      <span class="lineTextA">一九五六</span>
    </view>
    <view class="CricleA">
    </view>
  </view>
  
  
  <view class="messageBoxB">
  	<view class="messageB">
  		第一届全国人民代表大会第一次会议举行
  	</view>
  	<view class="lineWithoutCricleB">
      <span class="lineTextB">一九二八</span>
  	</view>
  	<view class="CricleB">
  	</view>
  </view>
  
  
  <view class="messageBoxC">
  	<view class="messageC">
  		和平共处五项原则
  	</view>
  	<view class="lineWithoutCricleC">
      <span class="lineTextC">一八四零</span>
  	</view>
  	<view class="CricleC">
  	</view>
  </view>
  
  
  <view class="messageBoxD">
  	<view class="messageD">
  		三反运动
  	</view>
  	<view class="lineWithoutCricleD">
      <span class="lineTextD">一八四零</span>
  	</view>
  	<view class="CricleD">
  	</view>
  </view>
  
  
  <view class="messageBoxD">
  	<view class="messageD">
  		镇压反革命运动
  	</view>
  	<view class="lineWithoutCricleD">
      <span class="lineTextD">一八四零</span>
  	</view>
  	<view class="CricleD">
  	</view>
  </view>
</template>



<script setup>
 name:"MessageBoxleft"
</script>


<style lang="scss">
.messageBoxA {
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 10px;
  transform: translateX(20px);
}

.messageA {
  background-color: white;
  width: 20%;
  text-align: center;
  border-radius: 4%;
  padding: 3%;
  word-wrap: break-word;
  font-size: 5px;
}

.lineWithoutCricleA {
  height: 0px;
  border: 2px solid white;
  width: 15%;
}

.CricleA {
  border-radius: 50%;
  height: 5px;
  background-color: red;
  width: 5px;
  border: 2px solid white;
}

.messageBoxB {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 25px;
	transform: translateX(0px);
}
.messageB {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleB {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleB {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.messageBoxC {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 60px;
	transform: translateX(0px);
	
}
.messageC {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleC {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleC {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}
.messageBoxD {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 60px;
	transform: translateX(0px);
	
}
.messageD {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleD {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleD {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.lineTextA {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextB {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextC {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextD {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}
</style>
