package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 店铺表
 */
public class Store {
    // 店铺id
    private int storeId;
    // 店铺名称
    private String storeName;
    // 分类
    private String storeSort;
    // 店铺图片
    private String storeLogo;
    // 简介
    private String storeIntroduction;
    // 创建时间
    private String storeDate;
    // 审核状态
    private String storeFlag;
    // 登陆密码
    private String storePassword;
    // 商店负责人
    private String storeMan;
    // 联系电话
    private int storePhone;
    // 邮箱地址
    private String storeEmail;

    public Store() {
    }

    public Store(String storeName, String storeSort, String storeLogo, String storeIntroduction, String storeDate, String storeFlag, String storePassword, String storeMan, int storePhone, String storeEmail) {
        this.storeName = storeName;
        this.storeSort = storeSort;
        this.storeLogo = storeLogo;
        this.storeIntroduction = storeIntroduction;
        this.storeDate = storeDate;
        this.storeFlag = storeFlag;
        this.storePassword = storePassword;
        this.storeMan = storeMan;
        this.storePhone = storePhone;
        this.storeEmail = storeEmail;
    }

    public Store(int storeId, String storeName, String storeSort, String storeLogo, String storeIntroduction, String storeDate, String storeFlag, String storePassword, String storeMan, int storePhone, String storeEmail) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeSort = storeSort;
        this.storeLogo = storeLogo;
        this.storeIntroduction = storeIntroduction;
        this.storeDate = storeDate;
        this.storeFlag = storeFlag;
        this.storePassword = storePassword;
        this.storeMan = storeMan;
        this.storePhone = storePhone;
        this.storeEmail = storeEmail;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreSort() {
        return storeSort;
    }

    public void setStoreSort(String storeSort) {
        this.storeSort = storeSort;
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    public String getStoreIntroduction() {
        return storeIntroduction;
    }

    public void setStoreIntroduction(String storeIntroduction) {
        this.storeIntroduction = storeIntroduction;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }

    public String getStoreFlag() {
        return storeFlag;
    }

    public void setStoreFlag(String storeFlag) {
        this.storeFlag = storeFlag;
    }

    public String getStorePassword() {
        return storePassword;
    }

    public void setStorePassword(String storePassword) {
        this.storePassword = storePassword;
    }

    public String getStoreMan() {
        return storeMan;
    }

    public void setStoreMan(String storeMan) {
        this.storeMan = storeMan;
    }

    public int getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(int storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return storeId == store.storeId &&
                storePhone == store.storePhone &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(storeSort, store.storeSort) &&
                Objects.equals(storeLogo, store.storeLogo) &&
                Objects.equals(storeIntroduction, store.storeIntroduction) &&
                Objects.equals(storeDate, store.storeDate) &&
                Objects.equals(storeFlag, store.storeFlag) &&
                Objects.equals(storePassword, store.storePassword) &&
                Objects.equals(storeMan, store.storeMan) &&
                Objects.equals(storeEmail, store.storeEmail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(storeId, storeName, storeSort, storeLogo, storeIntroduction, storeDate, storeFlag, storePassword, storeMan, storePhone, storeEmail);
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeSort='" + storeSort + '\'' +
                ", storeLogo='" + storeLogo + '\'' +
                ", storeIntroduction='" + storeIntroduction + '\'' +
                ", storeDate='" + storeDate + '\'' +
                ", storeFlag='" + storeFlag + '\'' +
                ", storePassword='" + storePassword + '\'' +
                ", storeMan='" + storeMan + '\'' +
                ", storePhone=" + storePhone +
                ", storeEmail='" + storeEmail + '\'' +
                '}';
    }
}
