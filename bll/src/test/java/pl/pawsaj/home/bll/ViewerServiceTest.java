package pl.pawsaj.home.bll;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.pawsaj.home.bll.services.ViewerService;

/**
 * Created by Paweł Sajnóg on 10 mar 2019.
 */
public class ViewerServiceTest {
    private ViewerService viewerService = new ViewerService();

    @Before
    public void makeUserViews() {
        makeUserViews(
                ViewerServiceTestData.USER_1.getSessionId(),
                ViewerServiceTestData.USER_2.getSessionId(),
                ViewerServiceTestData.USER_3.getSessionId()
        );
    }

    @Test
    public void viewersTest() {

        int sumOfViews = ViewerServiceTestData.USER_1.getViews()
                + ViewerServiceTestData.USER_2.getViews()
                + ViewerServiceTestData.USER_3.getViews();

        sumOfViews = assertUserViews(sumOfViews, ViewerServiceTestData.USER_1);
        sumOfViews = assertUserViews(sumOfViews, ViewerServiceTestData.USER_2);
        assertUserViews(sumOfViews, ViewerServiceTestData.USER_3);


    }

    private int assertUserViews(int sumOfViews, ViewerServiceTestData user1) {
        Assert.assertEquals(
                String.format("Your views=\'%s\' and total views=\'%s\'", user1.getViews() + 1, ++sumOfViews),
                viewerService.view(user1.getSessionId())
        );
        return sumOfViews;
    }

    private void makeUserViews(String user1, String user2, String user3) {
        for (int i = 0; i < ViewerServiceTestData.USER_1.getViews(); i++) {
            viewerService.view(user1);
        }
        for (int i = 0; i < ViewerServiceTestData.USER_2.getViews(); i++) {
            viewerService.view(user2);
        }
        for (int i = 0; i < ViewerServiceTestData.USER_3.getViews(); i++) {
            viewerService.view(user3);
        }
    }
}
