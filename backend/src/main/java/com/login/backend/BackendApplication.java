package com.login.backend;

import java.util.Map;

import com.login.backend.dao.UserDao;
import com.login.backend.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

  @Autowired
  UserDao userdao;

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  @Override
  public void run(final String... args) throws Exception {
    join();

  }

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
