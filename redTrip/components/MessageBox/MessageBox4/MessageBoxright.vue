<template>
	<view class="messageBoxH">
		<view class="messageH">
			护国运动
		</view>
		<view class="lineWithoutCricleH">
			<span class="lineTextH">一九一五</span>
		</view>
		<view class="CricleH">
		</view>
	</view>
	
	
	
	<view class="messageBoxI">
		<view class="messageI">
			辛亥革命和清朝的灭亡
		</view>
		<view class="lineWithoutCricleI">
			<span class="lineTextI">一九一二</span>
		</view>
		<view class="CricleI">
		</view>
	</view>
	
	
	
	
	<view class="messageBoxJ">
		<view class="messageJ">
			戊戌变法
		</view>
		<view class="lineWithoutCricleJ">
			<span class="lineTextJ">一八九五</span>
		</view>
		<view class="CricleJ">
		</view>
	</view>

    <view class="messageBoxK">
		<view class="messageK">
			甲午战争
		</view>
		<view class="lineWithoutCricleK">
			<span class="lineTextK">一八九四</span>
		</view>
		<view class="CricleK">
		</view>
	</view>
	
	
	<view class="messageBoxL">
		<view class="messageL">
			第二次鸦片战争
		</view>
		<view class="lineWithoutCricleL">
			<span class="lineTextL">一八五六</span>
		</view>
		<view class="CricleL">
		</view>
	</view>
	
	
	<view class="messageBoxM">
		<view class="messageM">
			鸦片战争
		</view>
		<view class="lineWithoutCricleM">
			<span class="lineTextM">一九四零</span>
		</view>
		<view class="CricleM">
		</view>
	</view>
</template>

<script setup>
	name:"MessageBoxright"
	
</script>

<style lang="scss">
.messageBoxH{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: -500px;
	transform: translateX(5px);
	position: relative; 
}
.messageH{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleH{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleH{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxI{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 30px;
	transform: translateX(0px);
	
}
.messageI{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleI{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleI{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.messageBoxJ{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 60px;
	transform: translateX(0px);
	position: relative;  
}
.messageJ{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleJ{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleJ{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.messageBoxK{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 50px;
	transform: translateX(0px);
	position: relative; 
}
.messageK{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleK{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleK{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxL{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 10px;
	transform: translateX(0px);
}
.messageL{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleL{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleL{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxM{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 100px;
	transform: translateX(0px);
	position: relative; 
	}
.messageM{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleM{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleM{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}
.lineTextH {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextI {
  position: absolute;
  top: -3px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextJ {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextK {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextL {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextM {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

</style>