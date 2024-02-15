<template>
  <view class="messageBoxA">
    <view class="messageA">
      马日事变
    </view>
    <view class="lineWithoutCricleA">	
      <span class="lineTextA">一九二七</span>
    </view>
    <view class="CricleA">
    </view>
  </view>
  
  
  <view class="messageBoxB">
  	<view class="messageB">
  		四一二反革命政变
  	</view>
  	<view class="lineWithoutCricleB">
      <span class="lineTextB">一九二七</span>
  	</view>
  	<view class="CricleB">
  	</view>
  </view>
  
  
  <view class="messageBoxC">
  	<view class="messageC">
  		北伐战争
  	</view>
  	<view class="lineWithoutCricleC">
      <span class="lineTextC">一九二六</span>
  	</view>
  	<view class="CricleC">
  	</view>
  </view>
  
  
  <view class="messageBoxD">
  	<view class="messageD">
  		党的四大
  	</view>
  	<view class="lineWithoutCricleD">
      <span class="lineTextD">一九二五</span>
  	</view>
  	<view class="CricleD">
  	</view>
  </view>
  
  
  <view class="messageBoxE">
  	<view class="messageE">
  		党的三大
  	</view>
  	<view class="lineWithoutCricleE">
      <span class="lineTextE">一九二三</span>
  	</view>
  	<view class="CricleE">
  	</view>
  </view>
  
  
  <view class="messageBoxF">
  	<view class="messageF">
  		党的二大
  	</view>
  	<view class="lineWithoutCricleF">
      <span class="lineTextF">一九二二</span>
  	</view>
  	<view class="CricleF">
  	</view>
  </view>
  
  
  <view class="messageBoxG">
  	<view class="messageG">
  		各地相继成立共产党早期组织
  	</view>
  	<view class="lineWithoutCricleG">
      <span class="lineTextG">一九二零</span>
  	</view>
  	<view class="CricleG">
  	</view>
  </view>
  
  
  <view class="messageBoxH">
  	<view class="messageH">
  		新文化运动
  	</view>
  	<view class="lineWithoutCricleH">
      <span class="lineTextH">一九一五</span>
  	</view>
  	<view class="CricleH">
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
  margin-top: 0px;
  transform: translateX(5px);
  position: relative;  
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
	margin-top:50px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
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
	margin-top: 40px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
	
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
	margin-top: 40px;
	transform: translateX(0px);
	position: relative; 
	
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


.messageBoxE {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 40px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
	
}
.messageE {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleE {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleE {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}



.messageBoxF {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 50px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
	
}
.messageF {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleF {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleF {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxG {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 20px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
	
}
.messageG {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleG {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleG {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxH {
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	margin-top: 20px;
	transform: translateX(0px);
	position: relative;  // 添加相对定位
	
}
.messageH {
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleH {
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleH {
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.lineTextA {
  position: absolute;
  top: 3px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}
.lineTextB {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextC {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextD {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextE {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextF {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextG {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextH {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(-165%);
  padding: 2px;
  font-size: 10px;
  color: white;
}
</style>
