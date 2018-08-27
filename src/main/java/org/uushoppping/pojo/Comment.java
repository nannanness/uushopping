package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 评论表
 */
public class Comment {
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
    // 购买时间
    private String paymentDate;
    // 评论等级
    private String commentGrade;

    public Comment() {
    }

    public Comment(int commodityId, int userId, int likeCount, String commentContent, String commentDate, String paymentDate, String commentGrade) {
        this.commodityId = commodityId;
        this.userId = userId;
        this.likeCount = likeCount;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.paymentDate = paymentDate;
        this.commentGrade = commentGrade;
    }

    public Comment(int commentId, int commodityId, int userId, int likeCount, String commentContent, String commentDate, String paymentDate, String commentGrade) {
        this.commentId = commentId;
        this.commodityId = commodityId;
        this.userId = userId;
        this.likeCount = likeCount;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.paymentDate = paymentDate;
        this.commentGrade = commentGrade;
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

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCommentGrade() {
        return commentGrade;
    }

    public void setCommentGrade(String commentGrade) {
        this.commentGrade = commentGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return commentId == comment.commentId &&
                commodityId == comment.commodityId &&
                userId == comment.userId &&
                likeCount == comment.likeCount &&
                Objects.equals(commentContent, comment.commentContent) &&
                Objects.equals(commentDate, comment.commentDate) &&
                Objects.equals(paymentDate, comment.paymentDate) &&
                Objects.equals(commentGrade, comment.commentGrade);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, commodityId, userId, likeCount, commentContent, commentDate, paymentDate, commentGrade);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commodityId=" + commodityId +
                ", userId=" + userId +
                ", likeCount=" + likeCount +
                ", commentContent='" + commentContent + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", commentGrade='" + commentGrade + '\'' +
                '}';
    }
}
