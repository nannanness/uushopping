package org.uushopping.pojo;

import java.util.Objects;

/**
 * 购物车商品表
 */
public class ShopCarCommodity {
    //购物车编号
    private  int shopUnm;
    // 购物车id
    private int shopCarId;
    // 商品id
    private int commodityId;
    // 店铺id
    private int storeId;
    // 商品数量
    private int commodityCount;
    // 金额合计
    private int amountPrice;

    public ShopCarCommodity() {
    }

    public ShopCarCommodity(int shopCarId, int commodityId, int storeId, int commodityCount, int amountPrice) {
        this.shopCarId = shopCarId;
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityCount = commodityCount;
        this.amountPrice = amountPrice;
    }

    public ShopCarCommodity(int shopUnm, int shopCarId, int commodityId, int storeId, int commodityCount, int amountPrice) {
        this.shopUnm = shopUnm;
        this.shopCarId = shopCarId;
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityCount = commodityCount;
        this.amountPrice = amountPrice;
    }

    public int getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(int shopCarId) {
        this.shopCarId = shopCarId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(int commodityCount) {
        this.commodityCount = commodityCount;
    }

    public int getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(int amountPrice) {
        this.amountPrice = amountPrice;
    }

    public int getShopUnm() {
        return shopUnm;
    }

    public void setShopUnm(int shopUnm) {
        this.shopUnm = shopUnm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopCarCommodity that = (ShopCarCommodity) o;
        return shopUnm == that.shopUnm &&
                shopCarId == that.shopCarId &&
                commodityId == that.commodityId &&
                storeId == that.storeId &&
                commodityCount == that.commodityCount &&
                amountPrice == that.amountPrice;
    }

    @Override
    public int hashCode() {

        return Objects.hash(shopUnm, shopCarId, commodityId, storeId, commodityCount, amountPrice);
    }

    @Override
    public String toString() {
        return "ShopCarCommodity{" +
                "shopUnm=" + shopUnm +
                ", shopCarId=" + shopCarId +
                ", commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityCount=" + commodityCount +
                ", amountPrice=" + amountPrice +
                '}';
    }
}
