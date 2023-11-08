package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Universite")
public class Universite {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private long idUniversite;
    private String nomUniversite;
    private String adress;
}
