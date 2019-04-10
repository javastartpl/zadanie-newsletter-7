package pl.pawsaj.home.bll.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Paweł Sajnóg on 18 mar 2019.
 */
@Service
@Scope("prototype")
public class ViewerService {
    private static int views;

    public String view() {
        int totalViews = 0;
        views++;

        return String.format("Your views='%s\' and total views='%s'",
                views, totalViews);
    }
}
