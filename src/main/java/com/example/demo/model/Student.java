package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    Integer id;
    String fullname;
    String dateNaissance;
    String addresse;
    String email;

    @OneToMany(mappedBy = "student")
    Set<Notes> notes;




}
