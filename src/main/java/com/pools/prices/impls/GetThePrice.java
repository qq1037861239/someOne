package com.pools.prices.impls;

import com.pools.prices.GetDefaultPrice;

public class GetThePrice extends GetDefaultPrice {

    @Override
    public int defaultPrice(String saying) {
        return 0;
    }

    public boolean howIsThePrice(GetDefaultPrice deftPric, String saying, int wall) {
        return !(deftPric.defaultPrice(saying) > wall);
    }
}
