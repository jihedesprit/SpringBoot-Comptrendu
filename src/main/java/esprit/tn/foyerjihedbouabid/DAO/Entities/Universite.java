package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Universite")
public class Universite {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private long idUniversite;
    private String nomUniversite;
    private String adress;
}
