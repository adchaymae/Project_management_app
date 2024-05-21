import Vue from 'vue';
import App from './App.vue';
import VueRouter from 'vue-router';
import axios from 'axios';
import Home from './components/Home.vue';
import Login from './components/Login.vue';

Vue.config.productionTip = false;

Vue.use(VueRouter);

Vue.prototype.$http = axios;

const routes = [
    { path: '/login', component: Login },
    { path: '/main_page.html', component: home },
    { path: '*', redirect: '' }
];

const router = new VueRouter({
    mode: 'history',
    routes
});

new Vue({
    router,
    render: h => h(App)
}).$mount('#app');
