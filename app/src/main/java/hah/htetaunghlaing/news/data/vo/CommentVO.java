package hah.htetaunghlaing.news.data.vo;

/**
 * Created by Htet Aung Hlaing on 12/17/2017.
 */

public class CommentVO {
    private String commentId;
    private String comment;
    private String commentDate;

    private ActedUserVO actedUser;

    public String getCommentId() {
        return commentId;
    }

    public String getComment() {
        return comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
