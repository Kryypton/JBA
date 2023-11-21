package com.kryptonn.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kryptonn.jba.security.client.JBA;

@RestController
public class BlizzardController {
    @Autowired
    public BlizzardController(JBA jba) {
    }
}
