package com.youcode.reservation.service;

import com.youcode.reservation.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
