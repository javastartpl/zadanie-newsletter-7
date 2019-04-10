package pl.pawsaj.home.bll.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.pawsaj.home.bll.dto.ViewData;

/**
 * Created by Paweł Sajnóg on 18 mar 2019.
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ViewerService {
    private ViewData viewData;

    public ViewerService() {
        viewData = new ViewData();
    }

    public String view(String viewerId) {
        viewData.addView(viewerId);

        return String.format("Your views='%s\' and total views='%s'",
                viewData.getViewerViews(viewerId), viewData.getAllViews());
    }
}
