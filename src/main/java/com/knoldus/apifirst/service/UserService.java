package com.knoldus.apifirst.service;

import com.knoldus.apifirst.model.User;
import java.util.List;

public interface UserService {

    List<User> getUsers();

    User createUser(String name, String email, Boolean enabled);

    void delete(String id);

}
