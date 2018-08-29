package org.uushopping.pojo;

import java.util.Objects;

/**
 * 订单商品表
 */
public class OrderCommodity {
    // 订单商品列表id
    private int orderCommodityId;
    // 商品id
    private int commodityId;
    // 店铺id
    private int storeId;
    // 商品数量
    private int commodityCount;
    // 商品总价
    private int amountPrice;

    public OrderCommodity() {
    }

    public OrderCommodity(int commodityId, int storeId, int commodityCount, int amountPrice) {
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityCount = commodityCount;
        this.amountPrice = amountPrice;
    }

    public OrderCommodity(int orderCommodityId, int commodityId, int storeId, int commodityCount, int amountPrice) {
        this.orderCommodityId = orderCommodityId;
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityCount = commodityCount;
        this.amountPrice = amountPrice;
    }

    public int getOrderCommodityId() {
        return orderCommodityId;
    }

    public void setOrderCommodityId(int orderCommodityId) {
        this.orderCommodityId = orderCommodityId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCommodity that = (OrderCommodity) o;
        return orderCommodityId == that.orderCommodityId &&
                commodityId == that.commodityId &&
                storeId == that.storeId &&
                commodityCount == that.commodityCount &&
                amountPrice == that.amountPrice;
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderCommodityId, commodityId, storeId, commodityCount, amountPrice);
    }

    @Override
    public String toString() {
        return "OrderCommodity{" +
                "orderCommodityId=" + orderCommodityId +
                ", commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityCount=" + commodityCount +
                ", amountPrice=" + amountPrice +
                '}';
    }
}
