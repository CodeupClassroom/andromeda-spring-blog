package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdController {

    private AdRepository adsDao;

    public AdController(AdRepository adsDao) {
        this.adsDao = adsDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    private Iterable<String> index() {
        return adsDao.getTitleWithGreatLengthNative();
    }


    @GetMapping("/ads-view")
    private String indexView(Model model) {
        model.addAttribute("ads", adsDao.findAll());
        return "ads/index";
    }


}
