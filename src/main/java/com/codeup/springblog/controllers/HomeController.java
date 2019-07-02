package com.codeup.springblog.controllers;

import com.codeup.springblog.services.SillySvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private SillySvc ssvc;

    public HomeController(SillySvc ssvc) {
        this.ssvc = ssvc;
    }

    @GetMapping("/")
    public String returnHomePage(Model model) {
        model.addAttribute("total", ssvc.getTotalLengthOfPostTitlesAndUsernames());
        return "home";
    }
}
