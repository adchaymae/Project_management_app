<template>
  <div>
    <h2>Login</h2>
    <form @submit.prevent="login">
      <div>
        <label for="username">Username:</label>
        <input type="text" id="username" v-model="username" />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" v-model="password" />
      </div>
      <div>
        <button type="submit">Login</button>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: ''
    };
  },
  methods: {
    async login() {
      try {
        const response = await this.$http.post('/login', {
          username: this.username,
          password: this.password
        });
        if (response.status === 200) {
          this.$router.push('/Users/admin/Desktop/Spring-CRUD-Example-Project-Management-App/src/main/resources/templates/main_page.html');
        }
      } catch (error) {
        console.error('Failed to login', error);
      }
    }
  }
};
</script>
