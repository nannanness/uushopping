package org.uushopping.pojo;

import java.util.Objects;

/**
 * 购物车：ShopCar
 */
public class ShopCar {
    // 购物车id
    private int shopCarId;
    // 客户id
    private int userId;
    // 购物车总金额
    private int shopCarAmount;

    public ShopCar() {
    }

    public ShopCar(int userId, int shopCarAmount) {
        this.userId = userId;
        this.shopCarAmount = shopCarAmount;
    }

    public ShopCar(int shopCarId, int userId, int shopCarAmount) {
        this.shopCarId = shopCarId;
        this.userId = userId;
        this.shopCarAmount = shopCarAmount;
    }

    public int getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(int shopCarId) {
        this.shopCarId = shopCarId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getShopCarAmount() {
        return shopCarAmount;
    }

    public void setShopCarAmount(int shopCarAmount) {
        this.shopCarAmount = shopCarAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopCar shopCar = (ShopCar) o;
        return shopCarId == shopCar.shopCarId &&
                userId == shopCar.userId &&
                shopCarAmount == shopCar.shopCarAmount;
    }

    @Override
    public int hashCode() {

        return Objects.hash(shopCarId, userId, shopCarAmount);
    }

    @Override
    public String toString() {
        return "ShopCar{" +
                "shopCarId=" + shopCarId +
                ", userId=" + userId +
                ", shopCarAmount=" + shopCarAmount +
                '}';
    }
}
