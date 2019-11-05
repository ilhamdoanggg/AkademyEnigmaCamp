package com.enigma.services.implement;

import com.enigma.entity.Users;
import com.enigma.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomServices implements UserDetailsService {
    @Autowired
    UsersRepository usersRepository;
//
//    @Autowired
//    protected void

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users userFound = usersRepository.findByUsername(username);
        if (userFound==null){
            throw new UsernameNotFoundException(username);
        }
        User userDetails = new User (userFound.getUsername(),userFound.getPassword(),new ArrayList<GrantedAuthority>());
        return userDetails;
    }
}
