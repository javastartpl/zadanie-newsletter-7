package com.example.pageviewer.controller;

import com.example.pageviewer.components.AppComponent;
import com.example.pageviewer.components.SessionComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private SessionComponent sessionComponent;
    private AppComponent appComponent;

    @Autowired
    public HomeController(SessionComponent sessionComponent, AppComponent appComponent) {
        this.sessionComponent = sessionComponent;
        this.appComponent = appComponent;
    }

    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        model.addAttribute("sessionViews", sessionComponent.getSessionViews());
        model.addAttribute("appViews", appComponent.getAppViews());
        return "index";
    }

}
