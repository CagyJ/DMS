package com.system.dms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.system.dms.entity.User;
import com.system.dms.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public List<User> listAll() {
    List<User> list = userMapper.selectList(new QueryWrapper<>());
    return list;
  }

  public User findById(Integer id) {
    return userMapper.selectById(id);
  }
}
