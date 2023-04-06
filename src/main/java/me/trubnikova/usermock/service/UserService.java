package me.trubnikova.usermock.service;

import me.trubnikova.usermock.dao.User;

public interface UserService {
    boolean checkUserExist(User user);
}
