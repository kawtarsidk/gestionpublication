package gp_mango.gp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Document(collection = "Publication")
public class Publication {
    @Id
    private Long id;
    private String titre;
    private String date;
    private String versionNum;
    private String resume;
    private String categorie;
    private String discipline;

    public Auteur getAuteurs() {
        return auteur;
    }

    public void setAuteurs(Auteur auteur) {
        this.auteur = auteur;
    }

    @DBRef
    Auteur auteur;

    public Publication() {
    }

    public Publication(Long id,String titre, String date, String versionNum, String resume, String categorie, String discipline , Auteur auteur) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.versionNum = versionNum;
        this.resume = resume;
        this.categorie = categorie;
        this.discipline = discipline;
        this.auteur= auteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
