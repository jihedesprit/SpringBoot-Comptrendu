package esprit.tn.foyerjihedbouabid.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id

    @Column(name = "idReservation")
    String idReservation;
    Date anneeUniversitaire;
    boolean estVide;
    @ManyToMany(mappedBy = "reset")
    Set<Etudiant> etudiant;
}
