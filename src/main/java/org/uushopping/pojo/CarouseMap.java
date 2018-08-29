package org.uushopping.pojo;

import java.util.Objects;

/**
 * 首页轮播图
 */
public class CarouseMap {
    // 轮播图id
    private int carouselMapId;
    // 轮播图序号
    private int carouselMapOrder;
    // 轮播图地址
    private String carouselMapAddress;
    // 修改时间
    private String carouselMapDate;

    public CarouseMap() {
    }

    public CarouseMap(int carouselMapOrder, String carouselMapAddress, String carouselMapDate) {
        this.carouselMapOrder = carouselMapOrder;
        this.carouselMapAddress = carouselMapAddress;
        this.carouselMapDate = carouselMapDate;
    }

    public CarouseMap(int carouselMapId, int carouselMapOrder, String carouselMapAddress, String carouselMapDate) {
        this.carouselMapId = carouselMapId;
        this.carouselMapOrder = carouselMapOrder;
        this.carouselMapAddress = carouselMapAddress;
        this.carouselMapDate = carouselMapDate;
    }

    public int getCarouselMapId() {
        return carouselMapId;
    }

    public void setCarouselMapId(int carouselMapId) {
        this.carouselMapId = carouselMapId;
    }

    public int getCarouselMapOrder() {
        return carouselMapOrder;
    }

    public void setCarouselMapOrder(int carouselMapOrder) {
        this.carouselMapOrder = carouselMapOrder;
    }

    public String getCarouselMapAddress() {
        return carouselMapAddress;
    }

    public void setCarouselMapAddress(String carouselMapAddress) {
        this.carouselMapAddress = carouselMapAddress;
    }

    public String getCarouselMapDate() {
        return carouselMapDate;
    }

    public void setCarouselMapDate(String carouselMapDate) {
        this.carouselMapDate = carouselMapDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarouseMap that = (CarouseMap) o;
        return carouselMapId == that.carouselMapId &&
                carouselMapOrder == that.carouselMapOrder &&
                Objects.equals(carouselMapAddress, that.carouselMapAddress) &&
                Objects.equals(carouselMapDate, that.carouselMapDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carouselMapId, carouselMapOrder, carouselMapAddress, carouselMapDate);
    }

    @Override
    public String toString() {
        return "CarouseMap{" +
                "carouselMapId=" + carouselMapId +
                ", carouselMapOrder=" + carouselMapOrder +
                ", carouselMapAddress='" + carouselMapAddress + '\'' +
                ", carouselMapDate='" + carouselMapDate + '\'' +
                '}';
    }
}
