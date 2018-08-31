package org.uushopping.pojo;

import java.util.Objects;

public class GuestbookBusiness {
    // 评论id
    private int commentId;
    // 商品id
    private int commodityId;
    // 评论者id
    private int userId;
    // 点赞数
    private int likeCount;
    // 评论内容
    private String commentContent;
    // 评论时间
    private String commentDate;
    // 评论等级
    private String commentGrade;
    //评论者名字
    private  String username;

    public GuestbookBusiness() {
    }

    public GuestbookBusiness(int commentId, int commodityId, int userId, int likeCount, String commentContent, String commentDate, String commentGrade, String username) {
        this.commentId = commentId;
        this.commodityId = commodityId;
        this.userId = userId;
        this.likeCount = likeCount;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.commentGrade = commentGrade;
        this.username = username;
    }

    public GuestbookBusiness(int commentId, int commodityId, int likeCount, String commentContent, String commentDate, String commentGrade, String username) {
        this.commentId = commentId;
        this.commodityId = commodityId;
        this.likeCount = likeCount;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.commentGrade = commentGrade;
        this.username = username;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentGrade() {
        return commentGrade;
    }

    public void setCommentGrade(String commentGrade) {
        this.commentGrade = commentGrade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestbookBusiness that = (GuestbookBusiness) o;
        return commentId == that.commentId &&
                commodityId == that.commodityId &&
                userId == that.userId &&
                likeCount == that.likeCount &&
                Objects.equals(commentContent, that.commentContent) &&
                Objects.equals(commentDate, that.commentDate) &&
                Objects.equals(commentGrade, that.commentGrade) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, commodityId, userId, likeCount, commentContent, commentDate, commentGrade, username);
    }

    @Override
    public String toString() {
        return "GuestbookBusiness{" +
                "commentId=" + commentId +
                ", commodityId=" + commodityId +
                ", userId=" + userId +
                ", likeCount=" + likeCount +
                ", commentContent='" + commentContent + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", commentGrade='" + commentGrade + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
