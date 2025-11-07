package com.example.demo.Controller;

import com.example.demo.Model.Personal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalController {
    @GetMapping("/info")
    public String showPersonalInfo(Model model){
        Personal personal = new Personal(
                "Toan",
                "Nguyen",
                "Nghe An",
                "27/10/2005",
                "nguyentrongtoana1byt@gmail.com"
        );
        model.addAttribute("person",personal);
        return "index";
    }
}
