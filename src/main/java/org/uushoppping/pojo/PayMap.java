package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 支付方式列表
 */
public class PayMap {
    // 支付id
    private int payId;
    // 支付类型
    private String payType;
    // 支付状态
    private String payFlag;
    // 所属用户
    private int userId;
    // 账户余额
    private int paymentBalance;

    public PayMap() {
    }

    public PayMap(String payType, String payFlag, int userId, int paymentBalance) {
        this.payType = payType;
        this.payFlag = payFlag;
        this.userId = userId;
        this.paymentBalance = paymentBalance;
    }

    public PayMap(int payId, String payType, String payFlag, int userId, int paymentBalance) {
        this.payId = payId;
        this.payType = payType;
        this.payFlag = payFlag;
        this.userId = userId;
        this.paymentBalance = paymentBalance;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPaymentBalance() {
        return paymentBalance;
    }

    public void setPaymentBalance(int paymentBalance) {
        this.paymentBalance = paymentBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayMap payMap = (PayMap) o;
        return payId == payMap.payId &&
                userId == payMap.userId &&
                paymentBalance == payMap.paymentBalance &&
                Objects.equals(payType, payMap.payType) &&
                Objects.equals(payFlag, payMap.payFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(payId, payType, payFlag, userId, paymentBalance);
    }

    @Override
    public String toString() {
        return "PayMap{" +
                "payId=" + payId +
                ", payType='" + payType + '\'' +
                ", payFlag='" + payFlag + '\'' +
                ", userId=" + userId +
                ", paymentBalance=" + paymentBalance +
                '}';
    }
}
