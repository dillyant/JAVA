package com.dillyant.dao;

import com.dillyant.model.User;

public interface UserMapper {
    User selectByPrimaryKey(Integer id);
}