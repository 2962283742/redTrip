<template>
  <u-scroll-view>
    <u-navbar @rightClick="rightClick" safeAreaInsetTop :autoBack="true" bgColor="rgba(255, 255, 255, 1.0)" placeholder>
      <template #left>
        <view class="u-nav-slot">
          <u-image :show-loading="true" src="../../static/redMetting/left.png" width="20px"
            height="30px" class="filtered-image1"></u-image>
        </view>
      </template>

      <template #center>
        <view class="u-nav-slot">
          军记史书
        </view>
      </template>
      <template #right>
        <view class="u-nav-slot">
          <u-icon size="40" name="share-square" color="rgba(0, 0, 0, 1.0)"></u-icon>
        </view>
      </template>
    </u-navbar>

    <view class="tab-buttons">
      <button
        :class="{ active: currentTab === 'events' }"
        @click="currentTab = 'events'"
      >
        事件
        <view class="tab-underline">
          <view
            v-if="currentTab === 'events'"
            class="underline"
          ></view>
        </view>
      </button>
      <button
        :class="{ active: currentTab === 'people' }"
        @click="currentTab = 'people'"
      >
        人物
        <view class="tab-underline">
          <view
            v-if="currentTab === 'people'"
            class="underline"
          ></view>
        </view>
      </button>
    </view>

    <view v-if="currentTab === 'events'">
      <!-- 事件页面的内容 -->
	  
	  <view class="event">
	  	<u-row>
	  		<u-col span="5">
	  			<Chronicle></Chronicle>
	  		</u-col>
	  		<u-col span="5" offset="2">
	  		<Chronicle2></Chronicle2>
	  		</u-col>
	  	</u-row>
	  	<u-row>
	  		<u-col span="5">
	  		<Chronicle3></Chronicle3>
	  		</u-col>
	  		<u-col span="5" offset="2">
	  		<Chronicle4></Chronicle4>
	  		</u-col>
	  	</u-row>
	  	<u-row>
	  		<u-col span="5">
	  		<Chronicle5></Chronicle5>
	  		</u-col>
	  		<u-col span="5" offset="2">
	  		<Chronicle6></Chronicle6>
	  		</u-col>
	  	</u-row>
	  	<u-row>
	  		<u-col span="5">
	  		<Chronicle7></Chronicle7>
	  		</u-col>
	  		<u-col span="5" offset="2">
	  		<Chronicle8></Chronicle8>
	  		</u-col>
	  	</u-row>
	  </view>

	</view>
    
	
	<view v-if="currentTab === 'people'">
	      <!-- 人物页面的内容 -->

		  <view class="event">
		  	<u-row>
		  		<u-col span="5">
		  			<Chronicle9></Chronicle9>
		  		</u-col>
		  		<u-col span="5" offset="2">
		  		<Chronicle10></Chronicle10>
		  		</u-col>
		  	</u-row>
		  	<u-row>
		  		<u-col span="5">
		  		<Chronicle11></Chronicle11>
		  		</u-col>
		  		<u-col span="5" offset="2">
		  		<Chronicle12></Chronicle12>
		  		</u-col>
		  	</u-row>
		  	<u-row>
		  		<u-col span="5">
		  		<Chronicle13></Chronicle13>
		  		</u-col>
		  		<u-col span="5" offset="2">
		  		<Chronicle14></Chronicle14>
		  		</u-col>
		  	</u-row>
		  	<u-row>
		  		<u-col span="5">
		  		<Chronicle15></Chronicle15>
		  		</u-col>
		  		<u-col span="5" offset="2">
		  		<Chronicle16></Chronicle16>
		  		</u-col>
		  	</u-row>
		  </view>
		  
		  
		  
	    </view>
  </u-scroll-view>
</template>

<script setup>
import Chronicle from '/components/Chronicle-people/Chronicle.vue'
import Chronicle2 from '/components/Chronicle-people/Chronicle2.vue'
import Chronicle3 from '/components/Chronicle-people/Chronicle3.vue'
import Chronicle4 from '/components/Chronicle-people/Chronicle4.vue'
import Chronicle5 from '/components/Chronicle-people/Chronicle5.vue'
import Chronicle6 from '/components/Chronicle-people/Chronicle6.vue'
import Chronicle7 from '/components/Chronicle-people/Chronicle7.vue'
import Chronicle8 from '/components/Chronicle-people/Chronicle8.vue'


import Chronicle9 from '/components/Chronicle-event/Chronicle9.vue'
import Chronicle10 from '/components/Chronicle-event/Chronicle10.vue'
import Chronicle11 from '/components/Chronicle-event/Chronicle11.vue'
import Chronicle12 from '/components/Chronicle-event/Chronicle12.vue'
import Chronicle13 from '/components/Chronicle-event/Chronicle13.vue'
import Chronicle14 from '/components/Chronicle-event/Chronicle14.vue'
import Chronicle15 from '/components/Chronicle-event/Chronicle15.vue'
import Chronicle16 from '/components/Chronicle-event/Chronicle16.vue'	
import { ref } from 'vue';
const currentTab = ref('events');

function rightClick() {
  // 右侧按钮点击事件的处理逻辑
}
</script>

<style>
page { 
  background-color: rgb(255, 255, 255);
  background-size: cover;
  background-repeat: no-repeat;
  
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.event{
	margin: 20px;
}


.u-navbar .u-nav-slot {
  color: black;
  font-size: 18px;
}

.u-nav-slot-left {
  color: rgba(0, 0, 0, 1.0);
  font-size: 30px;
}

.filtered-image1 {
    filter: brightness(0%) saturate(0%);
}

.tab-buttons {
  display: flex;
  justify-content: center;
  margin-top: 20px;
}

button {
  background-color: white;
  border: none;
  outline: none;
  padding: 0px 10px;
  cursor: pointer;
  position: relative;
  font-size: 16px;
}

button.active {
  color: black;
  font-weight: bold;
}

.tab-underline {
  display: flex;
  justify-content: center;
  margin-top: 0px;
}

.underline {
  width: 30px;
  height: 3px;
  background-color: brown;
}

button + button {
  margin-left: 15px;
}	
</style>
