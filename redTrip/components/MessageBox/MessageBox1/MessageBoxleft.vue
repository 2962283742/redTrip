<template>
  <view class="messageBoxA">
    <view class="messageA">
      夺取新民主主义革命的胜利
    </view>
    <view class="lineWithoutCricleA">	
      <span class="lineTextA">一九四五</span>
    </view>
    <view class="CricleA">
    </view>
  </view>
  
  
  <view class="messageBoxB">
  	<view class="messageB">
  		掀起土地改革的风暴
  	</view>
  	<view class="lineWithoutCricleB">
      <span class="lineTextB">一九二八</span>
  	</view>
  	<view class="CricleB">
  	</view>
  </view>
  
  
  <view class="messageBoxC">
  	<view class="messageC">
  		旧民主主义革命时期
  	</view>
  	<view class="lineWithoutCricleC">
      <span class="lineTextC">一八四零</span>
  	</view>
  	<view class="CricleC">
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
  margin-top: 90px;
  transform: translateX(10px);
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
	margin-top: 200px;
	transform: translateX(10px);
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
	transform: translateX(10px);
	
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

.lineTextA {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-170%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextB {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-170%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextC {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(-170%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

</style>
