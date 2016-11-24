package com.example.domain;

import java.time.LocalDateTime;

/**
 * Created by 77060 on 2016/11/21.
 */
// 网站是匿名评论，及投票，存储UserId即可
public class BasicComment {
    private int id;
    private String comment;
    private LocalDateTime cTime;
    private int upvote;
    private int downvote;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getcTime() {
        return cTime;
    }

    public void setcTime(LocalDateTime cTime) {
        this.cTime = cTime;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDownvote() {
        return downvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }
}
