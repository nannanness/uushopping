package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 点赞表
 */
public class Like {
    // 评论id
    private int commentId;
    // 点赞者
    private int userId;

    public Like() {
    }

    public Like(int userId) {
        this.userId = userId;
    }

    public Like(int commentId, int userId) {
        this.commentId = commentId;
        this.userId = userId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return commentId == like.commentId &&
                userId == like.userId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, userId);
    }

    @Override
    public String toString() {
        return "Like{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                '}';
    }
}
