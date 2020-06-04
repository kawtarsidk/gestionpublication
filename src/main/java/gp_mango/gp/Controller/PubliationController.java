package gp_mango.gp.Controller;

import gp_mango.gp.Repository.PublicationRepository;
import gp_mango.gp.entity.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("publications")
public class PubliationController {
    @Autowired
    private PublicationRepository publicationRepository;

    @PostMapping("/save")
    public void save(@RequestBody Publication publication){
        publicationRepository.save(publication);
    }

    @GetMapping("/get")
    public List<Publication> findAll() {
        return publicationRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        publicationRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Publication publication){
        publicationRepository.save(publication);
    }
}
