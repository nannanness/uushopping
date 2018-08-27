package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 晒单表
 */
public class SunDrying {
    // 评论id
    private int commentId;
    // 图片路径
    private String sunPath;

    public SunDrying() {
    }

    public SunDrying(String sunPath) {
        this.sunPath = sunPath;
    }

    public SunDrying(int commentId, String sunPath) {
        this.commentId = commentId;
        this.sunPath = sunPath;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getSunPath() {
        return sunPath;
    }

    public void setSunPath(String sunPath) {
        this.sunPath = sunPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SunDrying sunDrying = (SunDrying) o;
        return commentId == sunDrying.commentId &&
                Objects.equals(sunPath, sunDrying.sunPath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, sunPath);
    }

    @Override
    public String toString() {
        return "SunDrying{" +
                "commentId=" + commentId +
                ", sunPath='" + sunPath + '\'' +
                '}';
    }
}
