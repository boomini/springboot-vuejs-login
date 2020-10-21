package com.login.backend;

import java.util.Map;

import com.login.backend.dao.UserDao;
import com.login.backend.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

  @Autowired
  UserDao userdao;

  @Test
  void join() throws Exception {
    User user = new User();
    user.setUser_id("kimbomin");
    user.setUser_passwd("kimbomin2");
    user.setUser_nm("김보민");
    userdao.joinUser(user);
  }

  void getUserInfo() throws Exception {
    User user = new User();
    user.setUser_id("kimbomin");
    System.out.println(userdao.getUserInfo(user));
  }

  void getUserList() throws Exception {
    System.out.println(userdao.getUserList());
  }

  void changeUserPasswd() throws Exception {
    User user = new User();
    user.setUser_id("kimbomin");
    user.setUser_passwd("kimbomin2641");
    user.setUser_nm("김보민");
    System.out.println(userdao.changeUserPasswd(user));
  }

  void deleteUser() throws Exception {
    Map<String, Object> param = Map.of("user_id", "kimbomin");
    System.out.println(userdao.deleteUser(param));
  }
}
