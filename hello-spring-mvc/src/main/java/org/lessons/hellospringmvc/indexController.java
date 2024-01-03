package org.lessons.hellospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/")
public class indexController {
    @GetMapping
    public String home (Model model) {
        Random random = new Random();
        int randomDiceNumber = random.nextInt(1,6);
        model.addAttribute("randomDiceNumber", randomDiceNumber);
        return "home";
    }

}
