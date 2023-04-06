package me.trubnikova.usermock.dao;

import java.util.Collection;

public interface UserRepository {
    String getUserByName(String name);

    Collection<User> findAllUsers();
}