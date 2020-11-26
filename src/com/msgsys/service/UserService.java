package com.msgsys.service;

import com.msgsys.entity.User;

public interface UserService {
    int register(User user);

    User login(User user);
}
