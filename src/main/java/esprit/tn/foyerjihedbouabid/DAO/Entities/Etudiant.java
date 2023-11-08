package esprit.tn.foyerjihedbouabid.DAO.Entities;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private long idFoyer;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;
}
