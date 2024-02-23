<template>
	<view class="messageBoxD">
		<view class="messageD">
			古田会议
		</view>
		<view class="lineWithoutCricleD">
			<span class="lineTextD">一九二九</span>
		</view>
		<view class="CricleD">
		</view>
	</view>
	
	
	
	<view class="messageBoxE">
		<view class="messageE">
			党的六大
		</view>
		<view class="lineWithoutCricleE">
			<span class="lineTextE">一九二八</span>
		</view>
		<view class="CricleE">
		</view>
	</view>
	
	
	
	
	<view class="messageBoxF">
		<view class="messageF">
			三湾改编
		</view>
		<view class="lineWithoutCricleF">
			<span class="lineTextF">一九二七</span>
		</view>
		<view class="CricleF">
		</view>
	</view>

<view class="messageBoxG">
		<view class="messageG">
			八七会议
		</view>
		<view class="lineWithoutCricleG">
			<span class="lineTextG">一九二七</span>
		</view>
		<view class="CricleG">
		</view>
	</view>
</template>

<script setup>
	name:"MessageBoxright"
	
</script>

<style lang="scss">
.messageBoxD{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: -510px;
	transform: translateX(-20px);
}
.messageD{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleD{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleD{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}


.messageBoxE{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 150px;
	transform: translateX(0px);
}
.messageE{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleE{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleE{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.messageBoxF{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 50px;
	transform: translateX(0px);
}
.messageF{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleF{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleF{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.messageBoxG{
	width: 100%;
	display: flex;
	flex-direction: row-reverse;
	align-items: center;
	margin-top: 100px;
	transform: translateX(0px);
}
.messageG{
	background-color: white;
	width: 20%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricleG{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.CricleG{
	border-radius: 50%;
	height: 5px;
	background-color: red;
	width: 5px;
	border: 2px solid white;
}

.lineTextD {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextE {
  position: absolute;
  top: -3px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextF {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}


.lineTextG {
  position: absolute;
  top: -5px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}
</style>