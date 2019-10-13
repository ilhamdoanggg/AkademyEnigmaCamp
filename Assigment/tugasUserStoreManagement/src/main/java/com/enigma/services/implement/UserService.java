package com.enigma.services.implement;

import com.enigma.entity.Users;
import com.enigma.repository.UserRepo;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
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
        if (!userRepo.findById(id).isPresent()){
            return new Users();
        }
        return userRepo.findById(id).get();
    }
    @Override
    public List<Users> getAllUser(Users users) {
    /* if (!userRepo.findAll().containsAll(users)){
            return new Users();
        }*/
        return userRepo.findAll();
    }
    @Override
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
