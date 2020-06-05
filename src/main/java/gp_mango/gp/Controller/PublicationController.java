package gp_mango.gp.Controller;

import gp_mango.gp.Repository.PublicationRepository;
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

    @GetMapping("/addPublication")
    public String addPub(Publication publication)
    {return "addPublication";}

    @PostMapping("/savePublication")
    public String save(Publication publication, BindingResult result, Model model ){
        if (result.hasErrors()) {
            return "addPublication";
        }
        publicationRepository.save(publication);
        model.addAttribute("publication", publicationRepository.findAll());
        return "publicationList";
    }

    @GetMapping("/getPublication")
    public String findAll(Model model) {
        model.addAttribute("publication", publicationRepository.findAll());
        return "publicationList";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        Publication publication = publicationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        publicationRepository.delete(publication);
        model.addAttribute("publication", publicationRepository.findAll());
        return "publicationList";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Publication publication, BindingResult result, Model model ){
        if (result.hasErrors()) {
            publication.setId(id);
            return "publication modifee";
        }
        publicationRepository.save(publication);
        model.addAttribute("users", publicationRepository.findAll());
        return "publicationList";
    }
}
