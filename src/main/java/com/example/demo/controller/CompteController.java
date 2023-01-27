package com.example.demo.controller;

import com.example.demo.banque.Compte;
import com.example.demo.services.CompteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
public class CompteController {

    @Autowired
    CompteService  compteService;


    @RequestMapping(value="/findAllComptes", method = RequestMethod.GET)
    public ResponseEntity<?> findAllComptes()  {
//        int i=2;
//        String test=i==2?"est 2":"n'est pas deux";
//        System.out.println(test);


//        List<Compte> result=;
        return ResponseEntity.ok(compteService.findAllComptes());
    }
    @RequestMapping(value="/findCompteWithMoreThan", method = RequestMethod.GET)
    public ResponseEntity<List<Compte>> findCompteWithMoreThan(@RequestParam int quantity)  {
        List<Compte> result=compteService.findCompteWithMoreThan(quantity);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value="/findCompteById", method = RequestMethod.GET)
    public ResponseEntity<List<Compte>> findCompteById(@RequestParam int id)  {
        log.info(""+id);
        List<Compte> result=compteService.findCompteByID(id);
        return ResponseEntity.ok(result);
    }
    @RequestMapping(value="/createCompte", method = RequestMethod.POST)
    public ResponseEntity<Compte> createCompte(@RequestBody Compte compte)  {
        log.info(compte.toString());
        Compte result=compteService.createCompte(compte);
        return ResponseEntity.ok(result);
    }
    @RequestMapping(value="/deleteCompte", method = RequestMethod.POST)
    public ResponseEntity<Boolean> deleteCompte(@RequestBody Compte compte)  {
        compteService.deleteCompte(compte);
        return ResponseEntity.ok(true);
    }
}
