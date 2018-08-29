package org.uushopping.pojo;

import java.util.Objects;

/**
 * 收藏店铺表
 */
public class CollectionStore {
    // 收藏id
    private int collectionId;
    // 店铺
    private int storeId;

    public CollectionStore() {
    }

    public CollectionStore(int collectionId, int storeId) {
        this.collectionId = collectionId;
        this.storeId = storeId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionStore that = (CollectionStore) o;
        return collectionId == that.collectionId &&
                storeId == that.storeId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(collectionId, storeId);
    }

    @Override
    public String toString() {
        return "CollectionStore{" +
                "collectionId=" + collectionId +
                ", storeId=" + storeId +
                '}';
    }
}
