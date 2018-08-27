package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 收藏表
 */
public class Favorites {
    // 收藏id
    private int collectionId;
    // 收藏者id
    private int userId;
    // 收藏类型
    private String collectionType;

    public Favorites(int userId, String collectionType) {
        this.userId = userId;
        this.collectionType = collectionType;
    }

    public Favorites(int collectionId, int userId, String collectionType) {
        this.collectionId = collectionId;
        this.userId = userId;
        this.collectionType = collectionType;
    }

    public Favorites() {
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorites favorites = (Favorites) o;
        return collectionId == favorites.collectionId &&
                userId == favorites.userId &&
                Objects.equals(collectionType, favorites.collectionType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(collectionId, userId, collectionType);
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "collectionId=" + collectionId +
                ", userId=" + userId +
                ", collectionType='" + collectionType + '\'' +
                '}';
    }
}
