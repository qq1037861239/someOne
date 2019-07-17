package com.pools.doing;

import com.pools.prices.GetDefaultPrice;
import com.pools.prices.impls.GetLowPrice;
import com.pools.prices.impls.GetThePrice;

import java.util.Scanner;

public class TestTwo {

    public static int flag = 1;

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
