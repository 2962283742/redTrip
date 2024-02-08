<template>
	<view class="messageBoxD">
		<view class="messageD">
			中华民族共和国的成立和社会主义制度的建立
		</view>
		<view class="lineWithoutCricleD">
			<span class="lineTextD">一九四九</span>
		</view>
		<view class="CricleD">
		</view>
	</view>
	
	
	
	<view class="messageBoxE">
		<view class="messageE">
			全民族抗日战争的中流砥柱
		</view>
		<view class="lineWithoutCricleE">
			<span class="lineTextE">一九三五</span>
		</view>
		<view class="CricleE">
		</view>
	</view>
	
	
	
	
	<view class="messageBoxF">
		<view class="messageF">
			中国共产党的创建和投身大革命的洪流
		</view>
		<view class="lineWithoutCricleF">
			<span class="lineTextF">一九二一</span>
		</view>
		<view class="CricleF">
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
	margin-top: -500px;
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
	margin-top: 100px;
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

.lineTextD {
  position: absolute;
  top: 15px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextE {
  position: absolute;
  top: 0px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

.lineTextF {
  position: absolute;
  top: 10px;
  left: 50%;
  transform: translateX(60%);
  padding: 2px;
  font-size: 10px;
  color: white;
}

</style>