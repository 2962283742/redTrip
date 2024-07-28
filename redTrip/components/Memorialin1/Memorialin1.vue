<template>
	<u-image :show-loading="true" src="https://img.js.design/assets/img/65af8f71329c0dd38e076d02.jpg" width="350px" height="190px" mode="aspectFill" radius="10" class="content">
	</u-image>
	<view class="tab-buttons">
	  <button
	    :class="{ active: currentTab === 'events' }"
	    @click="currentTab = 'events'"
	  >
	    简介
	    <view class="tab-underline">
	      <view
	        v-if="currentTab === 'events'"
	        class="underline"
	      ></view>
	    </view>
	  </button>
	  <button
	    :class="{ active: currentTab === 'show' }"
	    @click="currentTab = 'show'"
	  >
	    展品展示
	    <view class="tab-underline">
	      <view
	        v-if="currentTab === 'show'"
	        class="underline"
	      ></view>
	    </view>
	  </button>
	</view>
	
	<view v-if="currentTab === 'events'">
	  <!-- 简介页面的内容 -->
	  <view class="content">
	  <p>
		  中国人民抗日战争纪念馆位于北京市丰台区卢沟桥宛平城内街101号，距市中心约15千米，占地面积35000平方米，建筑面积36100平方米，是全国唯一一座全面反映中国人民抗日战争历史的大型综合性专题纪念馆。 
	  </p>
	
	  <p>
		中国人民抗日战争纪念馆馆藏文物共30000件/套（截至2019年末） ，其中一级藏品达百余件/套。文物藏品以民国二十年（1931年）至民国三十四年（1945年）抗日战争时期的各种历史文献和相关实物为主，同时也收藏日本自清同治十三年（1874年）以来侵略和占领台湾的各类文物，内容涉及军事、政治、经济、文化、社会等历史侧面。	  
	  </p>
	  
	  <p>
		 中国人民抗日战争纪念馆是国家一级博物馆、全国优秀爱国主义教育示范基地、北京市优秀爱国主义教育基地 、全国国防教育基地、全国廉政教育基地、全国百家红色旅游经典景区，是中国抗日战争史学会秘书处所在地、中国博物馆协会纪念馆专业委员会主任委员单位。	  
	  </p>
	  
	  <p>
		2022年7月7日下午，中国人民抗日战争纪念馆恢复开放。8月15日，中国人民抗日战争纪念馆将正常开放。
	  </p>
	  
	  <p>
		2022年11月20日起，中国人民抗日战争纪念馆临时闭馆。 2022年12月13日，中国人民抗日战争纪念馆恢复开放。	  
	  </p>
	  
	  <p>
		中国人民抗日战争纪念馆座落于中华民族全面抗日战争的爆发地——北京卢沟桥畔的宛平城内，占地面积35000平方米，建筑面积36100平方米。正前方是面积达8600平方米的抗战广场，广场中央矗立着象征中华民族觉醒的“卢沟醒狮”，广场中轴线两侧各分布着7块草坪，寓意七七事变爆发地和中华民族的十四年抗日战争。基座为汉白玉、高达14米的国旗杆竖立在广场北侧。覆以乳白色大理石的展馆外墙与镶嵌着独立自由勋章图案的锻铜大门，在抗战馆二级平台上安放着质地为锻铜的独立自由勋章雕塑。	  
	  </p>
	  </view>
	</view>
	
	
	<view v-if="currentTab === 'show'">
	      <!-- 展品展示页面的内容 -->
	<view class="event">
		<u-row>
			<u-col span="5">
				<view class="card-body" @click="navigateToChroniclein">
				  <u-image :show-loading="true" src="https://img.js.design/assets/img/65af91cd1629325e1f61b3af.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				  <u-text text="孔宪全委任状" align="center" lineHeight="25px"></u-text>
				</view>
			</u-col>
			<u-col span="5" offset="2">
			<view class="card-body">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65af923a57cb0b21d29151a8.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				<u-text text="彭德怀木刻画" align="center" radius="20" lineHeight="25px"></u-text>
			</view>
			</u-col>
		</u-row>
		<u-row>
			<u-col span="5">
			<view class="card-body">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65af9245dedfed33aa978c5e.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				<u-text text="孤军营纪念章" align="center" lineHeight="25px"></u-text>
			</view>
			</u-col>
			<u-col span="5" offset="2">
			<view class="card-body">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65af924f329c0dd38e07be44.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				<u-text text="傅作义望远镜" align="center" lineHeight="25px"></u-text>
			</view>
			</u-col>
		</u-row>
		<u-row>
			<u-col span="5">
			<view class="card-body">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65af925ba1bc8488162dd46f.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				<u-text text="王唯真连环画" align="center" lineHeight="25px"></u-text>
			</view>
			</u-col>
			<u-col span="5" offset="2">
			<view class="card-body">
				<u-image :show-loading="true" src="https://img.js.design/assets/img/65af926a664ea91df2eeedbc.png" width="150px" height="130px" radius="20" mode="aspectFill"></u-image>
				<u-text text="毛泽东书手迹" align="center" lineHeight="25px"></u-text>
			</view>
			</u-col>
		</u-row>
	</view>
	
	    </view>
</template>

<script setup>
import { ref } from 'vue';
const currentTab = ref('events');

function rightClick() {
  // 右侧按钮点击事件的处理逻辑
}	
</script>

<style>
	.card-body {
	  width: 100%;
	  display: flex;
	  flex-direction: column;
	  justify-content: center;
	  align-items: center;
	}
	.content{
		padding:10px;/* 设置元素内边距为 10px */
		line-height: 25px;/* 设置元素的行高为 30px */
		font-size: 15px;
	}
	page {
	  background-color: rgb(255, 255, 255);
	  background-size: cover;
	  background-repeat: no-repeat;
	  
	  display: flex;
	  flex-direction: column;
	  justify-content: center;
	  align-items: center;
	}
	p{
		text-indent: 10%;
	}
	
	.event{
		margin: 20px;
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