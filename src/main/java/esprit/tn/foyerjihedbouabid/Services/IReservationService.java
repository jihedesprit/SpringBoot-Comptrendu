package esprit.tn.foyerjihedbouabid.Services;

import esprit.tn.foyerjihedbouabid.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation b);

    List<Reservation> addAllReservations(List<Reservation> reservations);

    Reservation updateReservation(Reservation b);

    List<Reservation> updateAllReservations(List<Reservation> reservations);

    List<Reservation> findAllReservations();


    Reservation findReservationById(String id);

    void deleteReservation(Reservation b);


    void deleteReservationById(String id);
}
