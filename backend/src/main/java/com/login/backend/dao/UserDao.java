package com.login.backend.dao;

import java.util.List;
import java.util.Map;

import com.login.backend.model.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {
  @Autowired
  private SqlSession sqlSession;

  public int joinUser(User user) throws Exception {
    return sqlSession.insert("UserMapper.joinUser", user);
  }

  public User getUserInfo(User user) throws Exception {
    return sqlSession.selectOne("UserMapper.getUserInfo", user);
  }

  public int deleteUser(Map<String, Object> param) throws Exception {
    return sqlSession.delete("UserMapper.deleteUser", param);
  }

  public int changeUserPasswd(User user) throws Exception {
    return sqlSession.update("UserMapper.changeUserPasswd", user);
  }

  public List<User> getUserList() throws Exception {
    return sqlSession.selectList("UserMapper.getUserList");
  }
}
