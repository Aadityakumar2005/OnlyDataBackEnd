package com.aaditya.rggpData.repository;

import com.aaditya.rggpData.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepo extends JpaRepository<Email, String> {

}
