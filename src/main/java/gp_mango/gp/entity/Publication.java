package gp_mango.gp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String titre;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String versionNum;
    private String resume;

    public Publication() {
    }

    public Publication(String titre, Date date, String versionNum, String resume) {
        this.titre = titre;
        this.date = date;
        this.versionNum = versionNum;
        this.resume = resume;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
}
