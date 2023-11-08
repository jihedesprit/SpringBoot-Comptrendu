package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
