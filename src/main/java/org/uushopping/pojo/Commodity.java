package org.uushopping.pojo;

import java.util.Objects;

/**
 * 商品表
 */
public class Commodity {
    // 商品id
    private int commodityId;
    // 商品店铺
    private int storeId;
    // 商品名称
    private String commodityName;
    // 商品详细信息（商品介绍）
    private String commodityDetails;
    // 商品单价
    private int commodityPrice;
    // 商品分类
    private int commodityTypeId;
    // 商品尺寸
    private String commoditySize;
    // 商品版本
    private String commodityVersion;
    // 商品图片
    private int commodityImageId;
    // 上架时间
    private String addedTime;
    // 商品款式
    private String commodityStyle;
    // 累计销量
    private int salesVolume;
    // 累计评论
    private int cumulativeComment;
    // 商品库存
    private int commodityStock;
    // 商品状态
    private String commodityFlag;
    // 商品品牌
    private String commodityBrand;
    // 产地
    private String commodityFrom;
    // 材质
    private String commodityMaterial;

    public Commodity() {
    }

    public Commodity(int storeId, String commodityName, String commodityDetails, int commodityPrice, int commodityTypeId, String commoditySize, String commodityVersion, int commodityImageId, String addedTime, String commodityStyle, int salesVolume, int cumulativeComment, int commodityStock, String commodityFlag, String commodityBrand, String commodityFrom, String commodityMaterial) {
        this.storeId = storeId;
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commodityTypeId = commodityTypeId;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityImageId = commodityImageId;
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

    public Commodity(int commodityId, int storeId, String commodityName, String commodityDetails, int commodityPrice, int commodityTypeId, String commoditySize, String commodityVersion, int commodityImageId, String addedTime, String commodityStyle, int salesVolume, int cumulativeComment, int commodityStock, String commodityFlag, String commodityBrand, String commodityFrom, String commodityMaterial) {
        this.commodityId = commodityId;
        this.storeId = storeId;
        this.commodityName = commodityName;
        this.commodityDetails = commodityDetails;
        this.commodityPrice = commodityPrice;
        this.commodityTypeId = commodityTypeId;
        this.commoditySize = commoditySize;
        this.commodityVersion = commodityVersion;
        this.commodityImageId = commodityImageId;
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

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(int commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public int getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(int commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
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

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public int getCumulativeComment() {
        return cumulativeComment;
    }

    public void setCumulativeComment(int cumulativeComment) {
        this.cumulativeComment = cumulativeComment;
    }

    public int getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(int commodityStock) {
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
        Commodity commodity = (Commodity) o;
        return commodityId == commodity.commodityId &&
                storeId == commodity.storeId &&
                commodityPrice == commodity.commodityPrice &&
                commodityTypeId == commodity.commodityTypeId &&
                commodityImageId == commodity.commodityImageId &&
                salesVolume == commodity.salesVolume &&
                cumulativeComment == commodity.cumulativeComment &&
                commodityStock == commodity.commodityStock &&
                Objects.equals(commodityName, commodity.commodityName) &&
                Objects.equals(commodityDetails, commodity.commodityDetails) &&
                Objects.equals(commoditySize, commodity.commoditySize) &&
                Objects.equals(commodityVersion, commodity.commodityVersion) &&
                Objects.equals(addedTime, commodity.addedTime) &&
                Objects.equals(commodityStyle, commodity.commodityStyle) &&
                Objects.equals(commodityFlag, commodity.commodityFlag) &&
                Objects.equals(commodityBrand, commodity.commodityBrand) &&
                Objects.equals(commodityFrom, commodity.commodityFrom) &&
                Objects.equals(commodityMaterial, commodity.commodityMaterial);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityId, storeId, commodityName, commodityDetails, commodityPrice, commodityTypeId, commoditySize, commodityVersion, commodityImageId, addedTime, commodityStyle, salesVolume, cumulativeComment, commodityStock, commodityFlag, commodityBrand, commodityFrom, commodityMaterial);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", storeId=" + storeId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityDetails='" + commodityDetails + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityTypeId=" + commodityTypeId +
                ", commoditySize='" + commoditySize + '\'' +
                ", commodityVersion='" + commodityVersion + '\'' +
                ", commodityImageId=" + commodityImageId +
                ", addedTime='" + addedTime + '\'' +
                ", commodityStyle='" + commodityStyle + '\'' +
                ", salesVolume=" + salesVolume +
                ", cumulativeComment=" + cumulativeComment +
                ", commodityStock=" + commodityStock +
                ", commodityFlag='" + commodityFlag + '\'' +
                ", commodityBrand='" + commodityBrand + '\'' +
                ", commodityFrom='" + commodityFrom + '\'' +
                ", commodityMaterial='" + commodityMaterial + '\'' +
                '}';
    }
}
