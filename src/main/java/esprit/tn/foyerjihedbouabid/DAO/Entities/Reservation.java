package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id

    @Column(name = "idReservation")
    private long idReservation;
    private Date anneeUniversitaire;
    private boolean estVide;
}
