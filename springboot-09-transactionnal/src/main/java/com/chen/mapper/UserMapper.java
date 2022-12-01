package com.chen.mapper;

import com.chen.domain.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<Users> getAll();

    int deleteById(Long id);
}
