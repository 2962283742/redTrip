<template>
  <div class="app">
    <header class="navbar">
      <button @click="goBack" class="back-button">返回</button>
      <h1 class="title">军史照片</h1>
      <div class="tabs">
        <button :class="{'active-tab': activeTab === '事件'}" @click="showEventWindow">事件</button>
        <button :class="{'active-tab': activeTab === '人物'}" @click="showPersonWindow">人物</button>
      </div>
    </header>
    <main class="content">
      <div v-if="activeTab === '事件'" class="grid">
        <div class="grid-item" v-for="item in events" :key="item.id">
          <img :src="item.imgSrc" :alt="item.alt" class="grid-image">
          <p class="grid-caption">{{ item.caption }}</p>
        </div>
      </div>
      <div v-else class="grid">
        <div class="grid-item" v-for="item in persons" :key="item.id">
          <img :src="item.imgSrc" :alt="item.alt" class="grid-image">
          <p class="grid-caption">{{ item.caption }}</p>
        </div>
      </div>
    </main>
    
    <div v-if="showEventModal" class="modal">
      <div class="modal-content">
        <span @click="closeEventWindow" class="close-button">&times;</span>
        <p>事件窗口内容</p>
      </div>
    </div>
    
    <div v-if="showPersonModal" class="modal">
      <div class="modal-content">
        <span @click="closePersonWindow" class="close-button">&times;</span>
        <p>人物窗口内容</p>
      </div>
    </div>
  </div>
</template>


<script>
export default {
  data() {
    return {
      activeTab: '事件',
      events: [
        { id: 1, imgSrc: 'event1.jpg', alt: '事件1', caption: '事件1说明' },
        { id: 2, imgSrc: 'event2.jpg', alt: '事件2', caption: '事件2说明' },
        { id: 3, imgSrc: 'event3.jpg', alt: '事件3', caption: '事件3说明' },
        // 添加更多事件数据
      ],
      persons: [
        { id: 1, imgSrc: 'person1.jpg', alt: '人物1', caption: '人物1说明' },
        { id: 2, imgSrc: 'person2.jpg', alt: '人物2', caption: '人物2说明' },
        { id: 3, imgSrc: 'person3.jpg', alt: '人物3', caption: '人物3说明' },
        // 添加更多人物数据
      ],
      showEventModal: false,
      showPersonModal: false
    };
  },
  methods: {
    goBack() {
      // 返回按钮的处理逻辑
    },
    showEventWindow() {
      this.activeTab = '事件';
      this.showEventModal = true;
      this.showPersonModal = false;
    },
    showPersonWindow() {
      this.activeTab = '人物';
      this.showPersonModal = true;
      this.showEventModal = false;
    },
    closeEventWindow() {
      this.showEventModal = false;
    },
    closePersonWindow() {
      this.showPersonModal = false;
    }
  }
};
</script>


<style>
.app {
  font-family: Arial, sans-serif;
}

.navbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  background-color: #f8f8f8;
  padding: 10px 20px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.back-button {
  background: none;
  border: none;
  font-size: 16px;
  cursor: pointer;
}

.title {
  font-size: 18px;
  font-weight: bold;
}

.tabs {
  display: flex;
}

.tabs button {
  background: none;
  border: none;
  font-size: 16px;
  padding: 5px 10px;
  cursor: pointer;
  position: relative;
}

.active-tab {
  color: brown;
}

.active-tab::after {
  content: '';
  display: block;
  width: 100%;
  height: 4px;
  background-color: brown;
  position: absolute;
  bottom: -5px;
  left: 0;
}

.content {
  padding: 20px;
}

.grid {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
}

.grid-item {
  flex: 1 1 calc(33.333% - 20px);
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.grid-image {
  width: 100%;
  height: auto;
}

.grid-caption {
  text-align: center;
  padding: 10px;
}

.modal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  display: flex;
  align-items: center;
  justify-content: center;
}

.modal-content {
  background: white;
  padding: 20px;
  border-radius: 5px;
  width: 80%;
  max-width: 500px;
}

.close-button {
  position: absolute;
  top: 10px;
  right: 10px;
  font-size: 20px;
  cursor: pointer;
}
</style>

