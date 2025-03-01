package com.aaditya.rggpData.service;

import com.aaditya.rggpData.model.Email;
import com.aaditya.rggpData.repository.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    EmailRepo emailRepo;


    public void addEmail(Email data) {
        emailRepo.save(data);
    }
}
