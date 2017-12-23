package hah.htetaunghlaing.news.data.vo;

/**
 * Created by Htet Aung Hlaing on 12/17/2017.
 */

public class SentToVO {
    private String sendToId;
    private String sentToDate;

    private ActedUserVO actedUser;
    private ActedUserVO receivedUser;

    public String getSendToId() {
        return sendToId;
    }

    public String getSentToDate() {
        return sentToDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }

    public ActedUserVO getReceivedUser() {
        return receivedUser;
    }
}
