package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 商品分类表
 */
public class CommodityType {
    // 商品分类
    private int commodityTypeId;
    // 一级分类
    private String primaryClassification;
    // 二级分类
    private String secondaryClassification;

    public CommodityType() {
    }

    public CommodityType(String primaryClassification, String secondaryClassification) {
        this.primaryClassification = primaryClassification;
        this.secondaryClassification = secondaryClassification;
    }

    public CommodityType(int commodityTypeId, String primaryClassification, String secondaryClassification) {
        this.commodityTypeId = commodityTypeId;
        this.primaryClassification = primaryClassification;
        this.secondaryClassification = secondaryClassification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommodityType that = (CommodityType) o;
        return commodityTypeId == that.commodityTypeId &&
                Objects.equals(primaryClassification, that.primaryClassification) &&
                Objects.equals(secondaryClassification, that.secondaryClassification);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityTypeId, primaryClassification, secondaryClassification);
    }

    @Override
    public String toString() {
        return "CommodityType{" +
                "commodityTypeId=" + commodityTypeId +
                ", primaryClassification='" + primaryClassification + '\'' +
                ", secondaryClassification='" + secondaryClassification + '\'' +
                '}';
    }
}
