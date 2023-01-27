package com.example.demo.services;

import com.example.demo.banque.Compte;
import com.example.demo.model.Compte2;
import com.example.demo.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CompteService {


    @Autowired
    CompteRepository compteRepository;


    public List<?> findAllComptes(){
        List<Compte> tmp=compteRepository.findAllComptes();

//        for(Compte c:tmp){
//            c.setCompte(c.getCompte()+1000);
//        }
//        tmp=tmp

        Map<String,List<Compte>> test=new HashMap<>();

        test=tmp
                .stream()
                .collect(Collectors.groupingBy(Compte::getUtilisateur));

        return tmp.stream()
                .sorted(Comparator.comparing(Compte::getCompte).reversed())
                .collect(Collectors.toList());


    }
    public List<Compte> findCompteByID(int id){

        return compteRepository.findCompteById(id);
    }
    public Compte createCompte(Compte compte){
        return compteRepository.save(compte);
    }
    public void deleteCompte(Compte compte){
        compteRepository.deleteById(compte.getId());
    }


    public List<Compte> findCompteWithMoreThan(int qte) {
        return compteRepository.findCompteWithMoreThan(qte);
    }
}
