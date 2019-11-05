package com.enigma;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("password"));
        System.out.println(new BCryptPasswordEncoder().encode("password1"));
        System.out.println(new BCryptPasswordEncoder().encode("password2"));
    }
}
