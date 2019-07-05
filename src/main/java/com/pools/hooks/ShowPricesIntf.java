package com.pools.hooks;

public interface ShowPricesIntf {
    int defaultPrice(String saying);

    int hightPrice(int hight);

    int lowPrice(int low);

    int reasonablePrice(String saying, String... friends);

    String giveUpDeal();

    String satisfactoryResult();
}
