package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "Reservation")
public class Reservation {
    @Id

    @Column(name = "idReservation")
    private long idReservation;
    private Date anneeUniversitaire;
    private boolean estVide;
}
