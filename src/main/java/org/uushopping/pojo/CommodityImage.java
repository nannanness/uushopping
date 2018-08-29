package org.uushopping.pojo;

import java.util.Objects;

/**
 * 商品图片表
 */
public class CommodityImage {
    // 商品图片
    private int commodityImageId;
    // 图片地址
    private String imageAddress;

    public CommodityImage(int commodityImageId, String imageAddress) {
        this.commodityImageId = commodityImageId;
        this.imageAddress = imageAddress;
    }

    public CommodityImage(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public CommodityImage() {
    }

    public int getCommodityImageId() {
        return commodityImageId;
    }

    public void setCommodityImageId(int commodityImageId) {
        this.commodityImageId = commodityImageId;
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
        CommodityImage that = (CommodityImage) o;
        return commodityImageId == that.commodityImageId &&
                Objects.equals(imageAddress, that.imageAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityImageId, imageAddress);
    }

    @Override
    public String toString() {
        return "CommodityImage{" +
                "commodityImageId=" + commodityImageId +
                ", imageAddress='" + imageAddress + '\'' +
                '}';
    }
}
