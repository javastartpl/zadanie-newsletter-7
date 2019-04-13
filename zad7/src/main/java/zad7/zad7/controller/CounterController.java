package zad7.zad7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class CounterController {
    private int globalCounter;
    private HashMap<String, Integer> sessions = new HashMap<>();

    @RequestMapping("/")
    public String home(HttpSession httpSession, Model model) {

        //increases global counter
        globalCounter++;
        model.addAttribute("globalCounter", globalCounter);
        //
        String currentSession = httpSession.getId();
        if (!sessions.containsKey(currentSession)) {
            sessions.put(currentSession, 1);
        } else {
            int count = sessions.get(currentSession);
            sessions.replace(currentSession, count + 1);
        }
        int sessionCounter = sessions.get(currentSession);
        model.addAttribute("sessionCounter", sessionCounter);
        return "index";
    }
}
