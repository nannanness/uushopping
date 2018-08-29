package org.uushopping.pojo;

import java.util.Objects;

/**
 * 收货地址表
 */
public class HarvestAddress {
    // 收货地址编号
    private int harvestAddressId;
    // 客户id
    private int userId;
    // 省级
    private String province;
    // 市级
    private String city;
    // 县区
    private String county;
    // 街道补充
    private String street;
    // 收货人
    private String harvestMan;
    // 收获人电话
    private String harvestManPhone;

    public HarvestAddress() {
    }

    public HarvestAddress(int userId, String province, String city, String county, String street, String harvestMan, String harvestManPhone) {
        this.userId = userId;
        this.province = province;
        this.city = city;
        this.county = county;
        this.street = street;
        this.harvestMan = harvestMan;
        this.harvestManPhone = harvestManPhone;
    }

    public HarvestAddress(int harvestAddressId, int userId, String province, String city, String county, String street, String harvestMan, String harvestManPhone) {
        this.harvestAddressId = harvestAddressId;
        this.userId = userId;
        this.province = province;
        this.city = city;
        this.county = county;
        this.street = street;
        this.harvestMan = harvestMan;
        this.harvestManPhone = harvestManPhone;
    }

    public int getHarvestAddressId() {
        return harvestAddressId;
    }

    public void setHarvestAddressId(int harvestAddressId) {
        this.harvestAddressId = harvestAddressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHarvestMan() {
        return harvestMan;
    }

    public void setHarvestMan(String harvestMan) {
        this.harvestMan = harvestMan;
    }

    public String getHarvestManPhone() {
        return harvestManPhone;
    }

    public void setHarvestManPhone(String harvestManPhone) {
        this.harvestManPhone = harvestManPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HarvestAddress that = (HarvestAddress) o;
        return harvestAddressId == that.harvestAddressId &&
                userId == that.userId &&
                harvestManPhone == that.harvestManPhone &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(county, that.county) &&
                Objects.equals(street, that.street) &&
                Objects.equals(harvestMan, that.harvestMan);
    }

    @Override
    public int hashCode() {

        return Objects.hash(harvestAddressId, userId, province, city, county, street, harvestMan, harvestManPhone);
    }

    @Override
    public String toString() {
        return "HarvestAddress{" +
                "harvestAddressId=" + harvestAddressId +
                ", userId=" + userId +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", harvestMan='" + harvestMan + '\'' +
                ", harvestManPhone=" + harvestManPhone +
                '}';
    }
}
