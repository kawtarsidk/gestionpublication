package gp_mango.gp.Repository;

import gp_mango.gp.entity.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicationRepository extends MongoRepository<Publication,Long> {
}
