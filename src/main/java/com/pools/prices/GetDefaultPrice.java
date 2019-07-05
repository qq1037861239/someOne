package com.pools.prices;

public abstract class GetDefaultPrice implements ShowPricesIntf {

    public abstract int defaultPrice(String saying);

    @Override
    public int hightPrice(int hight) {
        return 0;
    }

    @Override
    public int lowPrice(int low) {
        return 0;
    }

    @Override
    public int reasonablePrice(String saying, String... friends) {
        return 0;
    }

    @Override
    public String giveUpDeal() {
        return null;
    }

    @Override
    public String satisfactoryResult() {
        return null;
    }

}
