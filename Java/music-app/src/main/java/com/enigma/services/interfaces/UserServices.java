package com.enigma.services.interfaces;

import com.enigma.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserServices {
    Users saveUser(Users users);
    Page<Users> getAllUserWithPage(Pageable pageable);
    Users getUserById(String id);
    void deleteUserById(String id);

}
