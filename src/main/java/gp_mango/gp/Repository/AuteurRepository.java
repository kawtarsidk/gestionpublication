package gp_mango.gp.Repository;

import gp_mango.gp.entity.Auteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuteurRepository extends MongoRepository<Auteur,Long> {
}
