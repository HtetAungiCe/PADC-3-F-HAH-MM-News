package hah.htetaunghlaing.news.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Htet Aung Hlaing on 12/17/2017.
 */

public class NewsVO {

    @SerializedName("news-id")
    private String newsId;

    private String brief;

    private String details;

    @SerializedName("posted-date")
    private String postedDate;

    private List<String> images;

    private PublicationVO publication;

    private List<FavoriteVO> favorites;

    private List<CommentVO> comments;

    @SerializedName("sent-tos")
    private List<SentToVO> sentTos;

    public String getNewsId() {
        return newsId;
    }

    public String getBrief() {
        return brief;
    }

    public String getDetails() {
        return details;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public PublicationVO getPublication() {
        return publication;
    }

    public List<String> getImages() {
        return images;
    }

    public List<FavoriteVO> getFavorites() {
        return favorites;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public List<SentToVO> getSentTos() {
        return sentTos;
    }
}
