package gp_mango.gp.Controller;

import gp_mango.gp.Repository.AuteurRepository;
import gp_mango.gp.Repository.AuteurService;
import gp_mango.gp.Repository.PublicationRepository;
import gp_mango.gp.Repository.PublicationService;
import gp_mango.gp.entity.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuteurController {
    @Autowired
    private PublicationService publicationService;

    @Autowired
    private PublicationRepository publicationRepository;
    @Autowired
    private AuteurService auteurService;
    @Autowired
    private AuteurRepository auteurRepository;


    @GetMapping("/addAuteur")
    public String showAddUserForm(Auteur auteur) {
        return "addAuteur";
    }

    @PostMapping("/auteurs")
    public String addAuteur(Auteur auteur, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addAuteur";
        }
        auteurRepository.save(auteur);
        model.addAttribute("auteurs", auteurRepository.findAll());
        return "auteurs";
    }

    @GetMapping("/getAuteur")
    public String findAll(Model model, String name) {

        if (name != null) {
            model.addAttribute("auteurs", auteurService.findByName(name));
            return "auteurs";
        } else {
            model.addAttribute("auteurs", auteurRepository.findAll());
        }
        return "auteurs";
    }

    @GetMapping("/getPub")
    public String findPub(Model model, String titre) {
        if(titre!=null){
            model.addAttribute("publication", publicationService.findByTitre(titre));
            return "publicationList";
        }
        else
        {
            model.addAttribute("auteurs", auteurRepository.findAll());

        }
        return "auteurs";
    }

  /*  @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, Auteur auteur, BindingResult result, Model model) {
        if (result.hasErrors()) {
            auteur.setId(id);
            return "update-auteur";
        }

        auteurRepository.save(auteur);
        model.addAttribute("auteurs", auteurRepository.findAll());
        return "index";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
       Auteur auteur = auteurRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        auteurRepository.delete(auteur);
        model.addAttribute("auteurs", auteurRepository.findAll());
        return "index";
    }*/
}



