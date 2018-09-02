package org.uushopping.pojo;

import java.util.Objects;

public class Commodity_Image {
    // 商品id
    private int commodityId;
    // 商品店铺
    private int storeId;
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
    // 商品图片
    private String imageAddress;
    // 上架时间
    private String addedTime;
    // 商品款式
    private String commodityStyle;
    // 累计销量
    private String salesVolume;
    // 累计评论
    private String cumulativeComment;
    // 商品库存
    private String commodityStock;
    // 商品状态
    private String commodityFlag;
    // 商品品牌
    private String commodityBrand;
    // 产地
    private String commodityFrom;
    // 材质
    private String commodityMaterial;

    public Commodity_Image() {
    }

    public Commodity_Image(int storeId, String commodityName, String commodityDetails, double commodityPrice, String commodityType, String commoditySize, String commodityVersion, int commodityImageId, String imageAddress, String addedTime, String commodityStyle, String salesVolume, String cumulativeComment, String commodityStock, String commodityFlag, String commodityBrand, String commodityFrom, String commodityMaterial) {
        this.storeId = storeId;
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commodityType = commodityType;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityImageId = commodityImageId;
        this.imageAddress = imageAddress;
        this.addedTime = addedTime;
        this.commodityStyle = commodityStyle;
        this.salesVolume = salesVolume;
        this.cumulativeComment = cumulativeComment;
        this.commodityStock = commodityStock;
        this.commodityFlag = commodityFlag;
        this.commodityBrand = commodityBrand;
        this.commodityFrom = commodityFrom;
        this.commodityMaterial = commodityMaterial;
    }

    public Commodity_Image(int commodityId, int storeId, String commodityName, String commodityDetails, double commodityPrice, String commodityType, String commoditySize, String commodityVersion, int commodityImageId, String imageAddress, String addedTime, String commodityStyle, String salesVolume, String cumulativeComment, String commodityStock, String commodityFlag, String commodityBrand, String commodityFrom, String commodityMaterial) {
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commodityType = commodityType;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityImageId = commodityImageId;
        this.imageAddress = imageAddress;
        this.addedTime = addedTime;
        this.commodityStyle = commodityStyle;
        this.salesVolume = salesVolume;
        this.cumulativeComment = cumulativeComment;
        this.commodityStock = commodityStock;
        this.commodityFlag = commodityFlag;
        this.commodityBrand = commodityBrand;
        this.commodityFrom = commodityFrom;
        this.commodityMaterial = commodityMaterial;
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

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
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

    public String getCommodityFlag() {
        return commodityFlag;
    }

    public void setCommodityFlag(String commodityFlag) {
        this.commodityFlag = commodityFlag;
    }

    public String getCommodityBrand() {
        return commodityBrand;
    }

    public void setCommodityBrand(String commodityBrand) {
        this.commodityBrand = commodityBrand;
    }

    public String getCommodityFrom() {
        return commodityFrom;
    }

    public void setCommodityFrom(String commodityFrom) {
        this.commodityFrom = commodityFrom;
    }

    public String getCommodityMaterial() {
        return commodityMaterial;
    }

    public void setCommodityMaterial(String commodityMaterial) {
        this.commodityMaterial = commodityMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity_Image that = (Commodity_Image) o;
        return commodityId == that.commodityId &&
                storeId == that.storeId &&
                Double.compare(that.commodityPrice, commodityPrice) == 0 &&
                commodityImageId == that.commodityImageId &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(commodityDetails, that.commodityDetails) &&
                Objects.equals(commodityType, that.commodityType) &&
                Objects.equals(commoditySize, that.commoditySize) &&
                Objects.equals(commodityVersion, that.commodityVersion) &&
                Objects.equals(imageAddress, that.imageAddress) &&
                Objects.equals(addedTime, that.addedTime) &&
                Objects.equals(commodityStyle, that.commodityStyle) &&
                Objects.equals(salesVolume, that.salesVolume) &&
                Objects.equals(cumulativeComment, that.cumulativeComment) &&
                Objects.equals(commodityStock, that.commodityStock) &&
                Objects.equals(commodityFlag, that.commodityFlag) &&
                Objects.equals(commodityBrand, that.commodityBrand) &&
                Objects.equals(commodityFrom, that.commodityFrom) &&
                Objects.equals(commodityMaterial, that.commodityMaterial);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityId, storeId, commodityName, commodityDetails, commodityPrice, commodityType, commoditySize, commodityVersion, commodityImageId, imageAddress, addedTime, commodityStyle, salesVolume, cumulativeComment, commodityStock, commodityFlag, commodityBrand, commodityFrom, commodityMaterial);
    }

    @Override
    public String toString() {
        return "Commodity_Image{" +
                "commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityDetails='" + commodityDetails + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityType='" + commodityType + '\'' +
                ", commoditySize='" + commoditySize + '\'' +
                ", commodityVersion='" + commodityVersion + '\'' +
                ", commodityImageId=" + commodityImageId +
                ", imageAddress='" + imageAddress + '\'' +
                ", addedTime='" + addedTime + '\'' +
                ", commodityStyle='" + commodityStyle + '\'' +
                ", salesVolume='" + salesVolume + '\'' +
                ", cumulativeComment='" + cumulativeComment + '\'' +
                ", commodityStock='" + commodityStock + '\'' +
                ", commodityFlag='" + commodityFlag + '\'' +
                ", commodityBrand='" + commodityBrand + '\'' +
                ", commodityFrom='" + commodityFrom + '\'' +
                ", commodityMaterial='" + commodityMaterial + '\'' +
                '}';
    }
}
