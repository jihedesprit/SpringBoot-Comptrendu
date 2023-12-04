package esprit.tn.foyerjihedbouabid.Services;


import esprit.tn.foyerjihedbouabid.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant b);

    List<Etudiant> addAllEtudiants(List<Etudiant> etudiants);

    Etudiant updateEtudiant(Etudiant b);

    List<Etudiant> updateAllEtudiants(List<Etudiant> etudiants);

    List<Etudiant> findAllEtudiants();

    Etudiant findEtudiantById(long id);

    void deleteEtudiant(Etudiant b);

    void deleteEtudiantById(long id);
}
