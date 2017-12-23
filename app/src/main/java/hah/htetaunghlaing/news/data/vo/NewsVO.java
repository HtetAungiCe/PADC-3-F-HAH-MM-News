package hah.htetaunghlaing.news.data.vo;

import java.util.List;

/**
 * Created by Htet Aung Hlaing on 12/17/2017.
 */

public class NewsVO {

    private String newsId;
    private String btiefd;
    private String details;
    private String postedDate;

    private List<String> images;

    private PublicationVO publication;

    private List<FavoriteVO> favorites;
    private List<CommentVO> comments;
    private List<SentToVO> sentTos;

    public String getNewsId() {
        return newsId;
    }

    public String getBtiefd() {
        return btiefd;
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
