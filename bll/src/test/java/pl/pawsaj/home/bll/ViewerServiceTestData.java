package pl.pawsaj.home.bll;

/**
 * Created by Paweł Sajnóg on 10 mar 2019.
 */
public enum ViewerServiceTestData {
    USER_1("user1", 4),
    USER_2("user2", 7),
    USER_3("user3", 1);

    private String sessionId;
    private int views;

    ViewerServiceTestData(String sessionId, int views) {
        this.sessionId = sessionId;
        this.views = views;
    }

    public String getSessionId() {
        return sessionId;
    }

    public int getViews() {
        return views;
    }
}