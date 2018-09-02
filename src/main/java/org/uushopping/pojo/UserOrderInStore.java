package org.uushopping.pojo;

import java.util.Objects;

public class UserOrderInStore {
    // 客户昵称
    private String username;
    // 客户电话
    private String userPhone;
    // 客户地址
    private String userAddress;
    // 店铺名称
    private String storeName;
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
    // 商品名称
    private String commodityName;
    // 商品详细信息（商品介绍）
    private String commodityDetails;
    // 商品单价
    private double commodityPrice;
    // 商品尺寸
    private String commoditySize;
    // 商品版本
    private String commodityVersion;
    // 商品库存
    private String commodityStock;
    // 图片地址
    private String imageAddress;

    public UserOrderInStore() {
    }

    public UserOrderInStore(String username, String userPhone, String userAddress, String storeName, int orderCommodityId, int commodityId, int storeId, int commodityCount, int amountPrice, String orderId, int userId, String orderDate, String paymentDate, String deliveryDate, String orderStatus, int orderAmount, int harvestAddressId, String ordersExpressDelivery, int payId, String commodityName, String commodityDetails, double commodityPrice, String commoditySize, String commodityVersion, String commodityStock, String imageAddress) {
        this.username = username;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.storeName = storeName;
        this.orderCommodityId = orderCommodityId;
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityCount = commodityCount;
        this.amountPrice = amountPrice;
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
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityStock = commodityStock;
        this.imageAddress = imageAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityDetails() {
        return commodityDetails;
    }

    public void setCommodityDetails(String commodityDetails) {
        this.commodityDetails = commodityDetails;
    }

    public double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommoditySize() {
        return commoditySize;
    }

    public void setCommoditySize(String commoditySize) {
        this.commoditySize = commoditySize;
    }

    public String getCommodityVersion() {
        return commodityVersion;
    }

    public void setCommodityVersion(String commodityVersion) {
        this.commodityVersion = commodityVersion;
    }

    public String getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(String commodityStock) {
        this.commodityStock = commodityStock;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOrderInStore that = (UserOrderInStore) o;
        return orderCommodityId == that.orderCommodityId &&
                commodityId == that.commodityId &&
                storeId == that.storeId &&
                commodityCount == that.commodityCount &&
                amountPrice == that.amountPrice &&
                userId == that.userId &&
                orderAmount == that.orderAmount &&
                harvestAddressId == that.harvestAddressId &&
                payId == that.payId &&
                Double.compare(that.commodityPrice, commodityPrice) == 0 &&
                Objects.equals(username, that.username) &&
                Objects.equals(userPhone, that.userPhone) &&
                Objects.equals(userAddress, that.userAddress) &&
                Objects.equals(storeName, that.storeName) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(paymentDate, that.paymentDate) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(ordersExpressDelivery, that.ordersExpressDelivery) &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(commodityDetails, that.commodityDetails) &&
                Objects.equals(commoditySize, that.commoditySize) &&
                Objects.equals(commodityVersion, that.commodityVersion) &&
                Objects.equals(commodityStock, that.commodityStock) &&
                Objects.equals(imageAddress, that.imageAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, userPhone, userAddress, storeName, orderCommodityId, commodityId, storeId, commodityCount, amountPrice, orderId, userId, orderDate, paymentDate, deliveryDate, orderStatus, orderAmount, harvestAddressId, ordersExpressDelivery, payId, commodityName, commodityDetails, commodityPrice, commoditySize, commodityVersion, commodityStock, imageAddress);
    }

    @Override
    public String toString() {
        return "UserOrderInStore{" +
                "username='" + username + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", storeName='" + storeName + '\'' +
                ", orderCommodityId=" + orderCommodityId +
                ", commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityCount=" + commodityCount +
                ", amountPrice=" + amountPrice +
                ", orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", orderDate='" + orderDate + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderAmount=" + orderAmount +
                ", harvestAddressId=" + harvestAddressId +
                ", ordersExpressDelivery='" + ordersExpressDelivery + '\'' +
                ", payId=" + payId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityDetails='" + commodityDetails + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commoditySize='" + commoditySize + '\'' +
                ", commodityVersion='" + commodityVersion + '\'' +
                ", commodityStock='" + commodityStock + '\'' +
                ", imageAddress='" + imageAddress + '\'' +
                '}';
    }
}
