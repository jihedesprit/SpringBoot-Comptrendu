package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre chambre;
}
