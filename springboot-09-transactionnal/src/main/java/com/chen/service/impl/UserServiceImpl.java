package com.chen.service.impl;

import com.chen.domain.Users;
import com.chen.mapper.UserMapper;
import com.chen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> getAll() {
        return userMapper.getAll();
    }

    @Override
    @Transactional
    public int deleteById(Long id){
        return userMapper.deleteById(id);
    }
}
