package com.pools.prices;

@FunctionalInterface
public interface ShowUTheLowIntf/* extends ShowPricesIntf*/ {

    int pricForLM = 300;

    int pricForOtherOthers = 600;

    default String saying(String words) {
        return "I will say: " + words;
    }

    static int getOthers(String man) {
        return "LiMing".equals(man) ? pricForLM : pricForOtherOthers;
    }

    int lowPrice(int low);

}
