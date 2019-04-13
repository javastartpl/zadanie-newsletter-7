package com.example.pageviewer.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionComponent {

    private int sessionViews;

    public int getSessionViews() {
        sessionViews++;
        return sessionViews;
    }

}
