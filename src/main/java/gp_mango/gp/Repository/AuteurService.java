package gp_mango.gp.Repository;

import gp_mango.gp.entity.Auteur;
import gp_mango.gp.entity.Publication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {
    private final MongoTemplate mongoTemplate;

    public AuteurService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Auteur> findByName(String name){
        org.springframework.data.mongodb.core.query.Query query = new Query()
                .addCriteria((Criteria.where("nom").is(name)));
        return mongoTemplate.find(query, Auteur.class);
    }
}

