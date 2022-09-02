package com.example.resume.web;

import com.example.resume.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final InfoService infoService;

    public HomeController(InfoService infoService) {
        this.infoService = infoService;
    }

//    @ModelAttribute
//    public InfoDto infoDto(){
//        return new InfoDto();
//    }

    @GetMapping("/")
    public String homePage(Model model){

        model.addAttribute("info",infoService.infoByName("Iliyan Stavrev"));

        return "index";
    }
}
