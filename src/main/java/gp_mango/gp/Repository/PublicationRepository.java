package gp_mango.gp.Repository;

import gp_mango.gp.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publication,Long> {
}
