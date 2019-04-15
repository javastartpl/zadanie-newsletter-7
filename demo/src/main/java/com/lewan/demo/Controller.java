package com.lewan.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;


@RestController
public class Controller {

    private HashMap<String, ViewerInfo> requestsMap = new HashMap<>();

    @RequestMapping()
    public String sessionRequestsCounter(HttpSession session) {

        String currentSessionId = session.getId();

        if (!requestsMap.containsKey(currentSessionId)) {
            requestsMap.put(currentSessionId, new ViewerInfo());
        }
        else {
            requestsMap.get(currentSessionId).incrementNumberOfVisits();
            ViewerInfo.incrementTotalViews();
        }

        return requestsMap.get(currentSessionId).toString();
    }


}
