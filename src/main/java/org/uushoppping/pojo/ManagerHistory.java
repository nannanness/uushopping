package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 系统管理员的登陆记录表
 */
public class ManagerHistory {
    // 管理员id
    private int managerId;
    // 登录时间
    private String loginDate;
    // 登陆地点
    private String loginPlace;
    // 登陆IP
    private String loginIP;
    // 登陆是否成功
    private String loginFlag;

    public ManagerHistory() {
    }

    public ManagerHistory(String loginDate, String loginPlace, String loginIP, String loginFlag) {
        this.loginDate = loginDate;
        this.loginPlace = loginPlace;
        this.loginIP = loginIP;
        this.loginFlag = loginFlag;
    }

    public ManagerHistory(int managerId, String loginDate, String loginPlace, String loginIP, String loginFlag) {
        this.managerId = managerId;
        this.loginDate = loginDate;
        this.loginPlace = loginPlace;
        this.loginIP = loginIP;
        this.loginFlag = loginFlag;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginPlace() {
        return loginPlace;
    }

    public void setLoginPlace(String loginPlace) {
        this.loginPlace = loginPlace;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerHistory that = (ManagerHistory) o;
        return managerId == that.managerId &&
                Objects.equals(loginDate, that.loginDate) &&
                Objects.equals(loginPlace, that.loginPlace) &&
                Objects.equals(loginIP, that.loginIP) &&
                Objects.equals(loginFlag, that.loginFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(managerId, loginDate, loginPlace, loginIP, loginFlag);
    }

    @Override
    public String toString() {
        return "ManagerHistory{" +
                "managerId=" + managerId +
                ", loginDate='" + loginDate + '\'' +
                ", loginPlace='" + loginPlace + '\'' +
                ", loginIP='" + loginIP + '\'' +
                ", loginFlag='" + loginFlag + '\'' +
                '}';
    }
}
