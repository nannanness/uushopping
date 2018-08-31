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
    // 当前用户购物车商品数量
    private int shopCarComdiAmount;

    public ShopCar() {
    }

    public ShopCar(int userId, int shopCarComdiAmount) {
        this.userId = userId;
        this.shopCarComdiAmount = shopCarComdiAmount;
    }

    public ShopCar(int shopCarId, int userId, int shopCarComdiAmount) {
        this.shopCarId = shopCarId;
        this.userId = userId;
        this.shopCarComdiAmount = shopCarComdiAmount;
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

    public int getshopCarComdiAmount() {
        return shopCarComdiAmount;
    }

    public void setshopCarComdiAmount(int shopCarComdiAmount) {
        this.shopCarComdiAmount = shopCarComdiAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopCar shopCar = (ShopCar) o;
        return shopCarId == shopCar.shopCarId &&
                userId == shopCar.userId &&
                shopCarComdiAmount == shopCar.shopCarComdiAmount;
    }

    @Override
    public int hashCode() {

        return Objects.hash(shopCarId, userId, shopCarComdiAmount);
    }

    @Override
    public String toString() {
        return "ShopCar{" +
                "shopCarId=" + shopCarId +
                ", userId=" + userId +
                ", shopCarComdiAmount=" + shopCarComdiAmount +
                '}';
    }
}
