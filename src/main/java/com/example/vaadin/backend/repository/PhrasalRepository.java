package com.example.vaadin.backend.repository;


import com.example.vaadin.backend.model.PhrasalVerb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhrasalRepository extends JpaRepository<PhrasalVerb, Long> {
}
