package gp_mango.gp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "Auteur")
public class Auteur {
    @Id
    private  Long id;
    private String nom;
    private String prenom;

   private String dateNaissance;
    private String addresse;
    private String grade;
    private String Organisme;

    @DBRef
    List<Publication> publication;


    public Auteur(Long id, String nom, String prenom, String dateNaissance, String addresse, String grade, String organisme) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.addresse = addresse;
        this.grade = grade;
        this.Organisme = organisme;
    }

    public Auteur() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getGrade() {
        return grade;
    }

    public String getOrganisme() {
        return Organisme;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setOrganisme(String organisme) {
        Organisme = organisme;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
