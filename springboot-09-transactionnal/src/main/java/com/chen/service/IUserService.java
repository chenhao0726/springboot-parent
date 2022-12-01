package com.chen.service;

import com.chen.domain.Users;

import java.util.List;

public interface IUserService {

    List<Users> getAll();

    int deleteById(Long id);
}
