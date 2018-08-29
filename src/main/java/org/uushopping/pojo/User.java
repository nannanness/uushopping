package org.uushopping.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * 客户表
 */
public class User {
    // 客户id
    private int userId;
    // 客户昵称
    private String username;
    // 客户密码
    private String userPassword;
    // 密保问题
    private int securityQuestionId;
    // 客户头像
    private String userAvatar;
    // 客户性别
    private String sex;
    // 客户电话
    private String userPhone;
    // 客户地址
    private String userAddress;
    // 客户邮箱
    private String userEmail;
    // 客户状态 用来标识客户是否做了哪些操作
    private int userFlag;
    // 注册时间
    private Date userRegistrationDate;
    // 用户浏览次数
    private int userLookCount;

    public User() {
    }

    public User(int userId, String username, String userPassword, int securityQuestionId, String userAvatar, String sex, String userPhone, String userAddress, String userEmail, int userFlag, Date userRegistrationDate, int userLookCount) {
        this.userId = userId;
        this.username = username;
        this.userPassword = userPassword;
        this.securityQuestionId = securityQuestionId;
        this.userAvatar = userAvatar;
        this.sex = sex;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userFlag = userFlag;
        this.userRegistrationDate = userRegistrationDate;
        this.userLookCount = userLookCount;
    }

    public User(String username, String userPassword, int securityQuestionId, String userAvatar, String sex, String userPhone, String userAddress, String userEmail, int userFlag, Date userRegistrationDate, int userLookCount) {
        this.username = username;
        this.userPassword = userPassword;
        this.securityQuestionId = securityQuestionId;
        this.userAvatar = userAvatar;
        this.sex = sex;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userFlag = userFlag;
        this.userRegistrationDate = userRegistrationDate;
        this.userLookCount = userLookCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getSecurityQuestionId() {
        return securityQuestionId;
    }

    public void setSecurityQuestionId(int securityQuestionId) {
        this.securityQuestionId = securityQuestionId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(int userFlag) {
        this.userFlag = userFlag;
    }

    public Date getUserRegistrationDate() {
        return userRegistrationDate;
    }

    public void setUserRegistrationDate(Date userRegistrationDate) {
        this.userRegistrationDate = userRegistrationDate;
    }

    public int getUserLookCount() {
        return userLookCount;
    }

    public void setUserLookCount(int userLookCount) {
        this.userLookCount = userLookCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                securityQuestionId == user.securityQuestionId &&
                userFlag == user.userFlag &&
                userLookCount == user.userLookCount &&
                Objects.equals(username, user.username) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(userAvatar, user.userAvatar) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(userPhone, user.userPhone) &&
                Objects.equals(userAddress, user.userAddress) &&
                Objects.equals(userEmail, user.userEmail) &&
                Objects.equals(userRegistrationDate, user.userRegistrationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, username, userPassword, securityQuestionId, userAvatar, sex, userPhone, userAddress, userEmail, userFlag, userRegistrationDate, userLookCount);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", securityQuestionId=" + securityQuestionId +
                ", userAvatar='" + userAvatar + '\'' +
                ", sex='" + sex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userFlag=" + userFlag +
                ", userRegistrationDate=" + userRegistrationDate +
                ", userLookCount=" + userLookCount +
                '}';
    }
}
