package pl.pawsaj.home.bll.dto;

import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Paweł Sajnóg on 10 mar 2019.
 */
public class ViewData {
    private final ConcurrentHashMap<String, BigInteger> viewersMap;

    public ViewData() {
        viewersMap = new ConcurrentHashMap<>();
    }

    public void addView(String viewerId) {
        viewersMap.merge(viewerId, BigInteger.ONE, BigInteger::add);
    }

    public BigInteger getViewerViews(String viewerId) {
        return viewersMap.get(viewerId);
    }

    public BigInteger getAllViews() {
        return viewersMap.values()
                .stream()
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}
