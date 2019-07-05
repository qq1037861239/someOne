package com.pools.hooks.impls;

import com.pools.hooks.GetDefaultPrice;

public class GetThePrice extends GetDefaultPrice {

    @Override
    public int defaultPrice(String saying) {
        return 0;
    }

    public boolean howIsThePrice(GetDefaultPrice deftPric, String saying, int wall) {
        return !(deftPric.defaultPrice(saying) > wall);
    }
}
