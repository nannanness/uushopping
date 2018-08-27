package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 收藏商品表
 */
public class CollectionCommodity {
    // 收藏id
    private int collectionId;
    // 商品
    private int commodityId;

    public CollectionCommodity() {
    }

    public CollectionCommodity(int collectionId, int commodityId) {
        this.collectionId = collectionId;
        this.commodityId = commodityId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionCommodity that = (CollectionCommodity) o;
        return collectionId == that.collectionId &&
                commodityId == that.commodityId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(collectionId, commodityId);
    }

    @Override
    public String toString() {
        return "CollectionCommodity{" +
                "collectionId=" + collectionId +
                ", commodityId=" + commodityId +
                '}';
    }
}