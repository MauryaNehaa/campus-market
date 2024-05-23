package com.example.campusmarketbackend.repository;

import com.example.campusmarketbackend.model.Campus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusRepository extends JpaRepository<Campus, Long> {
    // You can add custom query methods here if needed
}

