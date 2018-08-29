package org.uushopping.pojo;

import java.util.Objects;

/**
 * 退货表
 */
public class ReturnCommodity {
    // 退货id
    private int returnId;
    // 商品id
    private int commodityId;
    // 退货时间
    private String returnDate;
    // 订单号
    private int orderId;
    // 客户id
    private int userId;
    // 退货数量
    private int returnCount;

    public ReturnCommodity() {
    }

    public ReturnCommodity(int commodityId, String returnDate, int orderId, int userId, int returnCount) {
        this.commodityId = commodityId;
        this.returnDate = returnDate;
        this.orderId = orderId;
        this.userId = userId;
        this.returnCount = returnCount;
    }

    public ReturnCommodity(int returnId, int commodityId, String returnDate, int orderId, int userId, int returnCount) {
        this.returnId = returnId;
        this.commodityId = commodityId;
        this.returnDate = returnDate;
        this.orderId = orderId;
        this.userId = userId;
        this.returnCount = returnCount;
    }

    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(int returnCount) {
        this.returnCount = returnCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnCommodity that = (ReturnCommodity) o;
        return returnId == that.returnId &&
                commodityId == that.commodityId &&
                orderId == that.orderId &&
                userId == that.userId &&
                returnCount == that.returnCount &&
                Objects.equals(returnDate, that.returnDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(returnId, commodityId, returnDate, orderId, userId, returnCount);
    }

    @Override
    public String toString() {
        return "ReturnCommodity{" +
                "returnId=" + returnId +
                ", commodityId=" + commodityId +
                ", returnDate='" + returnDate + '\'' +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", returnCount=" + returnCount +
                '}';
    }
}
