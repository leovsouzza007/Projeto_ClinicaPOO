package controller;

import model.EquipeMedica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipeController {

    @GetMapping("/")
    public String index(Model model) {

        EquipeMedica equipe = new EquipeMedica(
                "Clínica Médica",
                true
        );

        model.addAttribute("equipe", equipe);

        return "index";
    }
}