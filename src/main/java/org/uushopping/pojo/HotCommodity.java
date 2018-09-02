package org.uushopping.pojo;

import java.util.Objects;

public class HotCommodity {
    //图片的地址
    private String imageAddress;
    //图片名称
    private String commodityName;
    //商品所属id
    private int commodityId;
    //商品所属商店的id
    private int storeId;
    //商品的价格
    private double commodityPrice;

    public HotCommodity() {

    }

    public HotCommodity(String imageAddress, String commodityName, int commodityId, int storeId, double commodityPrice) {
        this.imageAddress = imageAddress;
        this.commodityName = commodityName;
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityPrice = commodityPrice;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
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

    public double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotCommodity that = (HotCommodity) o;
        return commodityId == that.commodityId &&
                storeId == that.storeId &&
                Double.compare(that.commodityPrice, commodityPrice) == 0 &&
                Objects.equals(imageAddress, that.imageAddress) &&
                Objects.equals(commodityName, that.commodityName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imageAddress, commodityName, commodityId, storeId, commodityPrice);
    }

    @Override
    public String toString() {
        return "HotCommodity{" +
                "imageAddress='" + imageAddress + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityPrice=" + commodityPrice +
                '}';
    }
}
