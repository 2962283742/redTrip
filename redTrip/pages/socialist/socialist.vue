<template>
	<u-navbar  @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(0, 0, 0,0.3)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				&lt;
			</view>
			
		</template>
		<template #center>
			<view class="u-nav-slot">
				中华人民共和国成立和社会主义制度建立
			</view>
		</template>
		
		<template #right>
			<view class="u-nav-slot">
				<u-icon  size="30" name="share-square"></u-icon>
			</view>
		</template>
		
	</u-navbar>
	 
	<view class="background background1"></view>
	<view class="background background2"></view>
	<view class="background background3"></view>
	<view>
	
	</view>
	<MessageBoxleft></MessageBoxleft>
	<MessageBoxright></MessageBoxright>
	
</template>

<script setup>
import MessageBoxleft from '@/components/MessageBox2/MessageBoxleft.vue'
import MessageBoxright from '@/components/MessageBox2/MessageBoxright.vue'

</script>

<style lang="scss">
.page {
  position: relative;
  width: 100%;
  height: 100vh;
  overflow: hidden;
}

.background {
  position: absolute;
  background-size: cover;
  background-repeat: no-repeat;
  filter: grayscale(100%) brightness(50%) sepia(100%) hue-rotate(0deg) saturate(5000%);
}

.background1 {
  top: 0;
  width: 80%;
  height: 42%;
  background-image: url(../../static/backgroundImage/1.png);
  background-position: top;
  left: 52%;
  transform: translateX(-50%);
}

.background2 {
  top: 33.33%;
  width: 30%;
  height: 33.33%;
  background-image: url(../../static/backgroundImage/2.png);
  background-position: center;
  left: 49.5%;
  transform: translateX(-50%);
}

.background3 {
  top: 66.66%;
  width: 100%;
  height: 33.33%;
  background-image: url(../../static/backgroundImage/3.png);
  background-position: bottom;
}
.u-navbar .u-nav-slot{
	color: white;
	font-size: 15px;
}
</style>