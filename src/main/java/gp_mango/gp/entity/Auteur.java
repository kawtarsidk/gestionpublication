package gp_mango.gp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Auteur {
    @Id
    private  int id;

    private String nom;
    private String prenom;
    private Date   dateNaissance;
    private String addresse;
    private String grade;
    private String Organisme;

    public Auteur(int id, String nom, String prenom, Date dateNaissance, String addresse, String grade, String organisme) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.addresse = addresse;
        this.grade = grade;
        Organisme = organisme;
    }

    public Auteur() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
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

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
