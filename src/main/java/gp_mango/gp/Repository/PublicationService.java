package gp_mango.gp.Repository;
import gp_mango.gp.entity.Auteur;
import gp_mango.gp.entity.Publication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PublicationService {

        private final MongoTemplate mongoTemplate;

        public PublicationService(MongoTemplate mongoTemplate) {
            this.mongoTemplate = mongoTemplate;
        }

        //chercher par titre de publication
        public List<Publication> findByTitre(String titre){
            Query query = new Query()
                    .addCriteria((Criteria.where("titre").is(titre)));
            return mongoTemplate.find(query, Publication.class);
        }

        //chercher par categorie

        public List<Publication> findByCategorie(String categorie){
        Query query = new Query()
                .addCriteria((Criteria.where("categorie").is(categorie)));
        return mongoTemplate.find(query, Publication.class);
        }

        //chercher par discipline

        public List<Publication> findByDiscipline(String discipline){
            Query query = new Query()
                .addCriteria((Criteria.where("discipline").is(discipline)));
        return mongoTemplate.find(query, Publication.class);
        }


        //chercher les publications  par auteur

        public List<Publication> findByAut(String auteur){
            Query query = new Query()
                .addCriteria((Criteria.where("auteur").is(auteur)));
        return mongoTemplate.find(query, Publication.class);
        }




    }
