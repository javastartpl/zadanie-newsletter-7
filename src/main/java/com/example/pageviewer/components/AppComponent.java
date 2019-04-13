package com.example.pageviewer.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class AppComponent {

    private int appViews;

    public int getAppViews() {
        appViews++;
        return appViews;
    }

}
