package gp_mango.gp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String auteur;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }




    public Publication() {
    }

    public Publication(Long id,String titre, String date, String versionNum, String resume, String categorie, String discipline ,String auteurName) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.versionNum = versionNum;
        this.resume = resume;
        this.categorie = categorie;
        this.discipline = discipline;
        this.auteur = auteurName;
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
