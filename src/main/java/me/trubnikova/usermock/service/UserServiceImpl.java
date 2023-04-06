package me.trubnikova.usermock.service;

import me.trubnikova.usermock.dao.User;
import me.trubnikova.usermock.dao.UserRepositoryImpl;

public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean checkUserExist(User user) {
        if (userRepository.getUsers().contains(user)) {
            return true;
        } else {
            return false;
        }
    }
}

