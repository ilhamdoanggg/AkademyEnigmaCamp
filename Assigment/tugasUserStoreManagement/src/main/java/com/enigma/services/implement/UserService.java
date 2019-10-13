package com.enigma.services.iml;

import com.enigma.entity.Users;
import com.enigma.repository.UserRepo;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServices {

    @Autowired
    UserRepo userRepo;
    @Override
    public Users save(Users users) {
        return userRepo.save(users);
    }
    @Override
    public Users getUser(String id) {
        return userRepo.findById(id).get();
    }
    @Override
    public List<Users> getAllUser(Users users) {
        return userRepo.findAll();
    }
    @Override
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
