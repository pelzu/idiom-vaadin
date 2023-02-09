package com.example.vaadin.backend.repository;

import com.example.vaadin.backend.model.Idiom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomRepository extends JpaRepository<Idiom, Long> {
}
