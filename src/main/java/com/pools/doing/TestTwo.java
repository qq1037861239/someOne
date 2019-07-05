package com.pools.doing;

import com.pools.hooks.GetDefaultPrice;
import com.pools.hooks.ShowPricesIntf;
import com.pools.hooks.impls.GetLowPrice;
import com.pools.hooks.impls.GetThePrice;

public class TestTwo {

    public static void main(String[] args) {
        GetThePrice gtp = new GetThePrice();
        boolean hm = gtp.howIsThePrice(new GetDefaultPrice() {
            @Override
            public int defaultPrice(String saying) {
                return 0;
            }
        }, "How match", 500);
        System.out.println(hm);

        GetLowPrice glp = new GetLowPrice();
        String res = glp.buyOrNotWithLowPrice(pric -> pric > 600 ? 600 : pric - 150, 800);
        System.out.println(res);
    }
}
