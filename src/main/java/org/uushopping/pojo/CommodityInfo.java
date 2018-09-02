package org.uushopping.pojo;

import java.util.Objects;

public class CommodityInfo {
    // 商品id
    private int commodityId;
    // 商品名称
    private String commodityName;
    // 商品详细信息（商品介绍）
    private String commodityDetails;
    // 商品单价
    private double commodityPrice;
    // 商品分类
    private String commodityType;
    // 商品尺寸
    private String commoditySize;
    // 商品版本
    private String commodityVersion;
    // 商品图片
    private int commodityImageId;
    // 商品款式
    private String commodityStyle;
    // 累计销量
    private String salesVolume;
    // 累计评论
    private String cumulativeComment;
    // 商品库存
    private String commodityStock;
    // 商品品牌
    private String commodityBrand;
    // 产地
    private String commondityFrom;
    //产品图片
    private String imageAddress;

    public CommodityInfo() {
    }

    public CommodityInfo(int commodityId, String commodityName, String commodityDetails, double commodityPrice, String commodityType, String commoditySize, String commodityVersion, int commodityImageId, String commodityStyle, String salesVolume, String cumulativeComment, String commodityStock, String commodityBrand, String commondityFrom, String imageAddress) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commodityType = commodityType;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityImageId = commodityImageId;
        this.commodityStyle = commodityStyle;
        this.salesVolume = salesVolume;
        this.cumulativeComment = cumulativeComment;
        this.commodityStock = commodityStock;
        this.commodityBrand = commodityBrand;
        this.commondityFrom = commondityFrom;
        this.imageAddress = imageAddress;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
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

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
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

    public int getCommodityImageId() {
        return commodityImageId;
    }

    public void setCommodityImageId(int commodityImageId) {
        this.commodityImageId = commodityImageId;
    }

    public String getCommodityStyle() {
        return commodityStyle;
    }

    public void setCommodityStyle(String commodityStyle) {
        this.commodityStyle = commodityStyle;
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getCumulativeComment() {
        return cumulativeComment;
    }

    public void setCumulativeComment(String cumulativeComment) {
        this.cumulativeComment = cumulativeComment;
    }

    public String getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(String commodityStock) {
        this.commodityStock = commodityStock;
    }

    public String getCommodityBrand() {
        return commodityBrand;
    }

    public void setCommodityBrand(String commodityBrand) {
        this.commodityBrand = commodityBrand;
    }

    public String getCommondityFrom() {
        return commondityFrom;
    }

    public void setCommondityFrom(String commondityFrom) {
        this.commondityFrom = commondityFrom;
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
        CommodityInfo that = (CommodityInfo) o;
        return commodityId == that.commodityId &&
                Double.compare(that.commodityPrice, commodityPrice) == 0 &&
                commodityImageId == that.commodityImageId &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(commodityDetails, that.commodityDetails) &&
                Objects.equals(commodityType, that.commodityType) &&
                Objects.equals(commoditySize, that.commoditySize) &&
                Objects.equals(commodityVersion, that.commodityVersion) &&
                Objects.equals(commodityStyle, that.commodityStyle) &&
                Objects.equals(salesVolume, that.salesVolume) &&
                Objects.equals(cumulativeComment, that.cumulativeComment) &&
                Objects.equals(commodityStock, that.commodityStock) &&
                Objects.equals(commodityBrand, that.commodityBrand) &&
                Objects.equals(commondityFrom, that.commondityFrom) &&
                Objects.equals(imageAddress, that.imageAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityId, commodityName, commodityDetails, commodityPrice, commodityType, commoditySize, commodityVersion, commodityImageId, commodityStyle, salesVolume, cumulativeComment, commodityStock, commodityBrand, commondityFrom, imageAddress);
    }

    @Override
    public String toString() {
        return "CommodityInfo{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityDetails='" + commodityDetails + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityType='" + commodityType + '\'' +
                ", commoditySize='" + commoditySize + '\'' +
                ", commodityVersion='" + commodityVersion + '\'' +
                ", commodityImageId=" + commodityImageId +
                ", commodityStyle='" + commodityStyle + '\'' +
                ", salesVolume='" + salesVolume + '\'' +
                ", cumulativeComment='" + cumulativeComment + '\'' +
                ", commodityStock='" + commodityStock + '\'' +
                ", commodityBrand='" + commodityBrand + '\'' +
                ", commondityFrom='" + commondityFrom + '\'' +
                ", imageAddress='" + imageAddress + '\'' +
                '}';
    }
}
