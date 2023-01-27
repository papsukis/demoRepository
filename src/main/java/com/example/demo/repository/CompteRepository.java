package com.example.demo.repository;

import com.example.demo.banque.Compte;
import com.example.demo.repository.impl.CustomCompteRepositoryImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte,Integer>, CustomCompteRepository {

}
