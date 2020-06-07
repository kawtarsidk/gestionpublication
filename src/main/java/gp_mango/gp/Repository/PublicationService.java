package gp_mango.gp.Repository;
import gp_mango.gp.entity.Publication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublicationService {

        private final MongoTemplate mongoTemplate;

        public PublicationService(MongoTemplate mongoTemplate) {
            this.mongoTemplate = mongoTemplate;
        }

        public List<Publication> findByTitre(String titre){
            org.springframework.data.mongodb.core.query.Query query = new Query()
                    .addCriteria((Criteria.where("titre").is(titre)));
            return mongoTemplate.find(query, Publication.class);
        }
    }
