package com.example.demo.banque;

        import lombok.Data;

        import javax.persistence.*;

@Data
    @Entity
    @Table(name="bank_transaction")
    public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="transaction_id")
        Integer id;

        int nouvellevaleur;
        int ancienvaleur;
        String date;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

    }

