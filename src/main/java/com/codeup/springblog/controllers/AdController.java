package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad;
import com.codeup.springblog.repos.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdController {

    private AdRepository adsDao;

    public AdController(AdRepository adsDao) {
        this.adsDao = adsDao;
    }


    @GetMapping("/ads")
    private String index(Model model) {
        model.addAttribute("ads", adsDao.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/create")
    private String create(Model model) {
        model.addAttribute("ad", new Ad());
        return "ads/create";
    }

    @PostMapping("/ads/create")
    private String insert(@ModelAttribute Ad ad, @RequestParam String extra) {
        System.out.println(extra);
        adsDao.save(ad);
        return "redirect:/ads";
    }


}
