package site.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GlobalCounter {
    private static int globalVisitCounter = 0;

    public static int getGlobalVisitCounter() {
        return ++globalVisitCounter;
    }
}
