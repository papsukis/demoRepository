
package com.example.demo.banque;

        import javax.persistence.*;

        import com.fasterxml.jackson.annotation.JsonAlias;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import lombok.Data;

@Data
@Entity
@Table(name="compte")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="compte_id")
    Integer id;
    int compte;
    String utilisateur;
    Boolean carteBancaire;

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", compte=" + compte +
                ", utilisateur='" + utilisateur + '\'' +
                ", carteBancaire=" + carteBancaire +
                '}';
    }
}

