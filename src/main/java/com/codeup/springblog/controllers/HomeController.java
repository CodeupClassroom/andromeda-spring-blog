package com.codeup.springblog.controllers;

import com.codeup.springblog.repos.PostRepository;
import com.codeup.springblog.services.EmailService;
import com.codeup.springblog.services.SillySvc;
import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private PostRepository postDao;
    private SillySvc ssvc;
    private EmailService emailSvc;

    public HomeController(PostRepository postDao, SillySvc ssvc, EmailService emailSvc) {
        this.postDao = postDao;
        this.ssvc = ssvc;
        this.emailSvc = emailSvc;
    }

    @GetMapping("/")
    public String returnHomePage(Model model) {
        model.addAttribute("total", ssvc.getTotalLengthOfPostTitlesAndUsernames());
        return "home";
    }

    @GetMapping("/email-test")
    @ResponseBody
    public String emailTest() {
        emailSvc.prepareAndSend(postDao.findOne(3L), "New Post!", "You are winner!");
        return "testing email...";
    }
}
