<template>
  <button :style="getStyle('A')" @click="setActiveButton('A')">
    <span class="option">A</span> 刘少奇
    <span v-if="activeButton === 'A'" class="close">×</span>
  </button>
  <button :style="getStyle('B')" @click="setActiveButton('B')">
    <span class="option">B</span> 周恩来
    <span v-if="activeButton === 'B'" class="close">×</span>
  </button>
  <button :style="getStyle('C')" @click="setActiveButton('C')">
    <span class="option">C</span> 朱德
    <span v-if="activeButton === 'C'" class="close">×</span>
  </button>
  <button :style="getStyle('D')" @click="setActiveButton('D')">
    <span class="option">D</span> 王稼祥
    <span v-if="activeButton === 'D'" class="close">×</span>
  </button>
</template>

<script setup>
import { ref } from 'vue'

const activeButton = ref('')

const setActiveButton = (button) => {
  activeButton.value = button
}

const getStyle = (button) => {
  return activeButton.value === button
    ? { backgroundColor: 'rgba(254, 236, 236, 1)', color: 'rgba(241, 74, 72, 1)' }
    : {}
}
</script>

<style>
button {
  margin-top: 30px;
  font-weight: bold;
  font-size: 20px;
  position: relative;
  padding-right: 40px; /* 为了给右边的 × 留出更多空间 */
  display: flex;
  align-items: center;
}

button .option {
  margin-right: 30px; /* 选项与人名之间的间距 */
}

button .close {
  position: absolute;
  right: 10px;
  color: rgba(241, 74, 72, 1);
  font-size: 50px; /* 增大 × 的字体大小 */
  line-height: 1; /* 确保行高不影响垂直居中 */
  top: 44%;
  transform: translateY(-50%);
}
</style>
