package com.enigma.services.implement;

import com.enigma.entity.Users;
import com.enigma.repository.UsersRepository;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UserServices {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users saveUser(Users users) {
        return null;
    }

    @Override
    public Page<Users> getAllUserWithPage(Pageable pageable) {
        return null;
    }

    @Override
    public Users getUserById(String id) {
        return null;
    }

    @Override
    public void deleteUserById(String id) {

    }
}
