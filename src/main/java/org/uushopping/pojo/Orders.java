package org.uushopping.pojo;

import java.util.Objects;

/**
 * 订单记录表
 */
public class Orders {
    // 订单号
    private String orderId;
    // 客户id
    private int userId;
    // 下单时间
    private String orderDate;
    // 付款时间
    private String paymentDate;
    // 发货时间
    private String deliveryDate;
    // 订单状态
    private String orderStatus;
    // 订单总金额
    private int orderAmount;
    // 收货地址编号
    private int harvestAddressId;
    // 订单快递名称
    private String ordersExpressDelivery;
    // 支付方式
    private int payId;
    // 订单商品列表id
    private int orderCommodityId;

    public Orders() {
    }

    public Orders(int userId, String orderDate, String paymentDate, String deliveryDate, String orderStatus, int orderAmount, int harvestAddressId, String ordersExpressDelivery, int payId, int orderCommodityId) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.paymentDate = paymentDate;
        this.deliveryDate = deliveryDate;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.harvestAddressId = harvestAddressId;
        this.ordersExpressDelivery = ordersExpressDelivery;
        this.payId = payId;
        this.orderCommodityId = orderCommodityId;
    }

    public Orders(String orderId, int userId, String orderDate, String paymentDate, String deliveryDate, String orderStatus, int orderAmount, int harvestAddressId, String ordersExpressDelivery, int payId, int orderCommodityId) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.paymentDate = paymentDate;
        this.deliveryDate = deliveryDate;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.harvestAddressId = harvestAddressId;
        this.ordersExpressDelivery = ordersExpressDelivery;
        this.payId = payId;
        this.orderCommodityId = orderCommodityId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getHarvestAddressId() {
        return harvestAddressId;
    }

    public void setHarvestAddressId(int harvestAddressId) {
        this.harvestAddressId = harvestAddressId;
    }

    public String getOrdersExpressDelivery() {
        return ordersExpressDelivery;
    }

    public void setOrdersExpressDelivery(String ordersExpressDelivery) {
        this.ordersExpressDelivery = ordersExpressDelivery;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public int getOrderCommodityId() {
        return orderCommodityId;
    }

    public void setOrderCommodityId(int orderCommodityId) {
        this.orderCommodityId = orderCommodityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders order = (Orders) o;
        return orderId == order.orderId &&
                userId == order.userId &&
                orderAmount == order.orderAmount &&
                harvestAddressId == order.harvestAddressId &&
                payId == order.payId &&
                orderCommodityId == order.orderCommodityId &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(paymentDate, order.paymentDate) &&
                Objects.equals(deliveryDate, order.deliveryDate) &&
                Objects.equals(orderStatus, order.orderStatus) &&
                Objects.equals(ordersExpressDelivery, order.ordersExpressDelivery);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderId, userId, orderDate, paymentDate, deliveryDate, orderStatus, orderAmount, harvestAddressId, ordersExpressDelivery, payId, orderCommodityId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderDate='" + orderDate + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderAmount=" + orderAmount +
                ", harvestAddressId=" + harvestAddressId +
                ", ordersExpressDelivery='" + ordersExpressDelivery + '\'' +
                ", payId=" + payId +
                ", orderCommodityId=" + orderCommodityId +
                '}';
    }
}
