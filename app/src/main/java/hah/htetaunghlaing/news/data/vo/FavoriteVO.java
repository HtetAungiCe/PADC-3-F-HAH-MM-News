package hah.htetaunghlaing.news.data.vo;

/**
 * Created by Htet Aung Hlaing on 12/17/2017.
 */

public class FavoriteVO {
    private String favoriteId;
    private String favoriteDate;
    private ActedUserVO actedUser;

    public String getFavoriteId() {
        return favoriteId;
    }

    public String getFavoriteDate() {
        return favoriteDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
