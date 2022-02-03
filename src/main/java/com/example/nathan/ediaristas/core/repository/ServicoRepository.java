package com.example.nathan.ediaristas.core.repository;

import com.example.nathan.ediaristas.core.models.Servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long>{
    
}
