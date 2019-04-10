package pl.pawsaj.home.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.pawsaj.home.bll.services.ViewerService;

/**
 * Created by Paweł Sajnóg on 10 mar 2019.
 */
@RestController
//@Scope("prototype")
public class ViewerController {
    private ViewerService viewerService;

    @Autowired
    public ViewerController(ViewerService viewerService) {
        this.viewerService = viewerService;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    @ResponseBody
    public String view() {
        return viewerService.view();
    }
}
