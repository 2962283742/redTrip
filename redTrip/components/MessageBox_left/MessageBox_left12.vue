<template>
	<view class="messageBox">
		
		
		<view class="message">
			四一二反革命政变
		</view>
		<view class="lineWithoutCricle">
			
		</view>
		<view class="Cricle">
			
		</view>
		
		
	</view>
</template>

<script setup>
	name:"MessageBox_left12"
	
	// export default {
	// 	name:"MessageBox",
	// 	data() {
	// 		return {
				
	// 		};
	// 	}
	// }
</script>

<style lang="scss">
.messageBox{
	width: 100%;
	display: flex;
	flex-direction: row;
	align-items: center;
	
}
.message{
	background-color: white;
	width: 70%;
	text-align: center;
	border-radius: 4%;
	padding: 3%;
	word-wrap: break-word;
	font-size: 5px;
}
.lineWithoutCricle{
	height: 0px;
	border: 2px solid white;
	width: 15%;
}
.Cricle{
	border-radius: 50%;
	height: 15px;
	background-color: red;
	width: 15px;
	border: 2px solid white;
}
</style>