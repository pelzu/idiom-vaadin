package com.example.vaadin.model.phrasal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhrasalRepository extends JpaRepository<PhrasalVerb, Long> {
}
