package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.User;

import java.util.List;

public interface UserService  {
    User findUserById(int id);
    List<User> findAllUsers();
}
