package com.enigma.controller;

import com.enigma.entity.Users;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(maxAge = 3600)

@RestController
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("user/{id}")
    public Users getUserId(@PathVariable String id){
        return userServices.getUser(id);
    }

    /*@CrossOrigin(origins = "http://localhost:9090", allowCredentials = "false")*/
    @CrossOrigin
    @GetMapping("users")
    public List<Users> getAllUsers(Users users){
        return userServices.getAllUser(users);
    }
    @PostMapping("user")
    public Users saveNewUser(@RequestBody Users users){
        return userServices.save(users);
    }
    @DeleteMapping("user/{id}")
    public void deleteUserById(@PathVariable String id){
        userServices.deleteUser(id);
    }
}
