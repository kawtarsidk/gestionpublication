package gp_mango.gp.Controller;

import gp_mango.gp.Repository.AuteurRepository;
import gp_mango.gp.Repository.PublicationRepository;
import gp_mango.gp.Repository.PublicationService;
import gp_mango.gp.entity.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class PublicationController {
    @Autowired
    private PublicationRepository publicationRepository;

    //redefinition de la classe publicationService
    @Autowired
    private PublicationService publicationService;
    @Autowired
    private AuteurRepository auteurRepository;

    @GetMapping("/addPublication")
    public String addPub(Publication publication, Model model)
    {
        model.addAttribute("auteurs", auteurRepository.findAll());
        return "addPublication";
    }

    @PostMapping("/savepublication")
    public String savepub(Publication publication, BindingResult result, Model model ){

        if (result.hasErrors()) {
            return "addPublication";
        }
        publicationRepository.save(publication);
        model.addAttribute("publication", publicationRepository.findAll());
        return "publicationList";
    }

    @GetMapping("/getPublication")
    public String findAll(Model model, String titre, String categorie, String discipline) {

        // l'ajout de la mothode findByTitre definie sur la classe PublicationService
        if(titre!=null){
            model.addAttribute("publication", publicationService.findByTitre(titre));
            return "publicationList";
        }
        else
        {
            model.addAttribute("publication", publicationRepository.findAll());}

        if(categorie!=null){
            model.addAttribute("publication", publicationService.findByCategorie(categorie));
            return "publicationList";
        }
        else
        {
            model.addAttribute("publication", publicationRepository.findAll());}

        if(discipline!=null){
            model.addAttribute("publication", publicationService.findByDiscipline(discipline));
            return "publicationList";
        }
        else
        {
            model.addAttribute("publication", publicationRepository.findAll());}

        return "publicationList";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        Publication publication = publicationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        publicationRepository.delete(publication);
        model.addAttribute("publication", publicationRepository.findAll());
        return "index";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Publication publication, BindingResult result, Model model ){
        if (result.hasErrors()) {
            publication.setId(id);
            return "publication modifee";
        }
        publicationRepository.save(publication);
        model.addAttribute("users", publicationRepository.findAll());
        return "index";
    }
}
