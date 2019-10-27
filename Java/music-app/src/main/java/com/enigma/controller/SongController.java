package com.enigma.controller;

import com.enigma.services.interfaces.SongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    @Autowired
    SongServices songServices;
}
