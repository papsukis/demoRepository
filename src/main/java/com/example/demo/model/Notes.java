package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="notes")
public class Notes {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="note_id")
    Integer id;

    float note;

    String cours;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="student_id")
    Student student;

}
