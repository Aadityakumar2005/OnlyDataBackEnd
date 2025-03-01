package com.aaditya.rggpData.controller;

import com.aaditya.rggpData.model.Email;
import com.aaditya.rggpData.model.Rggp;
import com.aaditya.rggpData.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/email")
    public void addEmail(@RequestBody Email data) {
        emailService.addEmail(data);
    }
}
