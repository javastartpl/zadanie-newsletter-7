package site.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionCounter {
    private int sessionVisitCounter = 0;

    public int getSessionVisitCounter() {
        return ++sessionVisitCounter;
    }
}
