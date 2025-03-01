package com.aaditya.rggpData.repository;

import com.aaditya.rggpData.model.Rggp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Rggp, Long> {
}
