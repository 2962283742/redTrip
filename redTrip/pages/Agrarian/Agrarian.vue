<template>
	<u-navbar  @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(0, 0, 0,0.3)" placeholder>
		<template #left>
			<view class="u-nav-slot">
				&lt;
			</view>
			
		</template>
		<template #center>
			<view class="u-nav-slot">
				土地革命时期
			</view>
		</template>
		
		<template #right>
			<view class="u-nav-slot">
				<u-icon  size="40" name="share-square"></u-icon>
			</view>
		</template>
		
	</u-navbar>

	<view>
	
	
	</view>
	<MessageBoxleft></MessageBoxleft>
	<MessageBoxright></MessageBoxright>
	
	
</template>

<script setup>
import MessageBoxleft from '@/components/MessageBox/MessageBox3/MessageBoxleft.vue'
import MessageBoxright from '@/components/MessageBox/MessageBox3/MessageBoxright.vue'

</script>


<style lang="scss">
page{
	background-image: url(../../static/backgroundImage/ChinesePillarBg.png);
	background-size: cover;
	background-repeat: no-repeat;
	
	
}
.u-navbar .u-nav-slot{
	color: white;
	font-size: 15px;
}
</style>


