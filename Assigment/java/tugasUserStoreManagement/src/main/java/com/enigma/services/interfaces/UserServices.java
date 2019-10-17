package com.enigma.services.interfaces;

import com.enigma.entity.Users;

import java.util.List;

public interface UserServices {
    Users save(Users users);
    Users getUser(String id);
    List<Users> getAllUser(Users users);
    void deleteUser(String id);
}
