package site.controllers;

import site.components.GlobalCounter;
import site.components.SessionCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

    @Autowired
    private GlobalCounter globalCounter;

    @Autowired
    private SessionCounter sessionCounter;

    @RequestMapping("/")
    public String getMainSite(Model model) {
        model.addAttribute("globalcounter", globalCounter);
        model.addAttribute("sessioncounter", sessionCounter);
        return "site";
    }
}
