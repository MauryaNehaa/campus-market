package com.example.campusmarketbackend.controller;

import com.example.campusmarketbackend.service.CampusMarketBackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/campusmarketbackend")
public class CampusMarketBackendController {

    @Autowired
    private CampusMarketBackendService campusMarketBackendService;

}

