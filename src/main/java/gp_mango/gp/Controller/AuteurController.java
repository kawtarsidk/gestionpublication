package gp_mango.gp.Controller;

import gp_mango.gp.Repository.AuteurRepository;
import gp_mango.gp.entity.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("auteurs")
public class AuteurController {
    @Autowired
    private AuteurRepository auteurRepository;

    @PostMapping("/save")
    public void save(@RequestBody Auteur auteur){
        auteurRepository.save(auteur);
    }

    @GetMapping("/get")
    public List<Auteur> findAll(){
        return auteurRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")  Long id){
        auteurRepository.deleteById(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody Auteur auteur){
        auteurRepository.save(auteur);
    }
}



