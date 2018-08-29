package org.uushopping.pojo;

import java.util.Objects;

/**
 * 系统管理员
 */
public class SuperManager {
    // 系统管理员id
    private int managerId;
    // 用户名
    private String managerName;
    // 用户密码
    private String managerPassword;
    // 性别
    private String managerSex;
    // 年龄
    private int managerAge;
    // 电话
    private String managerPhone;
    // 电子邮箱
    private String managerEmail;
    // qq
    private int managerQQ;
    // 管理员注册时间
    private String managerDate;

    public SuperManager() {
    }

    public SuperManager(String managerName, String managerPassword, String managerSex, int managerAge, String managerPhone, String managerEmail, int managerQQ, String managerDate) {
        this.managerName = managerName;
        this.managerPassword = managerPassword;
        this.managerSex = managerSex;
        this.managerAge = managerAge;
        this.managerPhone = managerPhone;
        this.managerEmail = managerEmail;
        this.managerQQ = managerQQ;
        this.managerDate = managerDate;
    }

    public SuperManager(int managerId, String managerName, String managerPassword, String managerSex, int managerAge, String managerPhone, String managerEmail, int managerQQ, String managerDate) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerPassword = managerPassword;
        this.managerSex = managerSex;
        this.managerAge = managerAge;
        this.managerPhone = managerPhone;
        this.managerEmail = managerEmail;
        this.managerQQ = managerQQ;
        this.managerDate = managerDate;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(String managerSex) {
        this.managerSex = managerSex;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public int getManagerQQ() {
        return managerQQ;
    }

    public void setManagerQQ(int managerQQ) {
        this.managerQQ = managerQQ;
    }

    public String getManagerDate() {
        return managerDate;
    }

    public void setManagerDate(String managerDate) {
        this.managerDate = managerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperManager that = (SuperManager) o;
        return managerId == that.managerId &&
                managerAge == that.managerAge &&
                managerPhone == that.managerPhone &&
                managerQQ == that.managerQQ &&
                Objects.equals(managerName, that.managerName) &&
                Objects.equals(managerPassword, that.managerPassword) &&
                Objects.equals(managerSex, that.managerSex) &&
                Objects.equals(managerEmail, that.managerEmail) &&
                Objects.equals(managerDate, that.managerDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(managerId, managerName, managerPassword, managerSex, managerAge, managerPhone, managerEmail, managerQQ, managerDate);
    }

    @Override
    public String toString() {
        return "SuperManager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                ", managerSex='" + managerSex + '\'' +
                ", managerAge=" + managerAge +
                ", managerPhone=" + managerPhone +
                ", managerEmail='" + managerEmail + '\'' +
                ", managerQQ=" + managerQQ +
                ", managerDate='" + managerDate + '\'' +
                '}';
    }
}
