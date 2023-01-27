package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="module_id")
    Integer id;

    String nomModule;

}
