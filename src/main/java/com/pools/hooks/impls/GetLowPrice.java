package com.pools.hooks.impls;

import com.pools.hooks.ShowUTheLowIntf;

public class GetLowPrice {

    public String buyOrNotWithLowPrice(ShowUTheLowIntf sutl, int low) {
        return sutl.lowPrice(low) > 500 ? "No! I won't buy it." : "Yes! I love it";
    }
}
