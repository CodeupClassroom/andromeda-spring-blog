package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;

@Controller
public class PageController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }



    @GetMapping("/t")
    public String thyme(Model model) {

        model.addAttribute("username", "Overlord");
        model.addAttribute("person", new Person("Justin", 23));
        model.addAttribute("numbers", Arrays.asList(1, 2, 3));
//        model.addAttribute("name", name);
        return "thyme";
    }



    @GetMapping("/t/{blah}")
    public String thyme(@PathVariable String blah, Model model) {

        model.addAttribute("username", "Overlord");
        model.addAttribute("person", new Person("Justin", 23));
        model.addAttribute("numbers", Arrays.asList(1, 2, 3));
        model.addAttribute("name", null);
        return "thyme";
    }




}
